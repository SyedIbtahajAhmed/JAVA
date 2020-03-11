public class Ques_01 {

	public static void main(String[] args) {
		// Declaring Integer Array
		int [] my_array = {11 , 20 , 33 , 15 , 12 , 44 , 34 , 3 , 24 , 46};
		int sum = 0;
		for(int i = 0; i <my_array.length; i++) {
			sum = sum + my_array[i];
		}
		System.out.print("Elements Of Array : ");
		for(int i = 0; i < my_array.length; i++) {
			System.out.print(my_array[i] + " ");
		}
		System.out.println("\nSum Of Elements : " + sum);
	}

}
