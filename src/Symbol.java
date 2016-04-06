public class Symbol {
	
	protected String name;
	protected Scope scope;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setScope(Scope scope) {
		this.scope = scope;
	}
	
	public Scope getScope() {
		return scope;
	}

}
