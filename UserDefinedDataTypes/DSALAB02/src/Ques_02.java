import java.util.Scanner;
public class Ques_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Any Number To Calculate Factorial: ");
		int number = input.nextInt();
		int temporary = number - 1;
		int factorial = number;
		while(temporary >= 1) {
			factorial = factorial * temporary;
			temporary = temporary - 1;
		}
		System.out.println("The Factorial Of " + number + " Is : " + factorial);
	}

}
