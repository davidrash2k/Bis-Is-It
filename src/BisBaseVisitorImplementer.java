

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.JOptionPane;

import bis.is.it.BisBaseVisitor;
import bis.is.it.BisParser;
import bis.is.it.BisParser.Func_defineContext;

public class BisBaseVisitorImplementer extends BisBaseVisitor<Value>{
	
	protected static String executionMode;
	private boolean hasError;
	private ArrayList<Function> masterFuncList;
	private Stack<Scope> scopes;
	private Scanner sc;
	private BisIsItGUI gui;
	
	public BisBaseVisitorImplementer(){
		hasError = false;
		masterFuncList = new ArrayList<Function>();
		sc = new Scanner(System.in);
		scopes = new Stack<Scope>();
		scopes.push(new Scope(ScopeType.GLOBAL, "Global", null));

	}
	
	public void setGUI(BisIsItGUI gui) {
		this.gui = gui;
	}
	
	public boolean getHasError(){
		return hasError;
	}
	
	public Value visitMainFunc(BisParser.MainFuncContext ctx) {
		scopes.push(new Scope(ScopeType.LOCAL, "Main", null));
		visitChildren(ctx);
		return Value.VOID;
	}
	
	public void refreshCallStack() {
		String t = "";
		Iterator<Scope> it1 = scopes.iterator();
		while (it1.hasNext()) {
			t += it1.next().getName() + "\n";
		}
			
		gui.ta_functionStack.setText(t);
	}
	
	public void refreshSymbolTable() {
		String t = "";
		Iterator it1 = scopes.peek().getSymbolMap().entrySet().iterator();
		while (it1.hasNext()) {
			Map.Entry pair = (Map.Entry) it1.next();
			t += pair.getKey() + "-" + pair.getValue() + "\n";
		}
			
		gui.ta_symbolTable.setText(t);
	}
	
	public Value visitStatement(BisParser.StatementContext ctx){
		refreshCallStack();
		refreshSymbolTable();

		if(executionMode == "lineByLine"){
			JOptionPane.showMessageDialog(null, "Press OK to continue", "Alert", 1);	
		}
		
		visitChildren(ctx);
		
		return Value.VOID;
	}
	
	/*Data Type*/
	public Value visitData_type(BisParser.Data_typeContext ctx) {
		Value val = null;
		if (ctx.getChild(0) == ctx.BOOLEAN_TYPE())
			val = new Value("boolean");
		if (ctx.getChild(0) == ctx.CHAR_TYPE())
			val = new Value("char");
		if (ctx.getChild(0) == ctx.INT_TYPE())
			val = new Value("int");
		if (ctx.getChild(0) == ctx.STRING_TYPE())
			val = new Value("String");
		if (ctx.getChild(0) == ctx.FLOAT_TYPE())
			val = new Value("float");
		return val;
	}
	
	/*Variable Declaration*/
	@Override
	public Value visitSingleVar(BisParser.SingleVarContext ctx) {
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
		if(scopes.peek().lookup(ctx.VAR_IDENTIFIER().getText()) != null)
		{
			hasError = true;
		}
		
		if(hasError == false)
		{
			Value val = new Value(null, Integer.parseInt(ctx.arr().DIGIT().getText()));
			Variable var = new Variable(this.visit(ctx.data_type()).asString() + "[" + Integer.parseInt(ctx.arr().DIGIT().toString()) + "]", ctx.VAR_IDENTIFIER().getText(), val);
			scopes.peek().bind(var);
//			System.out.println("BINDED in var declaration");
//			System.out.println(var.getName().toString());
//			System.out.println(var.toString());
		}
		
		
		return Value.VOID;
	}
	
