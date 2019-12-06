package myFirstProject;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 11; i+=1) {
			
			for(int j = 10; j >= i; j-=1) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j+=1) {
				System.out.print("*");
			}
			for(int j = 1; j <= i-1; j+=1) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(int i = 0; i < 11; i+=1) {
			for (int j = 1; j <= i; j+=1) {
				System.out.print(" ");
			}
			for (int j = 10; j >= i+1; j-=1) {
				System.out.print("*");
			}
			for (int j = 10; j >= i; j-=1) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
