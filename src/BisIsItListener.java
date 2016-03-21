// Generated from Bis.g4 by ANTLR 4.5.2

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import bis.is.it.BisParser;
import bis.is.it.BisListener;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * This class provides an empty implementation of {@link BisListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class BisIsItListener implements BisListener {
	Stack<Integer> stack = new Stack<Integer>();
	boolean error = false;
	
	@Override public void enterStart(StartContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStart(StartContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement(StatementContext ctx) {
		error = false;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement(StatementContext ctx) throws RuntimeException {
		try {
			if (!error)
				System.out.println(stack.pop());
		} catch (EmptyStackException e) {
			
		}
		stack = new Stack<Integer>();
		error = false; 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInteger(IntegerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInteger(IntegerContext ctx) { 
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnary_op(Unary_opContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnary_op(Unary_opContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMultOrDiv(MultOrDivContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMultOrDiv(MultOrDivContext ctx) {
		Integer op1 = null, op2 = null;
		try {
			op1 = stack.pop();
		    op2 = stack.pop();
		} catch (Exception e) {
			error = true;
		}
	    if (op1 != null && op2 != null && ctx.getChild(1).getText().equals("*")) {
	    	try {
	    		stack.push(op2 * op1);
	    	} catch (ArithmeticException e) {
		    	error = true;
		    	System.err.println("Arithmetic Exception :(");
		    }
	    }
	    else if (op1 != null && op2 != null && ctx.getChild(1).getText().equals("/")) {
	    	try {
	    		stack.push(op2 / op1);
	    	} catch (ArithmeticException e) {
		    	error = true;
		    	System.err.println("Arithmetic Exception :(");
		    }
	    }
	    else if (op1 != null && op2 != null) {
	    	try {
	    		stack.push(op2 % op1);
	    	} catch (ArithmeticException e) {
		    	error = true;
		    	System.err.println("Arithmetic Exception :(");
		    }
	    }
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIntLiteral(IntLiteralContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIntLiteral(IntLiteralContext ctx) { 
		try {
			int input = Integer.parseInt(ctx.integer().getText());
			stack.push(input);
		} catch (NumberFormatException e) {
			System.err.println("Invalid integer :(");
			error = true;
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAddOrSubtract(AddOrSubtractContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAddOrSubtract(AddOrSubtractContext ctx) {
		Integer op1 = null, op2 = null;
		try {
			op1 = stack.pop();
		    op2 = stack.pop();
		} catch (Exception e) {
			error = true;
		}
	    if (op1 != null && op2 != null && ctx.getChild(1).getText().equals("-"))
	    {
	    	try {
		    	int result = Math.subtractExact(op2, op1);
		    	stack.push(result);
	    	} catch (ArithmeticException e) {
		    	error = true;
		    	System.err.println("Arithmetic Exception :(");
		    }
	    }
	    else if (op1 != null && op2 != null)
	    {
	    	try {
	    		int result = Math.addExact(op1, op2);
	    		stack.push(result);
	    	} catch (ArithmeticException e) {
		    	error = true;
		    	System.err.println("Arithmetic Exception :(");
		    }
	    }
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParenExpr(ParenExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParenExpr(ParenExprContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) {
	}
	
	public void notifyError(String errorMsg) {
		error = true;
	}

	@Override
	public void enterMain_func(Main_funcContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exitMain_func(Main_funcContext ctx) {
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
	public void enterParams2(Params2Context ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exitParams2(Params2Context ctx) {
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
	public void enterFunc(FuncContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exitFunc(FuncContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void enterMain_func(Main_funcContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exitMain_func(Main_funcContext ctx) {
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
	public void enterParams2(Params2Context ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exitParams2(Params2Context ctx) {
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
	public void enterFunc_define(Func_defineContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exitFunc_define(Func_defineContext ctx) {
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
	public void enterNum_val(Num_valContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exitNum_val(Num_valContext ctx) {
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
	public void enterLogical_operator(Logical_operatorContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exitLogical_operator(Logical_operatorContext ctx) {
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
}