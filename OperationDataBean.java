package beans;

public class OperationDataBean {

	double inputData1 = 0;
	double inputData2 = 0;
	double result = 0;
	String operator = "";
	
	public OperationDataBean() {
		
	}
	
	public void setInputData1(double inputData1) {
		this.inputData1 = inputData1;
	}
	
	public void setInputData2(double inputData2) {
		this.inputData2 = inputData2;
	}
	
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public void setResult(double result) {
		this.result = result;
	}
	
    public double getInputData1() {
        return this.inputData1;
    }
	
    
    public double getInputData2() {
        return this.inputData2;
    }
	
    public String getOperator() {
        return this.operator;
    }
    
    public double getResult() {
        return this.result;
    }
}