	/*Constant Declaration*/
	public Value visitConsvardec_state(BisParser.Consvardec_stateContext ctx) {
Value val = new Value(this.visit(ctx.assignment().val()));
		
		if(scopes.peek().lookup(ctx.VAR_IDENTIFIER().getText()) != null)
		{
			hasError = true;
		}
		
		try
		{
			Double d = new Double(val.asDouble());
			if((Integer)d.intValue() instanceof Integer)
			{
				//System.out.println("Integer");
			}
			else if(val.asString() instanceof String)
			{
				//System.out.println("String");
			}
			else if(val.asDouble() instanceof Double)
			{
				//System.out.println("Float");
			}
			else if(val.asChar() instanceof Character)
			{
				//System.out.println("Char");
			}
			else if(val.asBoolean() instanceof Boolean)
			{
				//System.out.println("Boolean");
			}
				
		}catch(Exception e)
		{
			hasError = true;
			System.out.println("Exception thrown  :" + e);
		}
		
		if(hasError == false)
		{
			Variable var = new Variable("*static " + this.visit(ctx.data_type()).asString(), ctx.VAR_IDENTIFIER().getText(), val);
			scopes.peek().bind(var);
			//System.out.println("BINDED in constant declaration");
		}
		
		
		return Value.VOID;
	}
	
	/*Assignment Statement*/
	@Override
	public Value visitNormalAssign(BisParser.NormalAssignContext ctx) {
		String id = ctx.VAR_IDENTIFIER().getText();
		/*
		if (ctx.arr() != null) {
			id += "[]";
		}
		*/
		Variable var = (Variable) scopes.peek().lookup(id);
//		System.out.println("this is the id : " + id);
//		System.out.println(var.getDataType());
		int x = var.getDataType().indexOf("[");
//		System.out.println(x);
//		System.out.println(var.getDataType().charAt(x + 1));
//		System.out.println("new ? " + ctx.VAR_IDENTIFIER().toString());
//		
//		System.out.println("before checking if array " + hasError);
		if(ctx.arr() != null)
		{
			x = var.getDataType().indexOf("[");
			//System.out.println(Integer.parseInt(ctx.arr().DIGIT().getText()));
			if(var.getDataType().charAt(x + 1) > ctx.arr().DIGIT().getText().charAt(0))
			{
				System.out.println("I'm in");
				
			}
			else
				hasError = true;
		}
		
		Value val = new Value(this.visit(ctx.assignment().val()));
		//System.out.println("Before the Shit fuck this motha " + var.getValue());
		//var.setValue(new Value(this.visit(ctx.assignment().val())));
		//System.out.println("Shit fuck this motha " + var.getValue());
		
		//System.out.println("before checking contains var name " + hasError);
		if(scopes.peek().lookup(ctx.VAR_IDENTIFIER().getText()) == null)
		{
			hasError = true;
			System.out.println("error here in checking for var name");
		}
		//System.out.println("before checking static " + hasError);
		if(var.getDataType().contains("*static"))
		{
			hasError = true;
			System.out.println("Assignment invalid. Variable static");
		}
		//System.out.println("before checking instances " + hasError);
		try
		{
			Double d = (double) 0;
			if(val.asString().contains("."))
				d = new Double(val.asDouble());
			if((Integer)d.intValue() instanceof Integer)
			{
//System.out.println("Integer");
			}
			else if(val.asString() instanceof String)
			{
				//System.out.println("String");
			}
			else if(val.asDouble() instanceof Double)
			{
				//System.out.println("Float");
			}
			else if(val.asChar() instanceof Character)
			{
				//System.out.println("Char");
			}
			else if(val.asBoolean() instanceof Boolean)
			{
				//System.out.println("Boolean");
			}
				
		}catch(Exception e)
		{
			hasError = true;
			System.out.println("Exception thrown  in assignment statement: ");
			e.printStackTrace();
		}
		//System.out.println("Before checking for error " + hasError);
		if(hasError == false)
		{
			if (ctx.arr() != null) {
//				System.out.println("index " + Integer.parseInt(ctx.arr().DIGIT().getText()));
//				System.out.println("value " + this.visit(ctx.assignment().val()));
//				System.out.println(var.getName().toString());
//				System.out.println(var.getValue().asString());
//				System.out.println(var.toString());
				var.getValue().setValueAt(Integer.parseInt(ctx.arr().DIGIT().getText()), this.visit(ctx.assignment().val()));
				//System.out.println("array? " + var.getValue());
				
				// not working
			}
			else {
//				System.out.println(var.getValue().toString());
//				System.out.println(this.visit(ctx.assignment().val()));
				var.setValue(new Value(this.visit(ctx.assignment().val())));
				//System.out.println("not an array " + var.getValue());
			}
		}
//		System.out.println("Motha shit yo " + var.getValue().toString());

		return Value.VOID;
	}
	
