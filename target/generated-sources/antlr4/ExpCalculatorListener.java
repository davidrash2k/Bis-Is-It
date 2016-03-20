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
	 * Enter a parse tree produced by {@link ExpCalculatorParser#func_define}.
	 * @param ctx the parse tree
	 */
	void enterFunc_define(ExpCalculatorParser.Func_defineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#func_define}.
	 * @param ctx the parse tree
	 */
	void exitFunc_define(ExpCalculatorParser.Func_defineContext ctx);
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
	 * Enter a parse tree produced by {@link ExpCalculatorParser#func_call_state}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_state(ExpCalculatorParser.Func_call_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#func_call_state}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_state(ExpCalculatorParser.Func_call_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(ExpCalculatorParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(ExpCalculatorParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#call_params}.
	 * @param ctx the parse tree
	 */
	void enterCall_params(ExpCalculatorParser.Call_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#call_params}.
	 * @param ctx the parse tree
	 */
	void exitCall_params(ExpCalculatorParser.Call_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void enterCodeblock(ExpCalculatorParser.CodeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void exitCodeblock(ExpCalculatorParser.CodeblockContext ctx);
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
	 * Enter a parse tree produced by {@link ExpCalculatorParser#vardec_state}.
	 * @param ctx the parse tree
	 */
	void enterVardec_state(ExpCalculatorParser.Vardec_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#vardec_state}.
	 * @param ctx the parse tree
	 */
	void exitVardec_state(ExpCalculatorParser.Vardec_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#consvardec_state}.
	 * @param ctx the parse tree
	 */
	void enterConsvardec_state(ExpCalculatorParser.Consvardec_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#consvardec_state}.
	 * @param ctx the parse tree
	 */
	void exitConsvardec_state(ExpCalculatorParser.Consvardec_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ExpCalculatorParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ExpCalculatorParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#func_data_type}.
	 * @param ctx the parse tree
	 */
	void enterFunc_data_type(ExpCalculatorParser.Func_data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#func_data_type}.
	 * @param ctx the parse tree
	 */
	void exitFunc_data_type(ExpCalculatorParser.Func_data_typeContext ctx);
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
	 * Enter a parse tree produced by {@link ExpCalculatorParser#arr}.
	 * @param ctx the parse tree
	 */
	void enterArr(ExpCalculatorParser.ArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#arr}.
	 * @param ctx the parse tree
	 */
	void exitArr(ExpCalculatorParser.ArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#ass_state}.
	 * @param ctx the parse tree
	 */
	void enterAss_state(ExpCalculatorParser.Ass_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#ass_state}.
	 * @param ctx the parse tree
	 */
	void exitAss_state(ExpCalculatorParser.Ass_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ExpCalculatorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ExpCalculatorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(ExpCalculatorParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(ExpCalculatorParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#ass_state_operator}.
	 * @param ctx the parse tree
	 */
	void enterAss_state_operator(ExpCalculatorParser.Ass_state_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#ass_state_operator}.
	 * @param ctx the parse tree
	 */
	void exitAss_state_operator(ExpCalculatorParser.Ass_state_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#ass_operator}.
	 * @param ctx the parse tree
	 */
	void enterAss_operator(ExpCalculatorParser.Ass_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#ass_operator}.
	 * @param ctx the parse tree
	 */
	void exitAss_operator(ExpCalculatorParser.Ass_operatorContext ctx);
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
	 * Enter a parse tree produced by {@link ExpCalculatorParser#num_val}.
	 * @param ctx the parse tree
	 */
	void enterNum_val(ExpCalculatorParser.Num_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#num_val}.
	 * @param ctx the parse tree
	 */
	void exitNum_val(ExpCalculatorParser.Num_valContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#cond_state}.
	 * @param ctx the parse tree
	 */
	void enterCond_state(ExpCalculatorParser.Cond_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#cond_state}.
	 * @param ctx the parse tree
	 */
	void exitCond_state(ExpCalculatorParser.Cond_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(ExpCalculatorParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(ExpCalculatorParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void enterCond_val(ExpCalculatorParser.Cond_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void exitCond_val(ExpCalculatorParser.Cond_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ExpCalculatorParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ExpCalculatorParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#cond_operator}.
	 * @param ctx the parse tree
	 */
	void enterCond_operator(ExpCalculatorParser.Cond_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#cond_operator}.
	 * @param ctx the parse tree
	 */
	void exitCond_operator(ExpCalculatorParser.Cond_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operator(ExpCalculatorParser.Logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operator(ExpCalculatorParser.Logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#while_state}.
	 * @param ctx the parse tree
	 */
	void enterWhile_state(ExpCalculatorParser.While_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#while_state}.
	 * @param ctx the parse tree
	 */
	void exitWhile_state(ExpCalculatorParser.While_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#do_while_state}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_state(ExpCalculatorParser.Do_while_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#do_while_state}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_state(ExpCalculatorParser.Do_while_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpCalculatorParser#for_state}.
	 * @param ctx the parse tree
	 */
	void enterFor_state(ExpCalculatorParser.For_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpCalculatorParser#for_state}.
	 * @param ctx the parse tree
	 */
	void exitFor_state(ExpCalculatorParser.For_stateContext ctx);
}