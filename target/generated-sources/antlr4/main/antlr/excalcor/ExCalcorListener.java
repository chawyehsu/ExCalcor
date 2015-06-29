// Generated from ExCalcor.g4 by ANTLR 4.4
package main.antlr.excalcor;

import java.lang.Math;
import java.math.MathContext;
import java.math.BigDecimal;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExCalcorParser}.
 */
public interface ExCalcorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExCalcorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ExCalcorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExCalcorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ExCalcorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExCalcorParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(@NotNull ExCalcorParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExCalcorParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(@NotNull ExCalcorParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExCalcorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull ExCalcorParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExCalcorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull ExCalcorParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExCalcorParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull ExCalcorParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExCalcorParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull ExCalcorParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExCalcorParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(@NotNull ExCalcorParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExCalcorParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(@NotNull ExCalcorParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExCalcorParser#builtInFunc}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInFunc(@NotNull ExCalcorParser.BuiltInFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExCalcorParser#builtInFunc}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInFunc(@NotNull ExCalcorParser.BuiltInFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExCalcorParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull ExCalcorParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExCalcorParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull ExCalcorParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExCalcorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ExCalcorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExCalcorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ExCalcorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExCalcorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull ExCalcorParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExCalcorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull ExCalcorParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExCalcorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull ExCalcorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExCalcorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull ExCalcorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExCalcorParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(@NotNull ExCalcorParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExCalcorParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(@NotNull ExCalcorParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExCalcorParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(@NotNull ExCalcorParser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExCalcorParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(@NotNull ExCalcorParser.CondExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExCalcorParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull ExCalcorParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExCalcorParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull ExCalcorParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExCalcorParser#addiExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddiExpr(@NotNull ExCalcorParser.AddiExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExCalcorParser#addiExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddiExpr(@NotNull ExCalcorParser.AddiExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExCalcorParser#brackets}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(@NotNull ExCalcorParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExCalcorParser#brackets}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(@NotNull ExCalcorParser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExCalcorParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(@NotNull ExCalcorParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExCalcorParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(@NotNull ExCalcorParser.EqualityExprContext ctx);
}