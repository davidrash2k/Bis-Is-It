

public class Variable extends Symbol {
	
	private String data_type;
	private Value value;
	
	public Variable(String data_type, String name, Value value) {
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

	public String getDataType() {
		return data_type;
	}

	public void setDatType(String data_type) {
		this.data_type = data_type;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (value == null)
			return " Data Type:" + data_type + " Name:" + name + " Value: null";
		else
			return " Data Type:" + data_type + " Name:" + name + " Value: " + value.toString();
	}

}
