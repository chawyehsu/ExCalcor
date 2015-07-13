grammar ExCalcor;

@header {
import java.lang.Math;
import java.math.MathContext;
import java.math.BigDecimal;
}

/**
 * 语法规则(Paser rules)
 */

// 程序：至少一条语句
prog
  :  statement+
  ;

// 语句：即泛指程序中所有形式的语句(赋值语句、表达式语句，etc)，优先级：最低
statement
  // 赋值语句，不输出任何信息
  :  assignment NEWLINE
  // 删除变量
  | removeVariable NEWLINE
  // 表达式语句，输出表达式计算结果
  |  expression NEWLINE {
       if ($expression.value != null) {
         System.out.println($expression.value);
       }
     }
  // 空语句，不做任何操作
  |  NEWLINE
  ;

// 删除变量
removeVariable
  :  VARIABLE '=' '[' ']' {
       if (ExCalcorRunner.memory.get($VARIABLE.text) != null) {
         ExCalcorRunner.memory.remove($VARIABLE.text);
         System.out.println("Variable '".concat($VARIABLE.text).concat("' has been removed."));
       } else {
         System.err.println("[Err]Variable '".concat($VARIABLE.text).concat("' never defined."));
       }
     }
  ;

// 赋值语句：定义变量并赋初值，优先级：13
assignment
  :  VARIABLE '=' expression {
       ExCalcorRunner.memory.put($VARIABLE.text, $expression.value);
     }
  ;

// 表达式：即泛指所有表达式语句，优先级：12
expression returns [BigDecimal value]
  :  condExpr {
       $value = $condExpr.value;
     }
  ;

// 选择表达式：唯一的三目算符(?:)，右结合，优先级：11
condExpr returns [BigDecimal value]
  :  a = orExpr {
       $value = $a.value;
     } (  '?' b = expression ':' c = expression {
            // 如果 a 的值不等于零(即为真值)，则返回 b 的值
            if ($a.value.compareTo(BigDecimal.ZERO) != 0) {
              $value = $b.value;
            // 否则返回 c 的值
            } else {
              $value = $c.value;
            }
          }
       )?
  ;

// 逻辑或表达式：双目算符，左结合，优先级：10
orExpr returns [BigDecimal value]
  :  a = andExpr {
       $value = $a.value;
     } (  '||' b = andExpr {
            // 任意一个不等于零则返回1(true)
            if (($a.value.compareTo(BigDecimal.ZERO) != 0) || 
                ($b.value.compareTo(BigDecimal.ZERO) != 0)) {
              $value = new BigDecimal(1, new MathContext(15));
            // 否则则返回0(false)
            } else {
              $value = new BigDecimal(0, new MathContext(15));
            }
          }
       )*
  ;

// 逻辑与表达式：双目算符，左结合，优先级：9
andExpr returns [BigDecimal value]
  :  a = equalityExpr {
       $value = $a.value;
     } (  '&&' b = equalityExpr {
            // 两个均不等于零则返回1(true)
            if (($a.value.compareTo(BigDecimal.ZERO) != 0) && 
                ($b.value.compareTo(BigDecimal.ZERO) != 0)) {
              $value = new BigDecimal(1, new MathContext(15));
            // 否则则返回0(false)
            } else {
              $value = new BigDecimal(0, new MathContext(15));
            }
       }
     )*
  ;

// 匹配表达式：等于、不等于，双目算符，左结合，优先级：8
equalityExpr returns [BigDecimal value]
  :  a = comparisonExpr {
       $value = $a.value;
     } (  '==' b = comparisonExpr {
            // 如果等于则返回1(true)
            if ($a.value.compareTo($b.value) == 0) {
              $value = new BigDecimal(1, new MathContext(15));
            // 否则则返回0(false)
            } else {
              $value = new BigDecimal(0, new MathContext(15));
            }
          }
       |  '!=' b = comparisonExpr {
            // 如果不等于则返回1(true)
            if ($a.value.compareTo($b.value) != 0) {
              $value = new BigDecimal(1, new MathContext(15));
            // 否则则返回0(false)
            } else {
              $value = new BigDecimal(0, new MathContext(15));
            }
          }
       )*
  ;

