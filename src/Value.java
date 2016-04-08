public class Value {
	
	public static Value VOID = new Value(new Object());
	Object value;
	Object[] valArray;
	
	public Value(Object value) {
        this.value = value;
        valArray = null;
    }
	
	public Value(Object value, int size) {
		this.value = null;
		valArray = new Object[size];
	}
	
	public void setValueAt(int index, Object value) {
		valArray[index] = value;
	}
	
	public Value getValueAt(int index) {
		return (Value) valArray[index];
	}
	
	public Boolean getBooleanAt(int index) {
		return (Boolean) valArray[index];
	}
	

	public Double getDoubleAt(int index) {
		return (Double) valArray[index];
	}
	
	public int getIntAt(int index) {
		return (int) valArray[index];
	}
	
	public char getCharAt(int index) {
		return (char) valArray[index];
	}
	
	public String getStringAt(int index) {
		return (String) String.valueOf(valArray[index]);
	}

    public Boolean asBoolean() {
    	if(String.valueOf(value) == "true" || String.valueOf(value) == "false")
    	{
    		return Boolean.parseBoolean(String.valueOf(value));
    	}
    	else if((Integer) Integer.parseInt(value.toString()) instanceof Integer)
    	{
    		if(Integer.parseInt(value.toString()) != 0)
    			return true;
    		else
    			return false;
    	}
    	else
    		return false;
    }
    
    public Integer asInt() {
    	return Integer.parseInt(value.toString());
    	
    	
    }

    public Double asDouble() {
        return new Double(value.toString());
    }

    public String asString() {
        return String.valueOf(value);
    }
    
    public Character asChar() {
    	return (Character)value;
    }

    public boolean isDouble() {
        return value instanceof Double;
    }

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Value that = (Value)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}