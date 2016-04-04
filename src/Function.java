
import java.util.ArrayList;


public class Function {
	private String  signature;
	private String return_type;
	private ArrayList<Variable> parameters;
	
	public Function(){
		
	}
	
	public Function(String return_type, String signature,  ArrayList<Variable> parameters) {
		super();
		this.return_type = return_type;
		this.signature = signature;
		this.parameters = parameters;
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
