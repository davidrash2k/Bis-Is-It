// Generated from ExpCalculator.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpCalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpCalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ExpCalculatorParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#func_define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_define(ExpCalculatorParser.Func_defineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#main_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_func(ExpCalculatorParser.Main_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(ExpCalculatorParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(ExpCalculatorParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#return_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_state(ExpCalculatorParser.Return_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#func_call_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call_state(ExpCalculatorParser.Func_call_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(ExpCalculatorParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#call_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_params(ExpCalculatorParser.Call_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#codeblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeblock(ExpCalculatorParser.CodeblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ExpCalculatorParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#vardec_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec_state(ExpCalculatorParser.Vardec_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#consvardec_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsvardec_state(ExpCalculatorParser.Consvardec_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ExpCalculatorParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#func_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_data_type(ExpCalculatorParser.Func_data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(ExpCalculatorParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr(ExpCalculatorParser.ArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#ass_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAss_state(ExpCalculatorParser.Ass_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ExpCalculatorParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(ExpCalculatorParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#ass_state_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAss_state_operator(ExpCalculatorParser.Ass_state_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#ass_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAss_operator(ExpCalculatorParser.Ass_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#unary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_op(ExpCalculatorParser.Unary_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#num_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_val(ExpCalculatorParser.Num_valContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multOrDiv}
	 * labeled alternative in {@link ExpCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOrDiv(ExpCalculatorParser.MultOrDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link ExpCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(ExpCalculatorParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addOrSubtract}
	 * labeled alternative in {@link ExpCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOrSubtract(ExpCalculatorParser.AddOrSubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link ExpCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(ExpCalculatorParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#cond_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_state(ExpCalculatorParser.Cond_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(ExpCalculatorParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#cond_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_val(ExpCalculatorParser.Cond_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ExpCalculatorParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#cond_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_operator(ExpCalculatorParser.Cond_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_operator(ExpCalculatorParser.Logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#while_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_state(ExpCalculatorParser.While_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#do_while_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_state(ExpCalculatorParser.Do_while_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpCalculatorParser#for_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_state(ExpCalculatorParser.For_stateContext ctx);
}