// 比较表达式：大于、小于、大于等于、小于等于，双目算符，左结合，优先级：7
comparisonExpr returns [BigDecimal value]
  :  a = addiExpr {
       $value = $a.value;
     } (  '>' b = addiExpr {
            // 如果大于则返回1(true)
            if ($a.value.compareTo($b.value) == 1) {
              $value = new BigDecimal(1, new MathContext(15));
            // 否则则返回0(false)
            } else {
              $value = new BigDecimal(0, new MathContext(15));
            }
          }
       |  '<' b = addiExpr {
            // 如果小于则返回1(true)
            if ($a.value.compareTo($b.value) == -1) {
              $value = new BigDecimal(1, new MathContext(15));
            // 否则则返回0(false)
            } else {
              $value = new BigDecimal(0, new MathContext(15));
            }
          }
       |  '>=' b = addiExpr {
            // 如果大于等于则返回1(true)
            if (($a.value.compareTo($b.value) == 1) || ($a.value.compareTo($b.value) == 0)) {
              $value = new BigDecimal(1, new MathContext(15));
            // 否则则返回0(false)
            } else {
              $value = new BigDecimal(0, new MathContext(15));
            }
          }
       |  '<=' b = addiExpr {
            // 如果小于等于则返回1(true)
            if (($a.value.compareTo($b.value) == -1) || ($a.value.compareTo($b.value) == 0)) {
              $value = new BigDecimal(1, new MathContext(15));
            // 否则则返回0(false)
            } else {
              $value = new BigDecimal(0, new MathContext(15));
            }
          }
       )*
  ;

// 加减表达式：加法、减法，双目算符，左结合，优先级：6
addiExpr returns [BigDecimal value]
  :  a = multExpr {
       $value = $a.value;
     } (  '+' b = multExpr {
            // 使用 BigDecimal 对象自有的加法函数：add()。see: java.math.BigDecimal
            $value = $a.value.add($b.value, new MathContext(15));
          }
       |  '-' b = multExpr {
            // 使用 BigDecimal 对象自有的减法函数：subtract()。see: java.math.BigDecimal
            $value = $a.value.subtract($b.value, new MathContext(15));
          }
       )*
  ;

// 乘除余表达式：乘法、除法、取余，双目算符，左结合，优先级：5
multExpr returns [BigDecimal value]
  :  a = unaryExpr {
       $value = $a.value;
     } (  '*' b = unaryExpr {
            // 使用 BigDecimal 对象自有的乘法函数：multiply()。see: java.math.BigDecimal
            $value = $a.value.multiply($b.value, new MathContext(15));
          }
       |  '/' b = unaryExpr {
            // 使用 BigDecimal 对象自有的除法函数：divide()。see: java.math.BigDecimal
            $value = $a.value.divide($b.value, new MathContext(15));
          }
       |  '%' b = unaryExpr {
            // 使用 BigDecimal 对象自有的取余函数：remainder()。see: java.math.BigDecimal
            $value = $a.value.remainder($b.value, new MathContext(15));
          }
       )*
  ;

// 单目运算表达式：取反算符、逻辑非算符，右结合，优先级：3
unaryExpr returns [BigDecimal value]
  :  '-' primary {
       // 使用 BigDecimal 对象自有的取反方法：negate()。see: java.math.BigDecimal
       $value = $primary.value.negate(new MathContext(15));
     }  
  |  '!' primary {
       // 如果等于零则返回1
       if ($primary.value.compareTo(BigDecimal.ZERO) == 0) {
         $value = new BigDecimal(1, new MathContext(15));
       // 否则则返回0
       } else {
         $value = new BigDecimal(0, new MathContext(15));
       }
     }
  |  primary {
       $value = $primary.value;
     }
  ;

