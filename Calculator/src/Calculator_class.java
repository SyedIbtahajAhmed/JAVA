public class Calculator_class {
	int output;
	
	int add(int num1, int num2) {
		this.output = num1 + num2;
		return this.output;
	}
	
	int minus(int num1, int num2) {
		this.output = num1 - num2;
		return this.output;
	}
	
	int multiply(int num1, int num2) {
		this.output = num1 * num2;
		return this.output;
	}
	
	
	int divide(int num1, int num2) {
		this.output = num1 / num2;
		return this.output;
	}
}