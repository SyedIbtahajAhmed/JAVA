public class Ques_02 {

	public static void main(String[] args) {
		//Declaring Array
		int [] my_array = {31 , -2 , 73 , 215 , 243 , 14 , 5 , 23 , 2 , 156};
		int maximum = my_array[0];
		int minimum = my_array[0];
		for(int i: my_array) {
			if (i > maximum) {
				maximum = i;
			}else if (i < minimum){
				minimum = i;
			}else {
				continue;
			}
		}
		//Printing
		System.out.print("Elements Of Array : ");
		for(int i = 0; i < my_array.length; i++) {
			System.out.print(my_array[i] + " ");
		}
		//Printing Maximum
		System.out.println("\nMaximum : " + maximum);
		//Printing Minimum
		System.out.println("Minimum : " + minimum);
	}

}
