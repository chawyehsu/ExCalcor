// Generated from ExCalcor.g4 by ANTLR 4.4
package main.antlr.excalcor;

import java.lang.Math;
import java.math.MathContext;
import java.math.BigDecimal;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExCalcorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, NUMBER=20, BOOLEAN=21, VARIABLE=22, BUILTINFUNC=23, 
		NEWLINE=24, SPACE=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'%'", "')'", "'+'", "'-'", "'*'", "':'", "'('", "'<'", "'='", 
		"'!='", "'<='", "'&&'", "'?'", "'||'", "'>'", "'=='", "'/'", "'>='", "'!'", 
		"NUMBER", "BOOLEAN", "VARIABLE", "BUILTINFUNC", "NEWLINE", "SPACE"
	};
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_assignment = 2, RULE_expression = 3, 
		RULE_condExpr = 4, RULE_orExpr = 5, RULE_andExpr = 6, RULE_equalityExpr = 7, 
		RULE_comparisonExpr = 8, RULE_addiExpr = 9, RULE_multExpr = 10, RULE_unaryExpr = 11, 
		RULE_builtInFunc = 12, RULE_brackets = 13, RULE_primary = 14, RULE_atom = 15;
	public static final String[] ruleNames = {
		"prog", "statement", "assignment", "expression", "condExpr", "orExpr", 
		"andExpr", "equalityExpr", "comparisonExpr", "addiExpr", "multExpr", "unaryExpr", 
		"builtInFunc", "brackets", "primary", "atom"
	};

	@Override
	public String getGrammarFileName() { return "ExCalcor.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExCalcorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32); statement();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__12) | (1L << T__0) | (1L << NUMBER) | (1L << VARIABLE) | (1L << BUILTINFUNC) | (1L << NEWLINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode NEWLINE() { return getToken(ExCalcorParser.NEWLINE, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(45);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37); assignment();
				setState(38); match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40); ((StatementContext)_localctx).expression = expression();
				setState(41); match(NEWLINE);

				       if (((StatementContext)_localctx).expression.value != null) {
				         System.out.println(((StatementContext)_localctx).expression.value);
				       }
				     
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44); match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Token VARIABLE;
		public ExpressionContext expression;
		public TerminalNode VARIABLE() { return getToken(ExCalcorParser.VARIABLE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); ((AssignmentContext)_localctx).VARIABLE = match(VARIABLE);
			setState(48); match(T__10);
			setState(49); ((AssignmentContext)_localctx).expression = expression();

			       ExCalcorRunner.memory.put((((AssignmentContext)_localctx).VARIABLE!=null?((AssignmentContext)_localctx).VARIABLE.getText():null), ((AssignmentContext)_localctx).expression.value);
			     
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BigDecimal value;
		public CondExprContext condExpr;
		public CondExprContext condExpr() {
			return getRuleContext(CondExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); ((ExpressionContext)_localctx).condExpr = condExpr();

			       ((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).condExpr.value;
			     
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondExprContext extends ParserRuleContext {
		public BigDecimal value;
		public OrExprContext a;
		public ExpressionContext b;
		public ExpressionContext c;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CondExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).enterCondExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).exitCondExpr(this);
		}
	}

	public final CondExprContext condExpr() throws RecognitionException {
		CondExprContext _localctx = new CondExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); ((CondExprContext)_localctx).a = orExpr();

			       ((CondExprContext)_localctx).value =  ((CondExprContext)_localctx).a.value;
			     
			setState(63);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(57); match(T__6);
				setState(58); ((CondExprContext)_localctx).b = expression();
				setState(59); match(T__13);
				setState(60); ((CondExprContext)_localctx).c = expression();

				            // 如果 a 的值不等于零(即为真值)，则返回 b 的值
				            if (((CondExprContext)_localctx).a.value.compareTo(BigDecimal.ZERO) != 0) {
				              ((CondExprContext)_localctx).value =  ((CondExprContext)_localctx).b.value;
				            // 否则返回 c 的值
				            } else {
				              ((CondExprContext)_localctx).value =  ((CondExprContext)_localctx).c.value;
				            }
				          
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExprContext extends ParserRuleContext {
		public BigDecimal value;
		public AndExprContext a;
		public AndExprContext b;
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).exitOrExpr(this);
		}
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); ((OrExprContext)_localctx).a = andExpr();

			       ((OrExprContext)_localctx).value =  ((OrExprContext)_localctx).a.value;
			     
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(67); match(T__5);
				setState(68); ((OrExprContext)_localctx).b = andExpr();

				            // 任意一个不等于零则返回1(true)
				            if ((((OrExprContext)_localctx).a.value.compareTo(BigDecimal.ZERO) != 0) || 
				                (((OrExprContext)_localctx).b.value.compareTo(BigDecimal.ZERO) != 0)) {
				              ((OrExprContext)_localctx).value =  new BigDecimal(1, new MathContext(15));
				            // 否则则返回0(false)
				            } else {
				              ((OrExprContext)_localctx).value =  new BigDecimal(0, new MathContext(15));
				            }
				          
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExprContext extends ParserRuleContext {
		public BigDecimal value;
		public EqualityExprContext a;
		public EqualityExprContext b;
		public EqualityExprContext equalityExpr(int i) {
			return getRuleContext(EqualityExprContext.class,i);
		}
		public List<EqualityExprContext> equalityExpr() {
			return getRuleContexts(EqualityExprContext.class);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).exitAndExpr(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); ((AndExprContext)_localctx).a = equalityExpr();

			       ((AndExprContext)_localctx).value =  ((AndExprContext)_localctx).a.value;
			     
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(78); match(T__7);
				setState(79); ((AndExprContext)_localctx).b = equalityExpr();

				            // 两个均不等于零则返回1(true)
				            if ((((AndExprContext)_localctx).a.value.compareTo(BigDecimal.ZERO) != 0) && 
				                (((AndExprContext)_localctx).b.value.compareTo(BigDecimal.ZERO) != 0)) {
				              ((AndExprContext)_localctx).value =  new BigDecimal(1, new MathContext(15));
				            // 否则则返回0(false)
				            } else {
				              ((AndExprContext)_localctx).value =  new BigDecimal(0, new MathContext(15));
				            }
				       
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExprContext extends ParserRuleContext {
		public BigDecimal value;
		public ComparisonExprContext a;
		public ComparisonExprContext b;
		public List<ComparisonExprContext> comparisonExpr() {
			return getRuleContexts(ComparisonExprContext.class);
		}
		public ComparisonExprContext comparisonExpr(int i) {
			return getRuleContext(ComparisonExprContext.class,i);
		}
		public EqualityExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).exitEqualityExpr(this);
		}
	}

	public final EqualityExprContext equalityExpr() throws RecognitionException {
		EqualityExprContext _localctx = new EqualityExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_equalityExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); ((EqualityExprContext)_localctx).a = comparisonExpr();

			       ((EqualityExprContext)_localctx).value =  ((EqualityExprContext)_localctx).a.value;
			     
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==T__3) {
				{
				setState(97);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(89); match(T__3);
					setState(90); ((EqualityExprContext)_localctx).b = comparisonExpr();

					            // 如果等于则返回1(true)
					            if (((EqualityExprContext)_localctx).a.value.compareTo(((EqualityExprContext)_localctx).b.value) == 0) {
					              ((EqualityExprContext)_localctx).value =  new BigDecimal(1, new MathContext(15));
					            // 否则则返回0(false)
					            } else {
					              ((EqualityExprContext)_localctx).value =  new BigDecimal(0, new MathContext(15));
					            }
					          
					}
					break;
				case T__9:
					{
					setState(93); match(T__9);
					setState(94); ((EqualityExprContext)_localctx).b = comparisonExpr();

					            // 如果不等于则返回1(true)
					            if (((EqualityExprContext)_localctx).a.value.compareTo(((EqualityExprContext)_localctx).b.value) != 0) {
					              ((EqualityExprContext)_localctx).value =  new BigDecimal(1, new MathContext(15));
					            // 否则则返回0(false)
					            } else {
					              ((EqualityExprContext)_localctx).value =  new BigDecimal(0, new MathContext(15));
					            }
					          
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonExprContext extends ParserRuleContext {
		public BigDecimal value;
		public AddiExprContext a;
		public AddiExprContext b;
		public List<AddiExprContext> addiExpr() {
			return getRuleContexts(AddiExprContext.class);
		}
		public AddiExprContext addiExpr(int i) {
			return getRuleContext(AddiExprContext.class,i);
		}
		public ComparisonExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).exitComparisonExpr(this);
		}
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comparisonExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); ((ComparisonExprContext)_localctx).a = addiExpr();

			       ((ComparisonExprContext)_localctx).value =  ((ComparisonExprContext)_localctx).a.value;
			     
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__8) | (1L << T__4) | (1L << T__1))) != 0)) {
				{
				setState(120);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(104); match(T__4);
					setState(105); ((ComparisonExprContext)_localctx).b = addiExpr();

					            // 如果大于则返回1(true)
					            if (((ComparisonExprContext)_localctx).a.value.compareTo(((ComparisonExprContext)_localctx).b.value) == 1) {
					              ((ComparisonExprContext)_localctx).value =  new BigDecimal(1, new MathContext(15));
					            // 否则则返回0(false)
					            } else {
					              ((ComparisonExprContext)_localctx).value =  new BigDecimal(0, new MathContext(15));
					            }
					          
					}
					break;
				case T__11:
					{
					setState(108); match(T__11);
					setState(109); ((ComparisonExprContext)_localctx).b = addiExpr();

					            // 如果小于则返回1(true)
					            if (((ComparisonExprContext)_localctx).a.value.compareTo(((ComparisonExprContext)_localctx).b.value) == -1) {
					              ((ComparisonExprContext)_localctx).value =  new BigDecimal(1, new MathContext(15));
					            // 否则则返回0(false)
					            } else {
					              ((ComparisonExprContext)_localctx).value =  new BigDecimal(0, new MathContext(15));
					            }
					          
					}
					break;
				case T__1:
					{
					setState(112); match(T__1);
					setState(113); ((ComparisonExprContext)_localctx).b = addiExpr();

					            // 如果大于等于则返回1(true)
					            if ((((ComparisonExprContext)_localctx).a.value.compareTo(((ComparisonExprContext)_localctx).b.value) == 1) || (((ComparisonExprContext)_localctx).a.value.compareTo(((ComparisonExprContext)_localctx).b.value) == 0)) {
					              ((ComparisonExprContext)_localctx).value =  new BigDecimal(1, new MathContext(15));
					            // 否则则返回0(false)
					            } else {
					              ((ComparisonExprContext)_localctx).value =  new BigDecimal(0, new MathContext(15));
					            }
					          
					}
					break;
				case T__8:
					{
					setState(116); match(T__8);
					setState(117); ((ComparisonExprContext)_localctx).b = addiExpr();

					            // 如果小于等于则返回1(true)
					            if ((((ComparisonExprContext)_localctx).a.value.compareTo(((ComparisonExprContext)_localctx).b.value) == -1) || (((ComparisonExprContext)_localctx).a.value.compareTo(((ComparisonExprContext)_localctx).b.value) == 0)) {
					              ((ComparisonExprContext)_localctx).value =  new BigDecimal(1, new MathContext(15));
					            // 否则则返回0(false)
					            } else {
					              ((ComparisonExprContext)_localctx).value =  new BigDecimal(0, new MathContext(15));
					            }
					          
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddiExprContext extends ParserRuleContext {
		public BigDecimal value;
		public MultExprContext a;
		public MultExprContext b;
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public AddiExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addiExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).enterAddiExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).exitAddiExpr(this);
		}
	}

	public final AddiExprContext addiExpr() throws RecognitionException {
		AddiExprContext _localctx = new AddiExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_addiExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); ((AddiExprContext)_localctx).a = multExpr();

			       ((AddiExprContext)_localctx).value =  ((AddiExprContext)_localctx).a.value;
			     
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16 || _la==T__15) {
				{
				setState(135);
				switch (_input.LA(1)) {
				case T__16:
					{
					setState(127); match(T__16);
					setState(128); ((AddiExprContext)_localctx).b = multExpr();

					            // 使用 BigDecimal 对象自有的加法函数：add()。see: java.math.BigDecimal
					            ((AddiExprContext)_localctx).value =  ((AddiExprContext)_localctx).a.value.add(((AddiExprContext)_localctx).b.value, new MathContext(15));
					          
					}
					break;
				case T__15:
					{
					setState(131); match(T__15);
					setState(132); ((AddiExprContext)_localctx).b = multExpr();

					            // 使用 BigDecimal 对象自有的减法函数：subtract()。see: java.math.BigDecimal
					            ((AddiExprContext)_localctx).value =  ((AddiExprContext)_localctx).a.value.subtract(((AddiExprContext)_localctx).b.value, new MathContext(15));
					          
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultExprContext extends ParserRuleContext {
		public BigDecimal value;
		public UnaryExprContext a;
		public UnaryExprContext b;
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).exitMultExpr(this);
		}
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); ((MultExprContext)_localctx).a = unaryExpr();

			       ((MultExprContext)_localctx).value =  ((MultExprContext)_localctx).a.value;
			     
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__14) | (1L << T__2))) != 0)) {
				{
				setState(154);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(142); match(T__14);
					setState(143); ((MultExprContext)_localctx).b = unaryExpr();

					            // 使用 BigDecimal 对象自有的乘法函数：multiply()。see: java.math.BigDecimal
					            ((MultExprContext)_localctx).value =  ((MultExprContext)_localctx).a.value.multiply(((MultExprContext)_localctx).b.value, new MathContext(15));
					          
					}
					break;
				case T__2:
					{
					setState(146); match(T__2);
					setState(147); ((MultExprContext)_localctx).b = unaryExpr();

					            // 使用 BigDecimal 对象自有的除法函数：divide()。see: java.math.BigDecimal
					            ((MultExprContext)_localctx).value =  ((MultExprContext)_localctx).a.value.divide(((MultExprContext)_localctx).b.value, new MathContext(15));
					          
					}
					break;
				case T__18:
					{
					setState(150); match(T__18);
					setState(151); ((MultExprContext)_localctx).b = unaryExpr();

					            // 使用 BigDecimal 对象自有的取余函数：remainder()。see: java.math.BigDecimal
					            ((MultExprContext)_localctx).value =  ((MultExprContext)_localctx).a.value.remainder(((MultExprContext)_localctx).b.value, new MathContext(15));
					          
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExprContext extends ParserRuleContext {
		public BigDecimal value;
		public PrimaryContext primary;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).exitUnaryExpr(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unaryExpr);
		try {
			setState(170);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(159); match(T__15);
				setState(160); ((UnaryExprContext)_localctx).primary = primary();

				       // 使用 BigDecimal 对象自有的取反方法：negate()。see: java.math.BigDecimal
				       ((UnaryExprContext)_localctx).value =  ((UnaryExprContext)_localctx).primary.value.negate(new MathContext(15));
				     
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(163); match(T__0);
				setState(164); ((UnaryExprContext)_localctx).primary = primary();

				       // 如果等于零则返回1
				       if (((UnaryExprContext)_localctx).primary.value.compareTo(BigDecimal.ZERO) == 0) {
				         ((UnaryExprContext)_localctx).value =  new BigDecimal(1, new MathContext(15));
				       // 否则则返回0
				       } else {
				         ((UnaryExprContext)_localctx).value =  new BigDecimal(0, new MathContext(15));
				       }
				     
				}
				break;
			case T__12:
			case NUMBER:
			case VARIABLE:
			case BUILTINFUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(167); ((UnaryExprContext)_localctx).primary = primary();

				       ((UnaryExprContext)_localctx).value =  ((UnaryExprContext)_localctx).primary.value;
				     
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuiltInFuncContext extends ParserRuleContext {
		public BigDecimal value;
		public Token BUILTINFUNC;
		public BracketsContext brackets;
		public BracketsContext brackets() {
			return getRuleContext(BracketsContext.class,0);
		}
		public TerminalNode BUILTINFUNC() { return getToken(ExCalcorParser.BUILTINFUNC, 0); }
		public BuiltInFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).enterBuiltInFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).exitBuiltInFunc(this);
		}
	}

	public final BuiltInFuncContext builtInFunc() throws RecognitionException {
		BuiltInFuncContext _localctx = new BuiltInFuncContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_builtInFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); ((BuiltInFuncContext)_localctx).BUILTINFUNC = match(BUILTINFUNC);
			setState(173); ((BuiltInFuncContext)_localctx).brackets = brackets();

			       MathContext mc = new MathContext(15);
			       // 匹配 sin
			       if ((((BuiltInFuncContext)_localctx).BUILTINFUNC!=null?((BuiltInFuncContext)_localctx).BUILTINFUNC.getText():null).equals("sin") ) {
			         double d = Math.sin(
			           Double.parseDouble(((BuiltInFuncContext)_localctx).brackets.value.toPlainString()));
			         ((BuiltInFuncContext)_localctx).value =  new BigDecimal(d, mc);
			       }
			       // 匹配 cos
			       if ((((BuiltInFuncContext)_localctx).BUILTINFUNC!=null?((BuiltInFuncContext)_localctx).BUILTINFUNC.getText():null).equals("cos") ) {
			         double d = Math.cos(
			           Double.parseDouble(((BuiltInFuncContext)_localctx).brackets.value.toPlainString()));
			         ((BuiltInFuncContext)_localctx).value =  new BigDecimal(d, mc);
			       }
			       // 匹配 tan
			       if ((((BuiltInFuncContext)_localctx).BUILTINFUNC!=null?((BuiltInFuncContext)_localctx).BUILTINFUNC.getText():null).equals("tan") ) {
			         double d = Math.tan(
			           Double.parseDouble(((BuiltInFuncContext)_localctx).brackets.value.toPlainString()));
			         ((BuiltInFuncContext)_localctx).value =  new BigDecimal(d, mc);
			       }
			       // 匹配 sqrt
			       if ((((BuiltInFuncContext)_localctx).BUILTINFUNC!=null?((BuiltInFuncContext)_localctx).BUILTINFUNC.getText():null).equals("sqrt") ) {
			         double d = Math.sqrt(
			             Double.parseDouble(((BuiltInFuncContext)_localctx).brackets.value.toPlainString()));
			         ((BuiltInFuncContext)_localctx).value =  new BigDecimal(d, mc);
			       }
			     
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracketsContext extends ParserRuleContext {
		public BigDecimal value;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).exitBrackets(this);
		}
	}

	public final BracketsContext brackets() throws RecognitionException {
		BracketsContext _localctx = new BracketsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_brackets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(T__12);
			setState(177); ((BracketsContext)_localctx).expression = expression();
			setState(178); match(T__17);

			      ((BracketsContext)_localctx).value =  ((BracketsContext)_localctx).expression.value;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public BigDecimal value;
		public AtomContext atom;
		public BracketsContext brackets;
		public BracketsContext brackets() {
			return getRuleContext(BracketsContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primary);
		try {
			setState(187);
			switch (_input.LA(1)) {
			case NUMBER:
			case VARIABLE:
			case BUILTINFUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); ((PrimaryContext)_localctx).atom = atom();

				       ((PrimaryContext)_localctx).value =  ((PrimaryContext)_localctx).atom.value;
				     
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(184); ((PrimaryContext)_localctx).brackets = brackets();

				       ((PrimaryContext)_localctx).value =  ((PrimaryContext)_localctx).brackets.value;
				     
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public BigDecimal value;
		public Token NUMBER;
		public Token VARIABLE;
		public BuiltInFuncContext builtInFunc;
		public TerminalNode VARIABLE() { return getToken(ExCalcorParser.VARIABLE, 0); }
		public BuiltInFuncContext builtInFunc() {
			return getRuleContext(BuiltInFuncContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ExCalcorParser.NUMBER, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExCalcorListener ) ((ExCalcorListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atom);
		try {
			setState(196);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); ((AtomContext)_localctx).NUMBER = match(NUMBER);

				       ((AtomContext)_localctx).value =  new BigDecimal((((AtomContext)_localctx).NUMBER!=null?((AtomContext)_localctx).NUMBER.getText():null));
				     
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(191); ((AtomContext)_localctx).VARIABLE = match(VARIABLE);

				       BigDecimal v = (BigDecimal)ExCalcorRunner.memory.get((((AtomContext)_localctx).VARIABLE!=null?((AtomContext)_localctx).VARIABLE.getText():null));
				       if ( v != null ) {
				         ((AtomContext)_localctx).value =  v;
				       } else {
				         System.err.println("[Err]Variable " + (((AtomContext)_localctx).VARIABLE!=null?((AtomContext)_localctx).VARIABLE.getText():null) + " is undefined.");
				       }
				     
				}
				break;
			case BUILTINFUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(193); ((AtomContext)_localctx).builtInFunc = builtInFunc();

				       ((AtomContext)_localctx).value =  ((AtomContext)_localctx).builtInFunc.value;
				     
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u00c9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2"+
		"$\n\2\r\2\16\2%\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bU"+
		"\n\b\f\b\16\bX\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\td\n\t\f"+
		"\t\16\tg\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u008a\n\13\f\13\16\13\u008d\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009d\n\f\f\f\16\f"+
		"\u00a0\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ad\n\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00be\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c7\n"+
		"\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\u00ce\2#\3"+
		"\2\2\2\4/\3\2\2\2\6\61\3\2\2\2\b\66\3\2\2\2\n9\3\2\2\2\fC\3\2\2\2\16N"+
		"\3\2\2\2\20Y\3\2\2\2\22h\3\2\2\2\24\177\3\2\2\2\26\u008e\3\2\2\2\30\u00ac"+
		"\3\2\2\2\32\u00ae\3\2\2\2\34\u00b2\3\2\2\2\36\u00bd\3\2\2\2 \u00c6\3\2"+
		"\2\2\"$\5\4\3\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'"+
		"(\5\6\4\2()\7\32\2\2)\60\3\2\2\2*+\5\b\5\2+,\7\32\2\2,-\b\3\1\2-\60\3"+
		"\2\2\2.\60\7\32\2\2/\'\3\2\2\2/*\3\2\2\2/.\3\2\2\2\60\5\3\2\2\2\61\62"+
		"\7\30\2\2\62\63\7\13\2\2\63\64\5\b\5\2\64\65\b\4\1\2\65\7\3\2\2\2\66\67"+
		"\5\n\6\2\678\b\5\1\28\t\3\2\2\29:\5\f\7\2:A\b\6\1\2;<\7\17\2\2<=\5\b\5"+
		"\2=>\7\b\2\2>?\5\b\5\2?@\b\6\1\2@B\3\2\2\2A;\3\2\2\2AB\3\2\2\2B\13\3\2"+
		"\2\2CD\5\16\b\2DK\b\7\1\2EF\7\20\2\2FG\5\16\b\2GH\b\7\1\2HJ\3\2\2\2IE"+
		"\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\r\3\2\2\2MK\3\2\2\2NO\5\20\t\2"+
		"OV\b\b\1\2PQ\7\16\2\2QR\5\20\t\2RS\b\b\1\2SU\3\2\2\2TP\3\2\2\2UX\3\2\2"+
		"\2VT\3\2\2\2VW\3\2\2\2W\17\3\2\2\2XV\3\2\2\2YZ\5\22\n\2Ze\b\t\1\2[\\\7"+
		"\22\2\2\\]\5\22\n\2]^\b\t\1\2^d\3\2\2\2_`\7\f\2\2`a\5\22\n\2ab\b\t\1\2"+
		"bd\3\2\2\2c[\3\2\2\2c_\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\21\3\2\2"+
		"\2ge\3\2\2\2hi\5\24\13\2i|\b\n\1\2jk\7\21\2\2kl\5\24\13\2lm\b\n\1\2m{"+
		"\3\2\2\2no\7\n\2\2op\5\24\13\2pq\b\n\1\2q{\3\2\2\2rs\7\24\2\2st\5\24\13"+
		"\2tu\b\n\1\2u{\3\2\2\2vw\7\r\2\2wx\5\24\13\2xy\b\n\1\2y{\3\2\2\2zj\3\2"+
		"\2\2zn\3\2\2\2zr\3\2\2\2zv\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\23\3"+
		"\2\2\2~|\3\2\2\2\177\u0080\5\26\f\2\u0080\u008b\b\13\1\2\u0081\u0082\7"+
		"\5\2\2\u0082\u0083\5\26\f\2\u0083\u0084\b\13\1\2\u0084\u008a\3\2\2\2\u0085"+
		"\u0086\7\6\2\2\u0086\u0087\5\26\f\2\u0087\u0088\b\13\1\2\u0088\u008a\3"+
		"\2\2\2\u0089\u0081\3\2\2\2\u0089\u0085\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\25\3\2\2\2\u008d\u008b\3\2\2"+
		"\2\u008e\u008f\5\30\r\2\u008f\u009e\b\f\1\2\u0090\u0091\7\7\2\2\u0091"+
		"\u0092\5\30\r\2\u0092\u0093\b\f\1\2\u0093\u009d\3\2\2\2\u0094\u0095\7"+
		"\23\2\2\u0095\u0096\5\30\r\2\u0096\u0097\b\f\1\2\u0097\u009d\3\2\2\2\u0098"+
		"\u0099\7\3\2\2\u0099\u009a\5\30\r\2\u009a\u009b\b\f\1\2\u009b\u009d\3"+
		"\2\2\2\u009c\u0090\3\2\2\2\u009c\u0094\3\2\2\2\u009c\u0098\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\27\3\2\2"+
		"\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a3\5\36\20\2\u00a3"+
		"\u00a4\b\r\1\2\u00a4\u00ad\3\2\2\2\u00a5\u00a6\7\25\2\2\u00a6\u00a7\5"+
		"\36\20\2\u00a7\u00a8\b\r\1\2\u00a8\u00ad\3\2\2\2\u00a9\u00aa\5\36\20\2"+
		"\u00aa\u00ab\b\r\1\2\u00ab\u00ad\3\2\2\2\u00ac\u00a1\3\2\2\2\u00ac\u00a5"+
		"\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad\31\3\2\2\2\u00ae\u00af\7\31\2\2\u00af"+
		"\u00b0\5\34\17\2\u00b0\u00b1\b\16\1\2\u00b1\33\3\2\2\2\u00b2\u00b3\7\t"+
		"\2\2\u00b3\u00b4\5\b\5\2\u00b4\u00b5\7\4\2\2\u00b5\u00b6\b\17\1\2\u00b6"+
		"\35\3\2\2\2\u00b7\u00b8\5 \21\2\u00b8\u00b9\b\20\1\2\u00b9\u00be\3\2\2"+
		"\2\u00ba\u00bb\5\34\17\2\u00bb\u00bc\b\20\1\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00b7\3\2\2\2\u00bd\u00ba\3\2\2\2\u00be\37\3\2\2\2\u00bf\u00c0\7\26\2"+
		"\2\u00c0\u00c7\b\21\1\2\u00c1\u00c2\7\30\2\2\u00c2\u00c7\b\21\1\2\u00c3"+
		"\u00c4\5\32\16\2\u00c4\u00c5\b\21\1\2\u00c5\u00c7\3\2\2\2\u00c6\u00bf"+
		"\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7!\3\2\2\2\22%/A"+
		"KVcez|\u0089\u008b\u009c\u009e\u00ac\u00bd\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}