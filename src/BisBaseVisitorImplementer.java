

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import bis.is.it.BisBaseVisitor;
import bis.is.it.BisParser;
import bis.is.it.BisParser.Func_defineContext;

public class BisBaseVisitorImplementer extends BisBaseVisitor<Value>{
	
	private boolean hasError;
	private ArrayList<Function> masterFuncList;
	private Stack<Scope> scopes;
	
	public BisBaseVisitorImplementer(){
		hasError = false;
		masterFuncList = new ArrayList<Function>();
		scopes = new Stack<Scope>();
		scopes.push(new Scope(ScopeType.GLOBAL, "Global"));
	}
	
	public boolean getHasError(){
		return hasError;
	}
	
	/*Data Type*/
	public Value visitData_type(BisParser.Data_typeContext ctx) {
		Value val = null;
		if (ctx.getChild(0) == ctx.BOOLEAN_TYPE())
			val = new Value("boolean");
		if (ctx.getChild(0) == ctx.CHAR_TYPE())
			val = new Value("char");
		if (ctx.getChild(0) == ctx.INT_TYPE())
			val = new Value("integer");
		if (ctx.getChild(0) == ctx.STRING_TYPE())
			val = new Value("String");
		if (ctx.getChild(0) == ctx.FLOAT_TYPE())
			val = new Value("float");
		return val;
	}
	
	/*Variable Declaration*/
	@Override
	public Value visitSingleVar(BisParser.SingleVarContext ctx) {
		//TODO: Add type checking for variable declaration and check if assignment is legit
		Value val = null;
		if (ctx.assignment() != null)
			val = new Value(this.visit(ctx.assignment().val()));
		Variable var = new Variable(this.visit(ctx.data_type()).asString(), ctx.VAR_IDENTIFIER().getText(), val);
		scopes.peek().bind(var);
		
//		if (scopes.peek().lookup(var.getName()) != null) {
//			Variable test = (Variable) scopes.peek().lookup(var.getName());
//			System.out.println(test.getDataType());
//		}
		return Value.VOID;
	}
	
	/*Array Declaration*/
	@Override
	public Value visitArrayVar(BisParser.ArrayVarContext ctx) {
		//TODO: Add type checking for variable name declaration
		Value val = new Value(null, Integer.parseInt(ctx.arr().DIGIT().getText()));
		Variable var = new Variable(this.visit(ctx.data_type()).asString() + "[]", ctx.VAR_IDENTIFIER().getText(), val);
		scopes.peek().bind(var);
		
		return Value.VOID;
	}
	
	/*Constant Declaration*/
	public Value visitConsvardec_state(BisParser.Consvardec_stateContext ctx) {
		//TODO: Add type checking for variable name declaration and check if assignment is legit
		Value val = new Value(this.visit(ctx.assignment().val()));
		Variable var = new Variable("*static " + this.visit(ctx.data_type()).asString(), ctx.VAR_IDENTIFIER().getText(), val);
		scopes.peek().bind(var);
		
		return Value.VOID;
	}
	
	/*Assignment Statement*/
	@Override
	public Value visitNormalAssign(BisParser.NormalAssignContext ctx) {
		//TODO: Add type checking to check if variable exists, is an array if array siya, if kasya sa array, check if variable is not static, check if value assigned is legit
		String id = ctx.VAR_IDENTIFIER().getText();
		if (ctx.arr() != null) {
			id += "[]";
		}
		Variable var = (Variable) scopes.peek().lookup(id);
		
		if (ctx.arr() != null) {
			var.getValue().setValueAt(Integer.parseInt(ctx.arr().DIGIT().getText()), this.visit(ctx.assignment().val()));
		}
		else {
			var.setValue(new Value(this.visit(ctx.assignment().val())));
		}

		return Value.VOID;
	}
	
