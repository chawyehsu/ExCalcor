package main.antlr.excalcor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/*Main java method & create HashMap for storage.
Lines are read in and evaluated one at a time.
Output is printed to console, then return to new line
and wait for next command.*/
public class ExCalcorRunner {
	public static HashMap<String,Object> memory = new HashMap<String,Object>();
	public static void main(String[] args) throws Exception {   
	    System.out.println("Type 'exit' to quit");
	    String line = "";
	    InputStreamReader conv = new InputStreamReader(System.in);
	    BufferedReader in = new BufferedReader(conv);
	    while(!(line.equals("exit"))){

	        line = in.readLine();

	        if(!(line.equals("exit"))){
	            ExCalcorLexer lexer = new ExCalcorLexer(
	                new ANTLRInputStream(line + System.getProperty("line.separator")));
	            CommonTokenStream tokens = new CommonTokenStream(lexer);
	            ExCalcorParser parser = new ExCalcorParser(tokens);
	            parser.prog();
	        }
	    }
	    System.out.println("bye.");
	}
}
