// Generated from Bis.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BisParser}.
 */
public interface BisListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BisParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(BisParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(BisParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#func_define}.
	 * @param ctx the parse tree
	 */
	void enterFunc_define(BisParser.Func_defineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#func_define}.
	 * @param ctx the parse tree
	 */
	void exitFunc_define(BisParser.Func_defineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#main_func}.
	 * @param ctx the parse tree
	 */
	void enterMain_func(BisParser.Main_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#main_func}.
	 * @param ctx the parse tree
	 */
	void exitMain_func(BisParser.Main_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(BisParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(BisParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(BisParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(BisParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#return_state}.
	 * @param ctx the parse tree
	 */
	void enterReturn_state(BisParser.Return_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#return_state}.
	 * @param ctx the parse tree
	 */
	void exitReturn_state(BisParser.Return_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#func_call_state}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_state(BisParser.Func_call_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#func_call_state}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_state(BisParser.Func_call_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(BisParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(BisParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#call_params}.
	 * @param ctx the parse tree
	 */
	void enterCall_params(BisParser.Call_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#call_params}.
	 * @param ctx the parse tree
	 */
	void exitCall_params(BisParser.Call_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void enterCodeblock(BisParser.CodeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void exitCodeblock(BisParser.CodeblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BisParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BisParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#vardec_state}.
	 * @param ctx the parse tree
	 */
	void enterVardec_state(BisParser.Vardec_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#vardec_state}.
	 * @param ctx the parse tree
	 */
	void exitVardec_state(BisParser.Vardec_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#consvardec_state}.
	 * @param ctx the parse tree
	 */
	void enterConsvardec_state(BisParser.Consvardec_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#consvardec_state}.
	 * @param ctx the parse tree
	 */
	void exitConsvardec_state(BisParser.Consvardec_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(BisParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(BisParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#func_data_type}.
	 * @param ctx the parse tree
	 */
	void enterFunc_data_type(BisParser.Func_data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#func_data_type}.
	 * @param ctx the parse tree
	 */
	void exitFunc_data_type(BisParser.Func_data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(BisParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(BisParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#arr}.
	 * @param ctx the parse tree
	 */
	void enterArr(BisParser.ArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#arr}.
	 * @param ctx the parse tree
	 */
	void exitArr(BisParser.ArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#ass_state}.
	 * @param ctx the parse tree
	 */
	void enterAss_state(BisParser.Ass_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#ass_state}.
	 * @param ctx the parse tree
	 */
	void exitAss_state(BisParser.Ass_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(BisParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(BisParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(BisParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(BisParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#ass_state_operator}.
	 * @param ctx the parse tree
	 */
	void enterAss_state_operator(BisParser.Ass_state_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#ass_state_operator}.
	 * @param ctx the parse tree
	 */
	void exitAss_state_operator(BisParser.Ass_state_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#ass_operator}.
	 * @param ctx the parse tree
	 */
	void enterAss_operator(BisParser.Ass_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#ass_operator}.
	 * @param ctx the parse tree
	 */
	void exitAss_operator(BisParser.Ass_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op(BisParser.Unary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op(BisParser.Unary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void enterNum_val(BisParser.Num_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void exitNum_val(BisParser.Num_valContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multOrDiv}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultOrDiv(BisParser.MultOrDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multOrDiv}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultOrDiv(BisParser.MultOrDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(BisParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(BisParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addOrSubtract}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddOrSubtract(BisParser.AddOrSubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addOrSubtract}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddOrSubtract(BisParser.AddOrSubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(BisParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(BisParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#cond_state}.
	 * @param ctx the parse tree
	 */
	void enterCond_state(BisParser.Cond_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#cond_state}.
	 * @param ctx the parse tree
	 */
	void exitCond_state(BisParser.Cond_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(BisParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(BisParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void enterCond_val(BisParser.Cond_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void exitCond_val(BisParser.Cond_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(BisParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(BisParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#cond_operator}.
	 * @param ctx the parse tree
	 */
	void enterCond_operator(BisParser.Cond_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#cond_operator}.
	 * @param ctx the parse tree
	 */
	void exitCond_operator(BisParser.Cond_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operator(BisParser.Logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operator(BisParser.Logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#while_state}.
	 * @param ctx the parse tree
	 */
	void enterWhile_state(BisParser.While_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#while_state}.
	 * @param ctx the parse tree
	 */
	void exitWhile_state(BisParser.While_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#do_while_state}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_state(BisParser.Do_while_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#do_while_state}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_state(BisParser.Do_while_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#for_state}.
	 * @param ctx the parse tree
	 */
	void enterFor_state(BisParser.For_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#for_state}.
	 * @param ctx the parse tree
	 */
	void exitFor_state(BisParser.For_stateContext ctx);
}