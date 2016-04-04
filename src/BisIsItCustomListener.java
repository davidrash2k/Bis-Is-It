

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import bis.is.it.BisParser;
import bis.is.it.BisListener;
import bis.is.it.BisParser.AddOrSubtractContext;
import bis.is.it.BisParser.ArrContext;
import bis.is.it.BisParser.Ass_operatorContext;
import bis.is.it.BisParser.Ass_stateContext;
import bis.is.it.BisParser.Ass_state_operatorContext;
import bis.is.it.BisParser.AssignmentContext;
import bis.is.it.BisParser.Call_paramsContext;
import bis.is.it.BisParser.CodeblockContext;
import bis.is.it.BisParser.Cond_operatorContext;
import bis.is.it.BisParser.Cond_stateContext;
import bis.is.it.BisParser.Cond_valContext;
import bis.is.it.BisParser.ConditionContext;
import bis.is.it.BisParser.Consvardec_stateContext;
import bis.is.it.BisParser.Data_typeContext;
import bis.is.it.BisParser.Do_while_stateContext;
import bis.is.it.BisParser.Else_blockContext;
import bis.is.it.BisParser.Else_if_blockContext;
import bis.is.it.BisParser.For_stateContext;
import bis.is.it.BisParser.FuncContext;
import bis.is.it.BisParser.Func_callContext;
import bis.is.it.BisParser.Func_call_stateContext;
import bis.is.it.BisParser.Func_data_typeContext;
import bis.is.it.BisParser.Func_defineContext;
import bis.is.it.BisParser.IntLiteralContext;
import bis.is.it.BisParser.Main_FuncContext;
import bis.is.it.BisParser.Main_funcContext;
import bis.is.it.BisParser.MultOrDivContext;
import bis.is.it.BisParser.Num_valContext;
import bis.is.it.BisParser.ParamsContext;
import bis.is.it.BisParser.ParenExprContext;
import bis.is.it.BisParser.Return_stateContext;
import bis.is.it.BisParser.StartContext;
import bis.is.it.BisParser.StatementContext;
import bis.is.it.BisParser.Unary_opContext;
import bis.is.it.BisParser.ValContext;
import bis.is.it.BisParser.VarContext;
import bis.is.it.BisParser.Vardec_stateContext;
import bis.is.it.BisParser.While_stateContext;

public class BisIsItCustomListener implements BisListener {
	
	boolean error;

	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStart(StartContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStart(StartContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFunc_define(Func_defineContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFunc_define(Func_defineContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFunc(FuncContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFunc(FuncContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterParams(ParamsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitParams(ParamsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterReturn_state(Return_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitReturn_state(Return_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFunc_call_state(Func_call_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFunc_call_state(Func_call_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFunc_call(Func_callContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFunc_call(Func_callContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCall_params(Call_paramsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCall_params(Call_paramsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCodeblock(CodeblockContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCodeblock(CodeblockContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatement(StatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatement(StatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVardec_state(Vardec_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVardec_state(Vardec_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterConsvardec_state(Consvardec_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitConsvardec_state(Consvardec_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVar(VarContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVar(VarContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFunc_data_type(Func_data_typeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFunc_data_type(Func_data_typeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterData_type(Data_typeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitData_type(Data_typeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterArr(ArrContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArr(ArrContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAss_state(Ass_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAss_state(Ass_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAssignment(AssignmentContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAssignment(AssignmentContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVal(ValContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVal(ValContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAss_state_operator(Ass_state_operatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAss_state_operator(Ass_state_operatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAss_operator(Ass_operatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAss_operator(Ass_operatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnary_op(Unary_opContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnary_op(Unary_opContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNum_val(Num_valContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNum_val(Num_valContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMultOrDiv(MultOrDivContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMultOrDiv(MultOrDivContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterIntLiteral(IntLiteralContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitIntLiteral(IntLiteralContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAddOrSubtract(AddOrSubtractContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAddOrSubtract(AddOrSubtractContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterParenExpr(ParenExprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitParenExpr(ParenExprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCond_state(Cond_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCond_state(Cond_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterElse_if_block(Else_if_blockContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitElse_if_block(Else_if_blockContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterElse_block(Else_blockContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitElse_block(Else_blockContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCond_val(Cond_valContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCond_val(Cond_valContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCondition(ConditionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCondition(ConditionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCond_operator(Cond_operatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCond_operator(Cond_operatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterWhile_state(While_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitWhile_state(While_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDo_while_state(Do_while_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDo_while_state(Do_while_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFor_state(For_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFor_state(For_stateContext ctx) {
		// TODO Auto-generated method stub
		
	}
	
	public void notifyError(String errorMsg) {
		error = true;
	}

	@Override
	public void enterMain_Func(Main_FuncContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMain_Func(Main_FuncContext ctx) {
		// TODO Auto-generated method stub
		
	}


}
