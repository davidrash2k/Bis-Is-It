import java.util.HashMap;
import java.util.Map;


public class Scope {
	
	private ScopeType type;
	private Map<String, Symbol> symbolMap;
	private String scopeName;
	
	public Scope(ScopeType type, String scopeName) {
		 symbolMap = new HashMap<String, Symbol>();
		 this.scopeName = scopeName;
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
	
	
}
