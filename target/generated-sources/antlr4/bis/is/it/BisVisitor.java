// Generated from Bis.g4 by ANTLR 4.5.2
package bis.is.it;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BisParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BisVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BisParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(BisParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#func_define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_define(BisParser.Func_defineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code main_Func}
	 * labeled alternative in {@link BisParser#main_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_Func(BisParser.Main_FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(BisParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(BisParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#return_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_state(BisParser.Return_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#func_call_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call_state(BisParser.Func_call_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(BisParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#call_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_params(BisParser.Call_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#codeblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeblock(BisParser.CodeblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BisParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#vardec_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec_state(BisParser.Vardec_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#consvardec_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsvardec_state(BisParser.Consvardec_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(BisParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#func_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_data_type(BisParser.Func_data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(BisParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr(BisParser.ArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#ass_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAss_state(BisParser.Ass_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(BisParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(BisParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#ass_state_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAss_state_operator(BisParser.Ass_state_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#ass_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAss_operator(BisParser.Ass_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#unary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_op(BisParser.Unary_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_val(BisParser.Num_valContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multOrDiv}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOrDiv(BisParser.MultOrDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(BisParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addOrSubtract}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOrSubtract(BisParser.AddOrSubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(BisParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#cond_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_state(BisParser.Cond_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#else_if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_block(BisParser.Else_if_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(BisParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#cond_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_val(BisParser.Cond_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(BisParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#cond_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_operator(BisParser.Cond_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#while_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_state(BisParser.While_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#do_while_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_state(BisParser.Do_while_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link BisParser#for_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_state(BisParser.For_stateContext ctx);
}