// 内置函数运算，优先级：2
builtInFunc returns [BigDecimal value]
  :  BUILTINFUNC brackets {
       MathContext mc = new MathContext(15);
       // 匹配 sin
       if ($BUILTINFUNC.text.equals("sin")) {
         double d = Math.sin(
           Double.parseDouble($brackets.value.toPlainString()));
         $value = new BigDecimal(d, mc);
       }
       // 匹配 cos
       if ($BUILTINFUNC.text.equals("cos")) {
         double d = Math.cos(
           Double.parseDouble($brackets.value.toPlainString()));
         $value = new BigDecimal(d, mc);
       }
       // 匹配 tan
       if ($BUILTINFUNC.text.equals("tan")) {
         double d = Math.tan(
           Double.parseDouble($brackets.value.toPlainString()));
         $value = new BigDecimal(d, mc);
       }
       // 匹配 sqrt
       if ($BUILTINFUNC.text.equals("sqrt")) {
         double d = Math.sqrt(
           Double.parseDouble($brackets.value.toPlainString()));
         $value = new BigDecimal(d, mc);
       }
     }
  |  BUILTINFUNC '(' a = expression ',' b = expression ')' {
       if ($BUILTINFUNC.text.equals("max")) {
         if ($a.value.compareTo($b.value) == 1) {
           $value = $a.value;
         } else {
           $value = $b.value;
         }
       }
       if ($BUILTINFUNC.text.equals("min")) {
         if ($a.value.compareTo($b.value) == 1) {
           $value = $b.value;
         } else {
           $value = $a.value;
         }
       }
     }
  ;

// 圆括号运算符：可改变运算优先级，优先级：1 (最高优先级)
brackets returns [BigDecimal value]
  : '(' expression ')' {
      $value = $expression.value;
    }
  ;

// 基本项：原子项或圆括号括起的表达式
primary returns [BigDecimal value]
  // 原子项
  :  atom {
       $value = $atom.value;
     }
  // 圆括号括起的表达式
  |  brackets {
       $value = $brackets.value;
     }
  ;

// 原子项：数值字面量、变量或函数调用(暂时仅支持内置函数：sin, cos, tan, sqrt, max, min)
atom returns [BigDecimal value]
  // 数值字面量：终结符，直接返回数值
  :  NUMBER {
       $value = new BigDecimal($NUMBER.text, new MathContext(15));
     }
  // 标识符变量：终结符，返回变量的值，若变量未定义则提示未定义
  |  VARIABLE {
       BigDecimal v = (BigDecimal)ExCalcorRunner.memory.get($VARIABLE.text);
       if ( v != null ) {
         $value = v;
       } else {
         System.err.println("[Err]Variable " + $VARIABLE.text + " is undefined.");
       }
     }
  // 内置函数：返回函数执行结果
  |  builtInFunc {
       $value = $builtInFunc.value;
     }
  ;

/**
 * 词法规则(Lexer rules)
 * Antlr 采用类似EBNF的符号集来定义文法 
 */

// 数值常量定义：十进制，无符号，支持科学计数法
NUMBER
  :  INTEGRAL (FRACTION)? (EXPONENT)?
  ;

// 布尔常量定义：true, TRUE, false, FALSE
BOOLEAN
  :  'true' | 'false' | 'TRUE' | 'FALSE'
  ;

// 内置函数定义
BUILTINFUNC
  :  'sin' | 'cos' | 'tan' | 'sqrt' | 'max' | 'min'
  ;

// 标识符变量定义：字母或下划线开头，跟任意长度的字母、数字或下划线
VARIABLE
  :  (LETTER | UNDERLINE) ((LETTER | DIGIT | UNDERLINE )+)?
  ;

// 换行符
NEWLINE
  :  '\r'? '\n'
  ;

// 跳过空格
SPACE
  :  (' ' | '\t' | '\r' | '\n' | '\u000C')+ { 
       skip();
     }
  ;

// 范式片段
fragment  // 分数
FRACTION:  '.' INTEGRAL;

fragment  // 科学计数法
EXPONENT:  ('E' | 'e') ('+' | '-')? INTEGRAL;

fragment  // 整数
INTEGRAL:  DIGIT+;

fragment  // 数字
DIGIT:     '0'..'9';

fragment  // 字母
LETTER:    'a'..'z' | 'A'..'Z';

fragment  // 下划线
UNDERLINE: '_';
