import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		// Array Of Student Names
		String [] std_names = {"Ibtahaj", "Ahmed", "Syed", "Rizvi", "Saboor", "Abdul", "Wasey", "Bilal", "Khan", "Mohammad"};
		float[] std_marks = {98.6f, 68.7f, 78.4f, 80.0f, 85.6f, 89.9f, 95.7f, 98.0f, 69.8f, 97.8f};
		//Making Input Object
		Scanner input = new Scanner(System.in);
		//Taking Input From The User
		System.out.print("Enter Any Number To Search Linearly\t\t:");
		float number_input = input.nextFloat();
		//Calling The Function
		//Getting Time
		Date time = new Date();
		System.out.println("Time In MilliSeconds Before the Search Is \t:" + time.getTime());
		int result_index = linearSearch(0, std_marks.length - 1, std_marks, number_input);
		if(result_index != -1) {
			System.out.println("\nThe Student " + std_names[result_index] + " Has " + std_marks[result_index] + " Marks");
			System.out.println("Time In MilliSeconds After the Search Is \t:" + time.getTime());
		}else {
			System.out.println("\nNot Found In Array");
		}
	}
	//Function That Linearly Search In An Array
	static int linearSearch(int start_index, int last_index, float [] target_array, float target) {
		while(start_index <= last_index) {
			if (target_array[start_index] == target) {
				return start_index;
			}else {
				start_index += 1;
			}
		}
		return -1;
	}
}