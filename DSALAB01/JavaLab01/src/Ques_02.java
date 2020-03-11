
public class Ques_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "SyedIbtahaj";
		System.out.println("Given Name Is : \t" + name + "\nASCII Codes Of Alphabets Are : \n" );
		for(int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i) + "  =  " + (int)name.charAt(i));
		}
	}

}
