// Generated from ExpCalculator.g4 by ANTLR 4.5.2

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.Stack;

/**
 * This class provides an empty implementation of {@link ExpCalculatorListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class ExpListener implements ExpCalculatorListener {
	Stack<Integer> stack = new Stack<Integer>();
	boolean error = false;
	
	@Override public void enterStart(ExpCalculatorParser.StartContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStart(ExpCalculatorParser.StartContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement(ExpCalculatorParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement(ExpCalculatorParser.StatementContext ctx) throws RuntimeException {
		if (!error)
			System.out.println(stack.pop());
		else
			System.err.println("Error :(");
		stack = new Stack<Integer>();
		error = false;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInteger(ExpCalculatorParser.IntegerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInteger(ExpCalculatorParser.IntegerContext ctx) { 
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnary_op(ExpCalculatorParser.Unary_opContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnary_op(ExpCalculatorParser.Unary_opContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMultOrDiv(ExpCalculatorParser.MultOrDivContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMultOrDiv(ExpCalculatorParser.MultOrDivContext ctx) {
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
	    	} catch (Exception e) {
		    	error = true;
		    }
	    }
	    else if (op1 != null && op2 != null && ctx.getChild(1).getText().equals("/")) {
	    	try {
	    		stack.push(op2 / op1);
	    	} catch (Exception e) {
	    		error = true;
	    	}
	    }
	    else if (op1 != null && op2 != null) {
	    	try {
	    		stack.push(op2 % op1);
	    	} catch (Exception e) {
	    		error = true;
	    	}
	    }
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIntLiteral(ExpCalculatorParser.IntLiteralContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIntLiteral(ExpCalculatorParser.IntLiteralContext ctx) { 
		stack.push(Integer.parseInt(ctx.integer().getText()));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAddOrSubtract(ExpCalculatorParser.AddOrSubtractContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAddOrSubtract(ExpCalculatorParser.AddOrSubtractContext ctx) {
		Integer op1 = null, op2 = null;
		try {
			op1 = stack.pop();
		    op2 = stack.pop();
		} catch (Exception e) {
			error = true;
		}
	    if (op1 != null && op2 != null && ctx.getChild(1).getText().equals("-"))
	    {
	      stack.push(op2 - op1);
	    }
	    else if (op1 != null && op2 != null)
	    {
	      stack.push(op1 + op2);
	    }
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParenExpr(ExpCalculatorParser.ParenExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParenExpr(ExpCalculatorParser.ParenExprContext ctx) { }

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
}