import java.util.Scanner;
public class Ques_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Any Number: ");
		int number = input.nextInt();
		if (number > 0) {
			System.out.println("Number Entered Is Positive!");
		}else if (number < 0) {
			System.out.println("Number Entered Is Positive!");
		}else {
			System.out.println("Number Entered Is Zero!");
		}
	}

}
