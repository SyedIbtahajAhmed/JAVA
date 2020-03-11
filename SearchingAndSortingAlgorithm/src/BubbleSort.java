import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		//An Array
		int [] records = {12,54,223,65,73,89,120,550,123,456,2334,343,674,678,1000};
		//Getting Time
		Date time = new Date();
		//Printing Sorted Array
		System.out.println("The Time Before Sorting Is " + time.getTime());
		int [] result = bubbleSort(records);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println("\nThe Time After Sorting Is " + time.getTime());
	}
	
	//Function Of BubbleSorting
	static int [] bubbleSort(int [] target_array) {
		int temp = 0;
		for(int i = 0; i < target_array.length; i++) {
			for(int j = 0; j < (target_array.length - i - 1); j++) {
				if (target_array[j] > target_array[j+1]) {
				//Swapping
				temp = target_array[j];
				target_array[j] = target_array[j+1];
				target_array[j+1] = temp;
				temp += 1;
				}
			}
		}
		return target_array;
	}
}