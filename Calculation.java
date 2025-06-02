package beans;

public class Calculation {
	double inputData1;
	double inputData2;
	double result;
	String operator;
	
	public OperationDataBean data;
	
	
	
	public Calculation(OperationDataBean data){
		this.data = data;
		}
	
	public void  exec() {

		switch (data.getOperator()) {
	        case "+":
	        	result = data.getInputData1() + data.getInputData2();
	        break;
	        case "-":
	        	result = data.getInputData1() - data.getInputData2();
	        	break;
	        case "*":
	        	result = data.getInputData1() * data.getInputData2();
	        	break;
	        case "/":
	        	try {
	        		result = data.getInputData1() / data.getInputData2();
	        		}catch(ArithmeticException e) {
	        			System.out.println(e.getMessage());
	        		}
	        	}
		data.setResult(result);
		}
}
