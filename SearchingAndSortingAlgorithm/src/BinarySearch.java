import java.util.Date;
import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {

	public static void main(String[] args) {
		// Array Of Student Names
		String [] emp_names = {"Ibtahaj", "Ahmed", "Syed", "Rizvi", "Saboor"};
		int[] emp_salaries = {150000, 230000, 120000, 145000, 200000};
		int[] emp_ids = {11, 12, 13, 14, 15};
		//Making Input Object
		Scanner input = new Scanner(System.in);
		//Getting Time
		Date time = new Date();
		//Taking Input From The User
		System.out.print("Enter Id Of The Employee You Want To Search\t\t:");
		int number_input = input.nextInt();
		//Calling The Function
		System.out.println("Time In MilliSeconds Before the Search Is \t:" + time.getTime());
		int result_index = binarySearch(0, emp_ids.length - 1, emp_ids, number_input);
		if(result_index != -1) {
			System.out.println("\nThe Employee " + emp_names[result_index] + " Has " + emp_salaries[result_index] + " Salary");
			System.out.println("Time In MilliSeconds After the Search Is \t:" + time.getTime());
		}else {
			System.out.println("\nNot Found In Array");
		}
	}
	//Function That Linearly Search In An Array
	static int binarySearch(int start_index, int last_index, int [] target_array, int target) {
		Arrays.sort(target_array);
		int temp = start_index;
		while(temp <= last_index) {
			temp = (temp + last_index) / 2;
			if(target_array[temp] == target) {
				return temp;
			}else if (target_array[temp] < target) {
				temp = temp + 1;
			}else {
				last_index = temp - 1;
				temp = start_index;
			}
		}
		return -1;
	}
}