
import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;

import bis.is.it.BisParser;


public class Function extends Symbol {
	private String signature;
	private String return_type;
	private ArrayList<Variable> parameters;
	private BisParser.FuncContext ctx;
	
	public Function(String return_type, String signature,  ArrayList<Variable> parameters, BisParser.FuncContext ctx) {
		super();
		this.return_type = return_type;
		this.signature = signature;
		this.parameters = parameters;
		this.ctx = ctx;
	}

	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getReturn_type() {
		return return_type;
	}
	public void setReturn_type(String return_type) {
		this.return_type = return_type;
	}

	public ArrayList<Variable> getParameters() {
		return parameters;
	}
	
	public BisParser.FuncContext getContext() {
		return ctx;
	}
	
	public void setContext(BisParser.FuncContext ctx){
		this.ctx = ctx;
	}

	public void setParameters(ArrayList<Variable> parameters) {
		this.parameters = parameters;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "\nFUNCTION return_type: " + return_type + " signature: " + signature  + " varlist: \n";
		for(int i = 0; i < parameters.size(); i++){
			result += parameters.get(i).toString();
		}
		return result;
	}
	
	
	
	
	
}