	/*Assignment Operator*/
	@Override
	public Value visitAss_state_operator(BisParser.Ass_state_operatorContext ctx) {
		//TODO: Add type checking to check if variable exists, is an array if array siya, if kasya sa array, check if pwede talaga i-increment/decrement (check if char, int, double)
		String id = ctx.VAR_IDENTIFIER().getText();
		/*
		if (ctx.arr() != null) {
			id += "[]";
		}
		*/
		Variable var = (Variable) scopes.peek().lookup(id);
		
		if(ctx.arr() != null)
		{
			int x = var.getDataType().indexOf("[");
			//System.out.println(Integer.parseInt(ctx.arr().DIGIT().getText()));
			if(var.getDataType().charAt(x + 1) > ctx.arr().DIGIT().getText().charAt(0))
			{
				//System.out.println("I'm in");
				
			}
			else
				hasError = true;
		}
		
		if(scopes.peek().lookup(ctx.VAR_IDENTIFIER().getText()) == null)
		{
			hasError = true;
		}
		Double d = (double) 0;
		try
		{
			if(!(var.getValue().asString().contains(".")))
        		d = new Double(var.getValue().asInt().intValue());
			
			if((Integer)d.intValue() instanceof Integer)
			{
				//System.out.println("Integer");
			}
			else if(var.getValue().asDouble() instanceof Double)
			{
				//System.out.println("Float");
			}
			else if(var.getValue().asChar() instanceof Character)
			{
				//System.out.println("Char");
			}
			
				
		}catch(Exception e)
		{
			hasError = true;
			System.out.println("Exception thrown  in assignment operator:" + e);
		}
		
		//System.out.println("CHECK YOOO " + hasError);
		if(hasError == false)
		{
			Value val = null;
			//System.out.println("THIS SHIT GOT IN");
			if (ctx.ass_operator().getChild(0) == ctx.ass_operator().INCREMENT_OPERATOR()) {
				if (ctx.arr() != null) 
				{
					if(!(var.getValue().asString().contains(".")))
		        	{
		        		val =  new Value(((Integer)d.intValue() + 1));
		        		var.getValue().setValueAt(Integer.parseInt(ctx.arr().DIGIT().getText()), val);
		        	}
					else 
					{
						val = new Value(var.getValue().asDouble() + 1);
						var.getValue().setValueAt(Integer.parseInt(ctx.arr().DIGIT().getText()), val);
					}
				}
				else
				{
					if(!(var.getValue().asString().contains(".")))
		        	{
		        		var.setValue(new Value(((Integer)d.intValue() + 1)));
		        	}
					else 
					{
						var.setValue(new Value(var.getValue().asDouble() + 1));
					}
				}
			}
			else if (ctx.ass_operator().getChild(0) == ctx.ass_operator().DECREMENT_OPERATOR()) {
				if (ctx.arr() != null) 
				{
					if(!(var.getValue().asString().contains(".")))
		        	{
		        		val =  new Value(((Integer)d.intValue() - 1));
		        		var.getValue().setValueAt(Integer.parseInt(ctx.arr().DIGIT().getText()), val);
		        	}
					else 
					{
						val = new Value(var.getValue().asDouble() - 1);
						var.getValue().setValueAt(Integer.parseInt(ctx.arr().DIGIT().getText()), val);
					}
				}
				else
				{
					if(!(var.getValue().asString().contains(".")))
		        	{
		        		var.setValue(new Value(((Integer)d.intValue() - 1)));
		        	}
					else 
					{
						var.setValue(new Value(var.getValue().asDouble() - 1));
					}
				}
			}
		}
		//System.out.println(var.getValue());
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
		//System.out.println(literal);
		return new Value(literal);
	}
	
