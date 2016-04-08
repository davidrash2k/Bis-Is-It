import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.RuleContext;


public class Scope {
	
	private ScopeType type;
	private Map<String, Symbol> symbolMap;
	private String scopeName;
	private RuleContext caller;
	private Value returnValue;
	
	public Scope(ScopeType type, String scopeName, RuleContext caller) {
		 symbolMap = new HashMap<String, Symbol>();
		 this.scopeName = scopeName;
		 this.caller = caller;
	}
	
	/*Add function to Symbol Table*/
	public void bind(Function func) {
		func.setScope(null); //scope is null because all functions are global, assuming
        symbolMap.put(func.getName(), func);
    }
	
	/*Add variable to Symbol Table*/
	public void bind(Variable var) {
        var.setScope(this); //set variable scope to this
        symbolMap.put(var.getName(), var);
    }
	
	/*Get whatever comes out*/
	public Symbol lookup(String name) {
		return symbolMap.get(name);
	}

	public ScopeType getType() {
		return type;
	}
	
	public String getName() {
		return scopeName;
	}
	
	public void setName(String scopeName) {
		this.scopeName = scopeName;
	}

	public void setType(ScopeType type) {
		this.type = type;
	}
	
	public String getList() {
		return symbolMap.toString();
	}

	public String getScopeName() {
		return scopeName;
	}

	public void setScopeName(String scopeName) {
		this.scopeName = scopeName;
	}

	public RuleContext getCaller() {
		return caller;
	}

	public void setCaller(RuleContext caller) {
		this.caller = caller;
	}

	public Value getReturnValue() {
		return returnValue;
	}

	public void setReturnValue(Value returnValue) {
		this.returnValue = returnValue;
	}

	public Map<String, Symbol> getSymbolMap() {
		return symbolMap;
	}

	public void setSymbolMap(Map<String, Symbol> symbolMap) {
		this.symbolMap = symbolMap;
	}
	
	
	
}
