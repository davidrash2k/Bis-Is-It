// Generated from Bis.g4 by ANTLR 4.5.2
package bis.is.it;
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
	 * Enter a parse tree produced by the {@code mainFunc}
	 * labeled alternative in {@link BisParser#main_func}.
	 * @param ctx the parse tree
	 */
	void enterMainFunc(BisParser.MainFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainFunc}
	 * labeled alternative in {@link BisParser#main_func}.
	 * @param ctx the parse tree
	 */
	void exitMainFunc(BisParser.MainFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#scan}.
	 * @param ctx the parse tree
	 */
	void enterScan(BisParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#scan}.
	 * @param ctx the parse tree
	 */
	void exitScan(BisParser.ScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(BisParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(BisParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link BisParser#printnl}.
	 * @param ctx the parse tree
	 */
	void enterPrintnl(BisParser.PrintnlContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#printnl}.
	 * @param ctx the parse tree
	 */
	void exitPrintnl(BisParser.PrintnlContext ctx);
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
	 * Enter a parse tree produced by the {@code multipleVar}
	 * labeled alternative in {@link BisParser#vardec}.
	 * @param ctx the parse tree
	 */
	void enterMultipleVar(BisParser.MultipleVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleVar}
	 * labeled alternative in {@link BisParser#vardec}.
	 * @param ctx the parse tree
	 */
	void exitMultipleVar(BisParser.MultipleVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleVar}
	 * labeled alternative in {@link BisParser#vardec}.
	 * @param ctx the parse tree
	 */
	void enterSingleVar(BisParser.SingleVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleVar}
	 * labeled alternative in {@link BisParser#vardec}.
	 * @param ctx the parse tree
	 */
	void exitSingleVar(BisParser.SingleVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayVar}
	 * labeled alternative in {@link BisParser#vardec}.
	 * @param ctx the parse tree
	 */
	void enterArrayVar(BisParser.ArrayVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayVar}
	 * labeled alternative in {@link BisParser#vardec}.
	 * @param ctx the parse tree
	 */
	void exitArrayVar(BisParser.ArrayVarContext ctx);
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
	 * Enter a parse tree produced by the {@code normalAssign}
	 * labeled alternative in {@link BisParser#ass_state}.
	 * @param ctx the parse tree
	 */
	void enterNormalAssign(BisParser.NormalAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalAssign}
	 * labeled alternative in {@link BisParser#ass_state}.
	 * @param ctx the parse tree
	 */
	void exitNormalAssign(BisParser.NormalAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operatorAssign}
	 * labeled alternative in {@link BisParser#ass_state}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAssign(BisParser.OperatorAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operatorAssign}
	 * labeled alternative in {@link BisParser#ass_state}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAssign(BisParser.OperatorAssignContext ctx);
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
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(BisParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(BisParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(BisParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(BisParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charLiteral}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void enterCharLiteral(BisParser.CharLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charLiteral}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void exitCharLiteral(BisParser.CharLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(BisParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(BisParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayIdentifier}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void enterArrayIdentifier(BisParser.ArrayIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayIdentifier}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void exitArrayIdentifier(BisParser.ArrayIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varIdentifier}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void enterVarIdentifier(BisParser.VarIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varIdentifier}
	 * labeled alternative in {@link BisParser#num_val}.
	 * @param ctx the parse tree
	 */
	void exitVarIdentifier(BisParser.VarIdentifierContext ctx);
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
	 * Enter a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(BisParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link BisParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(BisParser.NumberValueContext ctx);
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
	 * Enter a parse tree produced by the {@code stringConcatString}
	 * labeled alternative in {@link BisParser#stringParty}.
	 * @param ctx the parse tree
	 */
	void enterStringConcatString(BisParser.StringConcatStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringConcatString}
	 * labeled alternative in {@link BisParser#stringParty}.
	 * @param ctx the parse tree
	 */
	void exitStringConcatString(BisParser.StringConcatStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code soloerString}
	 * labeled alternative in {@link BisParser#stringParty}.
	 * @param ctx the parse tree
	 */
	void enterSoloerString(BisParser.SoloerStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code soloerString}
	 * labeled alternative in {@link BisParser#stringParty}.
	 * @param ctx the parse tree
	 */
	void exitSoloerString(BisParser.SoloerStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringConcatExpr}
	 * labeled alternative in {@link BisParser#stringParty}.
	 * @param ctx the parse tree
	 */
	void enterStringConcatExpr(BisParser.StringConcatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringConcatExpr}
	 * labeled alternative in {@link BisParser#stringParty}.
	 * @param ctx the parse tree
	 */
	void exitStringConcatExpr(BisParser.StringConcatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringConcatFuncCall}
	 * labeled alternative in {@link BisParser#stringParty}.
	 * @param ctx the parse tree
	 */
	void enterStringConcatFuncCall(BisParser.StringConcatFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringConcatFuncCall}
	 * labeled alternative in {@link BisParser#stringParty}.
	 * @param ctx the parse tree
	 */
	void exitStringConcatFuncCall(BisParser.StringConcatFuncCallContext ctx);
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
	 * Enter a parse tree produced by {@link BisParser#cond_block}.
	 * @param ctx the parse tree
	 */
	void enterCond_block(BisParser.Cond_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BisParser#cond_block}.
	 * @param ctx the parse tree
	 */
	void exitCond_block(BisParser.Cond_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression}
	 * labeled alternative in {@link BisParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BisParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression}
	 * labeled alternative in {@link BisParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BisParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link BisParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(BisParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link BisParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(BisParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link BisParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(BisParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link BisParser#cond_val}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(BisParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orCondition}
	 * labeled alternative in {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOrCondition(BisParser.OrConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orCondition}
	 * labeled alternative in {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOrCondition(BisParser.OrConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringVsString}
	 * labeled alternative in {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterStringVsString(BisParser.StringVsStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringVsString}
	 * labeled alternative in {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitStringVsString(BisParser.StringVsStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andCondition}
	 * labeled alternative in {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterAndCondition(BisParser.AndConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andCondition}
	 * labeled alternative in {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitAndCondition(BisParser.AndConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionOperator}
	 * labeled alternative in {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionOperator(BisParser.ConditionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionOperator}
	 * labeled alternative in {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionOperator(BisParser.ConditionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenCondition}
	 * labeled alternative in {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterParenCondition(BisParser.ParenConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenCondition}
	 * labeled alternative in {@link BisParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitParenCondition(BisParser.ParenConditionContext ctx);
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