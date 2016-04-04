

import java.util.ArrayList;
import java.util.Arrays;

import bis.is.it.BisBaseVisitor;
import bis.is.it.BisParser;
import bis.is.it.BisParser.Func_defineContext;

public class BisBaseVisitorImplementer extends BisBaseVisitor{
	
	private boolean hasError;
	private ArrayList<Function> masterFuncList;
	private ArrayList<Variable> masterVarList;
	
	
	
	public BisBaseVisitorImplementer(){
		hasError = false;
		masterFuncList = new ArrayList<Function>();
		masterVarList = new ArrayList<Variable>();
	}
	
	
	public boolean getHasError(){
		return hasError;
	}
	
	
	
	//FUNCTION DEFINE
	@Override 
	public String visitFunc_define(BisParser.Func_defineContext ctx){
		ArrayList<String> stringList = new ArrayList<String>(Arrays.asList(ctx.getText().split(">>")));
		ArrayList<String> funcNameAndReturnType;
		ArrayList<String> varList;

		ArrayList<Variable> paramList = new ArrayList<Variable>();
		
		
		
		System.out.println("CTX: " + ctx.getText());
		System.out.println("stringList.get(0): " + stringList.get(0));
		System.out.println("stringList.get(1): " + stringList.get(1));
		
		funcNameAndReturnType = new ArrayList<String>(Arrays.asList(stringList.get(0).split("func.")));
		varList = new ArrayList<String>(Arrays.asList(stringList.get(1).split(",")));
		
		//STORE FUNC SIGNATURE AND RETURN TYPE
		String returnType, signature;
		returnType = funcNameAndReturnType.get(0);
		signature = "_" + funcNameAndReturnType.get(1);
		
		//STORE FUNC PARAMS 
			Variable var;
			String[] varArr = new String[2];
			String varName = "";
		for(int i = 0; i <varList.size(); i++){
			varArr = varList.get(i).split("_");
			varName = "_" + varArr[1];
			var = new Variable(varArr[0], varName);
			paramList.add(var);
		    var = null;
		}
		
		masterFuncList.add(new Function(returnType, signature, paramList));
		
		
		//FOR DEBUGGING PURPOSES
		for(int i = 0; i < masterFuncList.size(); i++){
			System.out.println(masterFuncList.get(i).toString());
		}
		
		
		return (String)visitChildren(ctx); 
	}
	
	
		

}