	/*Assignment Operator*/
	@Override
	public Value visitAss_state_operator(BisParser.Ass_state_operatorContext ctx) {
		//TODO: Add type checking to check if variable exists, is an array if array siya, if kasya sa array, check if pwede talaga i-increment/decrement (check if char, int, double)
		String id = ctx.VAR_IDENTIFIER().getText();
		if (ctx.arr() != null) {
			id += "[]";
		}
		Variable var = (Variable) scopes.peek().lookup(id);
		if (ctx.ass_operator().getChild(0) == ctx.ass_operator().INCREMENT_OPERATOR()) {
			if (ctx.arr() != null) {
				var.getValue().setValueAt(Integer.parseInt(ctx.arr().DIGIT().getText()), var.getValue().asDouble() + 1);
			}
			else {
				var.setValue(new Value(var.getValue().asDouble() + 1));
			}
		}
		else if (ctx.ass_operator().getChild(0) == ctx.ass_operator().DECREMENT_OPERATOR()) {
			if (ctx.arr() != null) {
				var.getValue().setValueAt(Integer.parseInt(ctx.arr().DIGIT().getText()), var.getValue().asDouble() - 1);
			}
			else {
				var.setValue(new Value(var.getValue().asDouble() - 1));
			}
		}
		return var.getValue();
	}
	/////////////////////////////////////////////////////////
	/*Numerical Values*/

	/*Integer Literal*/
	@Override
	public Value visitIntegerLiteral(BisParser.IntegerLiteralContext ctx){
		int literal = Integer.parseInt(ctx.DIGIT().getText());
		if (ctx.unary_op() != null) {
			if (ctx.unary_op().getText().equals("-"))
				literal = literal * -1;
		}
		return new Value(literal);
	}
	
	/*Float Literal*/
	@Override
	public Value visitFloatLiteral(BisParser.FloatLiteralContext ctx){
		//TODO: type checking
		float literal = Float.parseFloat(ctx.FLOAT().getText());
		if (ctx.unary_op() != null) {
			if (ctx.unary_op().getText().equals("-"))
				literal = literal * -1;
		}
		if (ctx.EXPONENT() != null) {
			double exponent = Double.parseDouble(ctx.EXPONENT().getText().replace("^", ""));
			literal = (float) Math.pow(literal, exponent);
		}
		return new Value(literal);
	}
	
	/*Value of a Variable*/
	@Override
	public Value visitVarIdentifier(BisParser.VarIdentifierContext ctx){
		//TODO: type checking
		String id = ctx.VAR_IDENTIFIER().getText();
		Variable var = (Variable) scopes.peek().lookup(id);
		if (var != null)
			return var.getValue();
		else
			return null;
	}
	
	/*Value of Character*/
	@Override
	public Value visitCharLiteral(BisParser.CharLiteralContext ctx){
		//TODO: type checking
		return new Value((char)ctx.getText().replaceAll("'", "").charAt(0));
	}
	
	/*Value of an Array Variable*/
	@Override
	public Value visitArrayIdentifier(BisParser.ArrayIdentifierContext ctx){
		//TODO: type checking
		String id = ctx.VAR_IDENTIFIER().getText() + "[]";
		Variable var = (Variable) scopes.peek().lookup(id);
		if (var != null)
			return var.getValue().getValueAt(Integer.parseInt(ctx.arr().DIGIT().getText()));
		else
			return null;
	}
	
	/*Value of a Function Call*/
	@Override
	public Value visitFunctionCall(BisParser.FunctionCallContext ctx){
		//TODO: check if function returns legit etc etc
		return null;
	}
	//////////////////////////////////////////////////////////////////////////////
	/*Expressions na itu*/
	
	/*Parenthesis Expr*/
	@Override
    public Value visitParenExpr(BisParser.ParenExprContext ctx){
        return this.visit(ctx.expr());
    }
	
	/*Multiplication and Division*/
	@Override
	public Value visitMultOrDiv(BisParser.MultOrDivContext ctx){
		//TODO: type check if pwede i multiply/div/mod sila
		//TODO: check if math execptions
		Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
       
        if (ctx.getChild(1).getText().equals("*")) {
        	return new Value(left.asDouble() * right.asDouble());
        }
        else if (ctx.getChild(1).getText().equals("/")) {
        	return new Value(left.asDouble() / right.asDouble());
        }
        else if (ctx.getChild(1).getText().equals("%")) {
        	return new Value(left.asDouble() % right.asDouble());
        }
        else
        	return null;
	}
	
	/*Addition or Subtraction*/
	@Override
	public Value visitAddOrSubtract(BisParser.AddOrSubtractContext ctx){
		//TODO: type check if pwede i add/subtract sila
		//TODO: check if math execptions
		Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
       
        if (ctx.getChild(1).getText().equals("+")) {
        	return new Value(left.asDouble() + right.asDouble());
        }
        else if (ctx.getChild(1).getText().equals("-")) {
        	return new Value(left.asDouble() - right.asDouble());
        }
        else
        	return null;		
	}
	
