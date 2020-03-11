
public class Ques_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 6;
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= rows - i ; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			for(int j = 1; j <= i-1; j++) {
				System.out.print(" *");
			}
			System.out.print("\n");
		}
	}

}
