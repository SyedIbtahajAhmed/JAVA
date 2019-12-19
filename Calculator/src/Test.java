import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		//Making Input Object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int num1 = input.nextInt();
		
		System.out.println("Enter Seccond Number");
		int num2 = input.nextInt();
		//Object Of Calculator
		Calculator_class obj_1 = new Calculator_class();
		
		//Addition
		System.out.println("\nThe Result of Addition Is: " + obj_1.add(num1, num2));
		
		//Subtraction
		System.out.println("\nThe Result of Subtraction Is: " + obj_1.minus(num1, num2));
		
		//Multiplication
		System.out.println("\nThe Result Of Multiplication Is: " + obj_1.multiply(num1, num2));
		
		//Multiplication
		System.out.println("\nThe Result Of Division Is: " + obj_1.divide(num1, num2));
	}

}