	/*String Concat with String*/
	@Override
	public Value visitStringConcatString(BisParser.StringConcatStringContext ctx){
		//TODO: type check ewan basta mag type check ka dito!!!!
		Value left = this.visit(ctx.getChild(0));
		Value right = this.visit(ctx.getChild(2));
		return new Value(left.asString() + right.asString());
	}
	
	/*String Concat with Expression*/
	@Override
	public Value visitStringConcatExpr(BisParser.StringConcatExprContext ctx){
		//TODO: type check for both r string
		Value left = this.visit(ctx.getChild(0));
		Value right = this.visit(ctx.getChild(2));
		return new Value(left.asString() + right.asString());
	}
	
	/*String Literal*/
	@Override
	public Value visitStringLiteral(BisParser.StringLiteralContext ctx){
		return new Value(ctx.STRING().getText());
	}
	
	/*Boolean Literal*/
	@Override
	public Value visitBooleanLiteral(BisParser.BooleanLiteralContext ctx){
		boolean boolLiteral = false;
		if (ctx.getChild(0).getText().equals("tinood"))
			boolLiteral = true;
		return new Value(boolLiteral);
	}
	
	/*Papa Expression in Conditions*/
	@Override
	public Value visitExpression(BisParser.ExpressionContext ctx){
		return this.visit(ctx.expr());
	}
	
	/*Parenthesis Conditions + Possible Negation*/
	@Override
	public Value visitParenCondition(BisParser.ParenConditionContext ctx){
		//TODO: type checking uhhhh yung conditions na pwede i negate
		if (ctx.NOT_OPERATOR() != null)
			return new Value(!this.visit(ctx.condition()).asBoolean());
		else
			return this.visit(ctx.condition());
	}
	
	/*And Condition*/
	@Override
	public Value visitAndCondition(BisParser.AndConditionContext ctx){
		//TODO: type check for stuff to compare
		Value left = this.visit(ctx.getChild(0));
		Value right = this.visit(ctx.getChild(2));
		return new Value(left.asBoolean() && right.asBoolean());
	}
	
	/*Or Condition*/
	@Override
	public Value visitOrCondition(BisParser.OrConditionContext ctx){
		//TODO: type check for stuff to compare
		Value left = this.visit(ctx.getChild(0));
		Value right = this.visit(ctx.getChild(2));
		return new Value(left.asBoolean() || right.asBoolean());
	}
	
	/*Condition Operator*/
	@Override
	public Value visitConditionOperator(BisParser.ConditionOperatorContext ctx){
		//TODO: type check for stuff to compare
		Value left = this.visit(ctx.getChild(0));
		Value right = this.visit(ctx.getChild(2));
		boolean result = false;
		if (ctx.getChild(1) == ctx.cond_operator().LESS_THAN_OPERATOR()){
			result = left.asDouble() < right.asDouble();
		}
		else if (ctx.getChild(1) == ctx.cond_operator().LESS_THAN_EQUAL_TO_OPERATOR()){
			result = left.asDouble() <= right.asDouble();
		}
		else if (ctx.getChild(1) == ctx.cond_operator().GREATER_THAN_EQUAL_TO_OPERATOR()){
			result = left.asDouble() >= right.asDouble();
		}
		else if (ctx.getChild(1) == ctx.cond_operator().GREATER_THAN_OPERATOR()){
			result = left.asDouble() > right.asDouble();
		}
		else if (ctx.getChild(1) == ctx.cond_operator().EQUAL_TO_OPERATOR()){
			result = left.asDouble() == right.asDouble();
		}
		else if (ctx.getChild(1) == ctx.cond_operator().NOT_EQUAL_TO_OPERATOR()){
			result = left.asDouble() != right.asDouble();
		}
		return new Value(result);
	}
	
	/*Conditional Statements*/
	@Override
	public Value visitCond_state(BisParser.Cond_stateContext ctx){
		List<BisParser.Cond_blockContext> conditions =  ctx.cond_block();
	    boolean evaluatedBlock = false;

	    for(BisParser.Cond_blockContext condition : conditions) {
	    	Value evaluated = this.visit(condition.condition());
	        if(evaluated.asBoolean()) {
	        	evaluatedBlock = true;
	            // evaluate this block whose expr==true
	            this.visit(condition.codeblock());
	            break;
	        }
	    }
	    if(!evaluatedBlock && ctx.codeblock() != null) {
	    	// evaluate the else-stat_block (if present == not null)
	        this.visit(ctx.codeblock());
	    }

	    return Value.VOID;
	}
	
