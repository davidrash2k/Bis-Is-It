

public class Variable {
	
	private String data_type;
	private String name;
	private String value;
	
	public Variable(){
		
	}
	
	public Variable(String data_type, String name, String value) {
		super();
		this.data_type = data_type;
		this.name = name;
		this.value = value;
	}
	
	

	public Variable(String data_type, String name) {
		super();
		this.data_type = data_type;
		this.name = name;
	}

	public String getData_type() {
		return data_type;
	}

	public void setData_type(String data_type) {
		this.data_type = data_type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Data Type:" + data_type + " Name:" + name + " Value:" + value;
	}
	
	
	
	

	
	
}
