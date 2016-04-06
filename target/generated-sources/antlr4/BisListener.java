// Generated from Bis.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BisParser}.
 */
public interface BisListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code orCondition}
	 * labeled alternative in {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOrCondition(@NotNull BisParser.OrConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orCondition}
	 * labeled alternative in {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOrCondition(@NotNull BisParser.OrConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#func_call_state}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_state(@NotNull BisParser.Func_call_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#func_call_state}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_state(@NotNull BisParser.Func_call_stateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalAssign}
	 * labeled alternative in {@link BisParser#ass_state}.
	 * @param ctx the parse tree
	 */
	void enterNormalAssign(@NotNull BisParser.NormalAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalAssign}
	 * labeled alternative in {@link BisParser#ass_state}.
	 * @param ctx the parse tree
	 */
	void exitNormalAssign(@NotNull BisParser.NormalAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addOrSubtract}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddOrSubtract(@NotNull BisParser.AddOrSubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addOrSubtract}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddOrSubtract(@NotNull BisParser.AddOrSubtractContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(@NotNull BisParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(@NotNull BisParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#for_state}.
	 * @param ctx the parse tree
	 */
	void enterFor_state(@NotNull BisParser.For_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#for_state}.
	 * @param ctx the parse tree
	 */
	void exitFor_state(@NotNull BisParser.For_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#ass_state_operator}.
	 * @param ctx the parse tree
	 */
	void enterAss_state_operator(@NotNull BisParser.Ass_state_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#ass_state_operator}.
	 * @param ctx the parse tree
	 */
	void exitAss_state_operator(@NotNull BisParser.Ass_state_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#cond_operator}.
	 * @param ctx the parse tree
	 */
	void enterCond_operator(@NotNull BisParser.Cond_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#cond_operator}.
	 * @param ctx the parse tree
	 */
	void exitCond_operator(@NotNull BisParser.Cond_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(@NotNull BisParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(@NotNull BisParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringConcatExpr}
	 * labeled alternative in {@link BisParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void enterStringConcatExpr(@NotNull BisParser.StringConcatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringConcatExpr}
	 * labeled alternative in {@link BisParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void exitStringConcatExpr(@NotNull BisParser.StringConcatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenCondition}
	 * labeled alternative in {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterParenCondition(@NotNull BisParser.ParenConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenCondition}
	 * labeled alternative in {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitParenCondition(@NotNull BisParser.ParenConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link BisParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull BisParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link BisParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull BisParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(@NotNull BisParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(@NotNull BisParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op(@NotNull BisParser.Unary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op(@NotNull BisParser.Unary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull BisParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull BisParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#while_state}.
	 * @param ctx the parse tree
	 */
	void enterWhile_state(@NotNull BisParser.While_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#while_state}.
	 * @param ctx the parse tree
	 */
	void exitWhile_state(@NotNull BisParser.While_stateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link BisParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(@NotNull BisParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link BisParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(@NotNull BisParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull BisParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull BisParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void enterCodeblock(@NotNull BisParser.CodeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void exitCodeblock(@NotNull BisParser.CodeblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#call_params}.
	 * @param ctx the parse tree
	 */
	void enterCall_params(@NotNull BisParser.Call_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#call_params}.
	 * @param ctx the parse tree
	 */
	void exitCall_params(@NotNull BisParser.Call_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#ass_operator}.
	 * @param ctx the parse tree
	 */
	void enterAss_operator(@NotNull BisParser.Ass_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#ass_operator}.
	 * @param ctx the parse tree
	 */
	void exitAss_operator(@NotNull BisParser.Ass_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#cond_block}.
	 * @param ctx the parse tree
	 */
	void enterCond_block(@NotNull BisParser.Cond_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#cond_block}.
	 * @param ctx the parse tree
	 */
	void exitCond_block(@NotNull BisParser.Cond_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#consvardec_state}.
	 * @param ctx the parse tree
	 */
	void enterConsvardec_state(@NotNull BisParser.Consvardec_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#consvardec_state}.
	 * @param ctx the parse tree
	 */
	void exitConsvardec_state(@NotNull BisParser.Consvardec_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#vardec_state}.
	 * @param ctx the parse tree
	 */
	void enterVardec_state(@NotNull BisParser.Vardec_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#vardec_state}.
	 * @param ctx the parse tree
	 */
	void exitVardec_state(@NotNull BisParser.Vardec_stateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(@NotNull BisParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(@NotNull BisParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleVar}
	 * labeled alternative in {@link BisParser#vardec}.
	 * @param ctx the parse tree
	 */
	void enterSingleVar(@NotNull BisParser.SingleVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleVar}
	 * labeled alternative in {@link BisParser#vardec}.
	 * @param ctx the parse tree
	 */
	void exitSingleVar(@NotNull BisParser.SingleVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varIdentifier}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void enterVarIdentifier(@NotNull BisParser.VarIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varIdentifier}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void exitVarIdentifier(@NotNull BisParser.VarIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull BisParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull BisParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(@NotNull BisParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(@NotNull BisParser.NumberValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#cond_state}.
	 * @param ctx the parse tree
	 */
	void enterCond_state(@NotNull BisParser.Cond_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#cond_state}.
	 * @param ctx the parse tree
	 */
	void exitCond_state(@NotNull BisParser.Cond_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#do_while_state}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_state(@NotNull BisParser.Do_while_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#do_while_state}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_state(@NotNull BisParser.Do_while_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#arr}.
	 * @param ctx the parse tree
	 */
	void enterArr(@NotNull BisParser.ArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#arr}.
	 * @param ctx the parse tree
	 */
	void exitArr(@NotNull BisParser.ArrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayIdentifier}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void enterArrayIdentifier(@NotNull BisParser.ArrayIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayIdentifier}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void exitArrayIdentifier(@NotNull BisParser.ArrayIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression}
	 * labeled alternative in {@link BisParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull BisParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression}
	 * labeled alternative in {@link BisParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull BisParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mainFunc}
	 * labeled alternative in {@link BisParser#main_func}.
	 * @param ctx the parse tree
	 */
	void enterMainFunc(@NotNull BisParser.MainFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainFunc}
	 * labeled alternative in {@link BisParser#main_func}.
	 * @param ctx the parse tree
	 */
	void exitMainFunc(@NotNull BisParser.MainFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andCondition}
	 * labeled alternative in {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterAndCondition(@NotNull BisParser.AndConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andCondition}
	 * labeled alternative in {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitAndCondition(@NotNull BisParser.AndConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull BisParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull BisParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull BisParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull BisParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#func_define}.
	 * @param ctx the parse tree
	 */
	void enterFunc_define(@NotNull BisParser.Func_defineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#func_define}.
	 * @param ctx the parse tree
	 */
	void exitFunc_define(@NotNull BisParser.Func_defineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charLiteral}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void enterCharLiteral(@NotNull BisParser.CharLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charLiteral}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void exitCharLiteral(@NotNull BisParser.CharLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#func_data_type}.
	 * @param ctx the parse tree
	 */
	void enterFunc_data_type(@NotNull BisParser.Func_data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#func_data_type}.
	 * @param ctx the parse tree
	 */
	void exitFunc_data_type(@NotNull BisParser.Func_data_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operatorAssign}
	 * labeled alternative in {@link BisParser#ass_state}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAssign(@NotNull BisParser.OperatorAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operatorAssign}
	 * labeled alternative in {@link BisParser#ass_state}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAssign(@NotNull BisParser.OperatorAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multOrDiv}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultOrDiv(@NotNull BisParser.MultOrDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multOrDiv}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultOrDiv(@NotNull BisParser.MultOrDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleVar}
	 * labeled alternative in {@link BisParser#vardec}.
	 * @param ctx the parse tree
	 */
	void enterMultipleVar(@NotNull BisParser.MultipleVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleVar}
	 * labeled alternative in {@link BisParser#vardec}.
	 * @param ctx the parse tree
	 */
	void exitMultipleVar(@NotNull BisParser.MultipleVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringConcatString}
	 * labeled alternative in {@link BisParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void enterStringConcatString(@NotNull BisParser.StringConcatStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringConcatString}
	 * labeled alternative in {@link BisParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void exitStringConcatString(@NotNull BisParser.StringConcatStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(@NotNull BisParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(@NotNull BisParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionOperator}
	 * labeled alternative in {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionOperator(@NotNull BisParser.ConditionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionOperator}
	 * labeled alternative in {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionOperator(@NotNull BisParser.ConditionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(@NotNull BisParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(@NotNull BisParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(@NotNull BisParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(@NotNull BisParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#return_state}.
	 * @param ctx the parse tree
	 */
	void enterReturn_state(@NotNull BisParser.Return_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#return_state}.
	 * @param ctx the parse tree
	 */
	void exitReturn_state(@NotNull BisParser.Return_stateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayVar}
	 * labeled alternative in {@link BisParser#vardec}.
	 * @param ctx the parse tree
	 */
	void enterArrayVar(@NotNull BisParser.ArrayVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayVar}
	 * labeled alternative in {@link BisParser#vardec}.
	 * @param ctx the parse tree
	 */
	void exitArrayVar(@NotNull BisParser.ArrayVarContext ctx);
}