	/*Loop Statements*/
	@Override
	public Value visitWhile_state(BisParser.While_stateContext ctx){
		Value value = this.visit(ctx.condition());
        while(value.asBoolean()) {
            // evaluate the code block
            this.visit(ctx.codeblock());

            // evaluate the expression
            value = this.visit(ctx.condition());
        }
        return Value.VOID;
	}
	
	@Override
	public Value visitDo_while_state(BisParser.Do_while_stateContext ctx){
		Value value = this.visit(ctx.condition());
		this.visit(ctx.codeblock());
        while(value.asBoolean()) {
            // evaluate the code block
            this.visit(ctx.codeblock());

            // evaluate the expression
            value = this.visit(ctx.condition());
        }
        return Value.VOID;
	}
	
	@Override
	public Value visitFor_state(BisParser.For_stateContext ctx){
		this.visit(ctx.ass_state());
		Value value = this.visit(ctx.condition());
		
        while(value.asBoolean()) {
            // evaluate the code block
            this.visit(ctx.codeblock());
            
            //increment
            this.visit(ctx.ass_state_operator());
            
            // evaluate the expression
            value = this.visit(ctx.condition());
        }
        return Value.VOID;
	}
	
	/*Function Data Type*/
	public Value visitFunc_data_type(BisParser.Func_data_typeContext ctx) {
		if (ctx.getChild(0) == ctx.VOID_TYPE())
			return new Value("void");
		else
			return this.visit(ctx.data_type());
	}
	
	/*Function Definition*/
	@Override 
	public Value visitFunc_define(BisParser.Func_defineContext ctx){
		List<BisParser.FuncContext> functions =  ctx.func();
		
		for(BisParser.FuncContext function : functions) {
			String returnType = this.visit(function.func_data_type()).asString();
			List<BisParser.ParamsContext> params =  function.params();
			ArrayList<Variable> paramList = new ArrayList<Variable>();
			String signature = function.FUNC_IDENTIFIER().getText() + "(";
			
			for(BisParser.ParamsContext param : params) {
				String datatype = this.visit(param.data_type()).asString();
				paramList.add(new Variable(datatype, param.VAR_IDENTIFIER().getText(), null));
				signature += datatype + ",";
			}
			if (signature.charAt(signature.length() - 1) != '(')
				//signature[signature.length()-1] = ')'
				;
			else
				signature += ")";
			masterFuncList.add(new Function(returnType, signature, paramList, function));
		}
		
		ArrayList<String> stringList = new ArrayList<String>(Arrays.asList(ctx.getText().split(">>")));
		ArrayList<String> funcNameAndReturnType;
		

		
		
		//funcNameAndReturnType = new ArrayList<String>(Arrays.asList(stringList.get(0).split("func.")));
		//varList = new ArrayList<String>(Arrays.asList(stringList.get(1).split(",")));
		
		//STORE FUNC SIGNATURE AND RETURN TYPE
		String returnType, signature;
//		returnType = funcNameAndReturnType.get(0);
//		signature = "_" + funcNameAndReturnType.get(1);
		
		//STORE FUNC PARAMS 
		Variable var;
		String[] varArr = new String[2];
		String varName = "";
			
		
		
		//masterFuncList.add(new Function(returnType, signature, paramList));
		
		
		//FOR DEBUGGING PURPOSES
		for(int i = 0; i < masterFuncList.size(); i++){
			//System.out.println(masterFuncList.get(i).toString());
		}
		
		return Value.VOID; 
	}
	
	/*Function Call*/
	@Override
	public Value visitFunc_call(BisParser.Func_callContext ctx){
		Value returnValue = null;
		
		//Get function name and data types of parameters
		
		//TODO: check if funciton exists
		//Function calledFunc = 
		
		//Push function into scope
		//scopes.push(new Scope(ScopeType.LOCAL, ));
		
		//Run codeblock
		
		//Pop function from scope
		
		//Return value if any
		
		return returnValue;
	}
	
	/*Personal Functions*/
	public Function findFunction(String signature, String returntype) {
		for (int i = 0; i < masterFuncList.size(); i++)
			if (masterFuncList.get(i).getSignature().equals(signature) && returntype.equals(masterFuncList.get(i).getReturn_type()))
				return masterFuncList.get(i);
		return null;
	}
}
