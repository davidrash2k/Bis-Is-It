// Generated from ExpCalculator.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpCalculatorParser}.
 */
public interface ExpCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ExpCalculatorParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ExpCalculatorParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(ExpCalculatorParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(ExpCalculatorParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#main_func}.
	 * @param ctx the parse tree
	 */
	void enterMain_func(ExpCalculatorParser.Main_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#main_func}.
	 * @param ctx the parse tree
	 */
	void exitMain_func(ExpCalculatorParser.Main_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(ExpCalculatorParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(ExpCalculatorParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#params2}.
	 * @param ctx the parse tree
	 */
	void enterParams2(ExpCalculatorParser.Params2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#params2}.
	 * @param ctx the parse tree
	 */
	void exitParams2(ExpCalculatorParser.Params2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(ExpCalculatorParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(ExpCalculatorParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ExpCalculatorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ExpCalculatorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(ExpCalculatorParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(ExpCalculatorParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op(ExpCalculatorParser.Unary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op(ExpCalculatorParser.Unary_opContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multOrDiv}
	 * labeled alternative in {@link ExpCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultOrDiv(ExpCalculatorParser.MultOrDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multOrDiv}
	 * labeled alternative in {@link ExpCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultOrDiv(ExpCalculatorParser.MultOrDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link ExpCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(ExpCalculatorParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link ExpCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(ExpCalculatorParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addOrSubtract}
	 * labeled alternative in {@link ExpCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddOrSubtract(ExpCalculatorParser.AddOrSubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addOrSubtract}
	 * labeled alternative in {@link ExpCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddOrSubtract(ExpCalculatorParser.AddOrSubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link ExpCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(ExpCalculatorParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link ExpCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(ExpCalculatorParser.ParenExprContext ctx);
}