	/*Float Literal*/
	@Override
	public Value visitFloatLiteral(BisParser.FloatLiteralContext ctx){
		//TODO: type checking
		float literal = 0;
		try
		{
			if((Float) Float.parseFloat(ctx.FLOAT().getText()) instanceof Float)
			{
				//System.out.println("Float");
				literal = Float.parseFloat(ctx.FLOAT().getText());
			}
		}catch(Exception e)
		{
			hasError = true;
			System.out.println("Exception thrown  in float literal:" + e);
		}
		
		if(hasError == false)
		{
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
		return null;
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
		Value val = new Value((char)ctx.getText().replaceAll("'", "").charAt(0));
		try
		{
			if(val.asChar() instanceof Character)
			{
				//System.out.println("Character");
			}
		}catch(Exception e)
		{
			hasError = true;
			System.out.println("Exception thrown  in char literal:" + e);
		}
		if(hasError == false)
			return val;
		return null;
	}
	
	/*Value of an Array Variable*/
	@Override
	public Value visitArrayIdentifier(BisParser.ArrayIdentifierContext ctx){
		//TODO: type checking
		String id = ctx.VAR_IDENTIFIER().getText();
		Variable var = (Variable) scopes.peek().lookup(id);
		
		if(ctx.arr() != null)
		{
			int x = var.getDataType().indexOf("[");
			//System.out.println(Integer.parseInt(ctx.arr().DIGIT().getText()));
			if(var.getDataType().charAt(x + 1) > ctx.arr().DIGIT().getText().charAt(0))
			{
				//System.out.println("I'm in visiting");
				
			}
			else
				hasError = true;
		}
		
		if (var != null && hasError == false)
			return var.getValue().getValueAt(Integer.parseInt(ctx.arr().DIGIT().getText()));
		else
			return null;
	}
	
	/*Value of a Function Call*/
	@Override
	public Value visitFunctionCall(BisParser.FunctionCallContext ctx){
		return this.visit(ctx.func_call());
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
		Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        
        Double d = (double) 0;
        Double dd = (double) 0;
        try
		{
        	if(!(left.asString().contains(".")))
        		d = new Double(left.asInt().intValue());
        	if(!(right.asString().contains(".")))
				dd = new Double(right.asInt().intValue());
        	
        	if((Integer)d.intValue() instanceof Integer && (Integer)dd.intValue() instanceof Integer && !(left.asString().contains(".")) && !(right.asString().contains(".")))
			{
        		//System.out.println("add or sub Int-Int");
			}
			else if((Integer)d.intValue() instanceof Integer && right.asDouble() instanceof Double&& !(left.asString().contains(".")))
			{
				//System.out.println("add or sub Int-Float");
			}
			else if(left.asDouble() instanceof Double && (Integer)d.intValue() instanceof Integer&& !(right.asString().contains(".")))
			{
				//System.out.println("add or sub Float-Int");
			}
			else if(left.asDouble() instanceof Double && right.asDouble() instanceof Double)
			{
				//System.out.println("add or sub Float-Float");
			}
				
		}catch(Exception e)
		{
			hasError = true;
			System.out.println("Exception thrown  in Mult or Div" + e);
		}
        
        if(hasError == false)
        {
        	Value val = null;
        	try
        	{
        		if (ctx.getChild(1).getText().equals("*")) {
            		if(!(left.asString().contains(".")) && !(right.asString().contains(".")))
    	        	{
    	        		//System.out.println("CHECK " + ((Integer)d.intValue() * (Integer)dd.intValue()));	
    	        		val =  new Value(((Integer)d.intValue() * (Integer)dd.intValue()));
    	        	}
    	        	else
    	        	{
    	        		//System.out.println("CHECK " + (new Double(left.toString()) * new Double(right.toString())));
    	        		val = new Value(new Double(left.toString()) * new Double(right.toString()));
    	        	}
                }
                else if (ctx.getChild(1).getText().equals("/")) {
                	if(!(left.asString().contains(".")) && !(right.asString().contains(".")))
    	        	{
    	        		//System.out.println("CHECK " + ((Integer)d.intValue() / (Integer)dd.intValue()));	
                		val =  new Value(((Integer)d.intValue() / (Integer)dd.intValue()));
    	        	}
    	        	else
    	        	{
    	        		//System.out.println("CHECK " + (new Double(left.toString()) / new Double(right.toString())));
    	        		val =  new Value(new Double(left.toString()) / new Double(right.toString()));
    	        	}
                }
                else if (ctx.getChild(1).getText().equals("%")) {
                	if(!(left.asString().contains(".")) && !(right.asString().contains(".")))
    	        	{
                		//System.out.println("CHECK " + ((Integer)d.intValue() % (Integer)dd.intValue()));	
                		val =  new Value(((Integer)d.intValue() % (Integer)dd.intValue()));
    	        	}
    	        	else
    	        	{
    	        		//System.out.println("CHECK " + (new Double(left.toString()) % new Double(right.toString())));
    	        		val =  new Value(new Double(left.toString()) % new Double(right.toString()));
    	        	}
                }
        	}catch(Exception e)
        	{
        		//System.out.println("Exception in mult or div ");
        	}
        	
        	return val;
        }
		return null;
	}
	
	/*Addition or Subtraction*/
	@Override
	public Value visitAddOrSubtract(BisParser.AddOrSubtractContext ctx){
		Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        Double d = (double) 0;
        Double dd = (double) 0;
        if(!(left.asString().contains(".")))
    		d = new Double(left.asInt().intValue());
    	if(!(right.asString().contains(".")))
			dd = new Double(right.asInt().intValue());
        try
		{
			if((Integer)d.intValue() instanceof Integer && (Integer)dd.intValue() instanceof Integer && !(left.asString().contains(".")) && !(right.asString().contains(".")))
			{
				//System.out.println("add or sub Int-Int");
			}
			else if((Integer)d.intValue() instanceof Integer && right.asDouble() instanceof Double&& !(left.asString().contains(".")))
			{
				//System.out.println("add or sub Int-Float");
			}
			else if(left.asDouble() instanceof Double && (Integer)d.intValue() instanceof Integer&& !(right.asString().contains(".")))
			{
				//System.out.println("add or sub Float-Int");
			}
			else if(left.asDouble() instanceof Double && right.asDouble() instanceof Double)
			{
				//System.out.println("add or sub Float-Float");
			}
			
				
		}catch(Exception e)
		{
			hasError = true;
			System.out.println("Exception thrown  in Add or Sub");
			e.printStackTrace();
		}
       
        if(hasError == false)
        {
        	Value val = null;
        	
        	try{
        		if (ctx.getChild(1).getText().equals("+")) 
    	        {
    	        	if(!(left.asString().contains(".")) && !(right.asString().contains(".")))
    	        	{
    	        		//System.out.println("CHECK " + ((Integer)d.intValue() + (Integer)dd.intValue()));	
    	        		//System.out.println("CHECK " + (new Double(left.toString()) + new Double(right.toString())));
    		        	val = new Value(((Integer)d.intValue() + (Integer)dd.intValue()));
    	        	}
    	        	else
    	        	{
    	        		//System.out.println("CHECK " + (new Double(left.toString()) + new Double(right.toString())));
    	        		val = new Value(new Double(left.toString()) + new Double(right.toString()));
    	        	}
    	        }
    	        else if (ctx.getChild(1).getText().equals("-")) {
    	        	if(!(left.asString().contains(".")) && !(right.asString().contains(".")))
    	        	{
    	        		//System.out.println("CHECK " + ((Integer)d.intValue() + (Integer)dd.intValue()));	
    	        		val = new Value(((Integer)d.intValue() - (Integer)dd.intValue()));
    	        	}
    	        	else
    	        	{
    	        		//System.out.println("CHECK " + (new Double(left.toString()) + new Double(right.toString())));
    	        		val = new Value(new Double(left.toString()) - new Double(right.toString()));
    	        	}
    	        }
        	}catch(Exception e)
        	{
        		System.out.println("Exception in add or sub ");
        	}
	        
	        return val;
        }
        return null;			
	}
	
	/*Solo String*/
	@Override
	public Value visitSoloerString(BisParser.SoloerStringContext ctx){
		String output = ctx.STRING().getText();
		return new Value(output.substring(1, output.length()-1));
	}
	
	/*String Concat with String*/
	@Override
	public Value visitStringConcatString(BisParser.StringConcatStringContext ctx){
		Value left = this.visit(ctx.getChild(0));
		Value right = this.visit(ctx.getChild(2));
		
		try
		{
			if(left.asString() instanceof String && right.asString() instanceof String)
			{
				//System.out.print("String-String");
			}
				
		}catch(Exception e)
		{
			hasError = true;
			System.out.println("Exception thrown  in String Concat String" + e);
		}
		if(hasError == false)
			return new Value(left.asString() + right.asString());
		return null;
	}
	
	/*String Concat with Expression*/
	@Override
	public Value visitStringConcatExpr(BisParser.StringConcatExprContext ctx){
		//TODO: type check for both r string
		Value left = this.visit(ctx.getChild(0));
		Value right = this.visit(ctx.getChild(2));
		
		try
		{
			if(left.asString() instanceof String && right.asString() instanceof String)
			{
				//System.out.print("String-String (Expr)");
			}
				
		}catch(Exception e)
		{
			hasError = true;
			System.out.println("Exception thrown  in String Concat Expr" + e);
		}
		if(hasError == false)
			return new Value(left.asString() + right.asString());
		return null;
	}
	
	/*String Concat with Function Call*/
	@Override
	public Value visitStringConcatFuncCall(BisParser.StringConcatFuncCallContext ctx){
		Value left = this.visit(ctx.getChild(0));
		Value right = this.visit(ctx.getChild(2));
		return new Value(left.asString().concat(right.asString()));
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
		if (ctx.NOT_OPERATOR() != null)
			return new Value(!this.visit(ctx.condition()).asBoolean());
		else
			return this.visit(ctx.condition());
	}
	
	/*And Condition*/
	@Override
	public Value visitAndCondition(BisParser.AndConditionContext ctx){
		Value left = this.visit(ctx.getChild(0));
		Value right = this.visit(ctx.getChild(2));
		
		try
		{
			if(left.asBoolean() instanceof Boolean && right.asBoolean() instanceof Boolean)
			{
				//System.out.print("Boolean-Boolean");
			}
				
		}catch(Exception e)
		{
			hasError = true;
			System.out.println("Exception thrown  in visit and condition" + e);
		}
		
		if(hasError == false)
		{
			return new Value(left.asBoolean() && right.asBoolean());
		}
		return null;
	}
	
	/*Or Condition*/
	@Override
	public Value visitOrCondition(BisParser.OrConditionContext ctx){
		Value left = this.visit(ctx.getChild(0));
		Value right = this.visit(ctx.getChild(2));
		try
		{
			if(left.asBoolean() instanceof Boolean && right.asBoolean() instanceof Boolean)
			{
				//System.out.print("Boolean-Boolean");
			}
				
		}catch(Exception e)
		{
			hasError = true;
			System.out.println("Exception thrown  in visit or condition" + e);
		}
		
		if(hasError == false)
			return new Value(left.asBoolean() || right.asBoolean());
		return null;
	}
	
	/*Condition Operator*/
	@Override
	public Value visitConditionOperator(BisParser.ConditionOperatorContext ctx){
		Value left = this.visit(ctx.getChild(0));
		Value right = this.visit(ctx.getChild(2));
		boolean result = false;
		if (ctx.getChild(1) == ctx.LESS_THAN_OPERATOR()){
			result = left.asDouble() < right.asDouble();
		}
		else if (ctx.getChild(1) == ctx.LESS_THAN_EQUAL_TO_OPERATOR()){
			result = left.asDouble() <= right.asDouble();
		}
		else if (ctx.getChild(1) == ctx.GREATER_THAN_EQUAL_TO_OPERATOR()){
			result = left.asDouble() >= right.asDouble();
		}
		else if (ctx.getChild(1) == ctx.GREATER_THAN_OPERATOR()){
			result = left.asDouble() > right.asDouble();
		}
		else if (ctx.getChild(1) == ctx.EQUAL_TO_OPERATOR()){
			result = left.asDouble() == right.asDouble();
		}
		else if (ctx.getChild(1) == ctx.NOT_EQUAL_TO_OPERATOR()){
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
		//System.out.println(value.asBoolean());
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
	
	/*Return Statement*/
	public Value visitReturn_state(BisParser.Return_stateContext ctx){
		Value returnValue = this.visit(ctx.val());
//		ctx.parent = scopes.peek().getCaller();
//		scopes.pop();
//		scopes.peek().setReturnValue(returnValue);
		return returnValue;
	}
	
	/*Function Definition*/
	@Override 
	public Value visitFunc_define(BisParser.Func_defineContext ctx){
		List<BisParser.FuncContext> functions =  ctx.func();
		
		for(BisParser.FuncContext function : functions) {
			String returnType;
			if (function.data_type() == null)
				returnType = "void";
			else
				returnType = this.visit(function.data_type()).asString();
			List<BisParser.ParamsContext> params =  function.params();
			ArrayList<Variable> paramList = new ArrayList<Variable>();
			String signature = function.FUNC_IDENTIFIER().getText() + "(";
			
			for(BisParser.ParamsContext param : params) {
				String datatype = this.visit(param.data_type()).asString();
				paramList.add(new Variable(datatype, param.VAR_IDENTIFIER().getText(), null));
				signature += datatype + ",";
			}
			if (signature.charAt(signature.length() - 1) != '(')
				signature = signature.substring(0,signature.length() - 1) + ")";
			else
				signature += ")";
			Function newFunc = new Function(returnType, signature, paramList, function);
			newFunc.setName(function.FUNC_IDENTIFIER().getText());
			masterFuncList.add(newFunc);
		}

		return Value.VOID; 
	}
	
	/*Function Call*/	
	@Override
	public Value visitFunc_call(BisParser.Func_callContext ctx){
		Value returnValue = null;

		String funcSignature = ctx.FUNC_IDENTIFIER().getText();
		//TODO: add data types of parameters for signature, check if params is legit
	
		Function calledFunc = findFunction(funcSignature);
		
		if (calledFunc != null){
			
			//Push function into scope
			Scope funcScope = new Scope(ScopeType.LOCAL, calledFunc.getName(), ctx.getParent());
			
			//bind parameters as variables in new scope
			List<BisParser.ParamsContext> params =  calledFunc.getContext().params();
			List<BisParser.ValContext> vals = ctx.val();
			
			Iterator<BisParser.ParamsContext> it1 = params.iterator();
			Iterator<BisParser.ValContext> it2 = vals.iterator();
			
			while (it1.hasNext() && it2.hasNext()){
				BisParser.ParamsContext param = it1.next();
				String datatype = this.visit(param.data_type()).asString();
				Variable var = new Variable(datatype, param.VAR_IDENTIFIER().getText(), this.visit(it2.next()));
				//System.out.println(var.toString());
				funcScope.bind(var);
			}
			scopes.push(funcScope);
			
			//Run codeblock
			this.visit(calledFunc.getContext().codeblock());
			if (calledFunc.getContext().return_state() != null)
				returnValue = this.visit((calledFunc.getContext().return_state()));
			
			//Pop function from scope
			scopes.pop();
		}
		//return value if any
		return returnValue;
	}
	
	@Override 
	public Value visitScan(BisParser.ScanContext ctx) {
		String input = "";
		//scan input
		input = sc.next();
		
		//retrieve variable from var list
		
		Variable var = null;
		
		//convert string to data type
		switch(ctx.data_type().getText()){
			case "numero" : var = (Variable) scopes.peek().lookup(ctx.VAR_IDENTIFIER().getText());
							var.setValue(new Value(input));
							break;
			case "lutaw"  : var = (Variable) scopes.peek().lookup(ctx.VAR_IDENTIFIER().getText());
							var.setValue(new Value(input));
							break;
			case "pisi"	  : var = (Variable) scopes.peek().lookup(ctx.VAR_IDENTIFIER().getText());
							var.setValue(new Value(input));
							break;
			case "tinoodba": var = (Variable) scopes.peek().lookup(ctx.VAR_IDENTIFIER().getText());
							 var.setValue(new Value(input));
							 break;
			case "char"	  : var = (Variable) scopes.peek().lookup(ctx.VAR_IDENTIFIER().getText());
							var.setValue(new Value(input));
							break;
							
			default:		break;
					
		}
		
		//assign input to variable, variable being inside the symbol table setVarVal
		scopes.peek().bind(var);
	
		
		return Value.VOID; 
	}
	
	@Override
	public Value visitPrint(BisParser.PrintContext ctx){
		System.out.print(this.visit(ctx.stringParty()));
		return Value.VOID;
	}
	
	@Override
	public Value visitPrintnl(BisParser.PrintnlContext ctx){
		System.out.println(this.visit(ctx.stringParty()));
		return Value.VOID;
	}
	
	/*Personal Functions*/
	public Function findFunction(String signature) {
		for (int i = 0; i < masterFuncList.size(); i++)
			//change to equals signature later
			if (masterFuncList.get(i).getSignature().contains(signature))
				return masterFuncList.get(i);
		return null;
	}
}
