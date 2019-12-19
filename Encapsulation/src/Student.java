public class Student {
	private String student_name;
	private int student_roll_no;
	private String student_department;
	//Parameterised Constructor
	Student(String name, int roll_no, String department){
		this.student_name = name;
		this.student_roll_no = roll_no;
		this.student_department = department;
	}
	
	//Name Setter And Getter
	void setName(String n) {
		this.student_name = n;
	}
	String getName() {
		return this.student_name;
	}
	
	//roll_no Setter And Getter
	void setRollNo(int r) {
		this.student_roll_no = r;
	}
	int getRollNo() {
		return this.student_roll_no;
	}
	
	//department Setter And Getter
	void setDepartment(String d) {
		this.student_department = d;
	}
	String getDepartment() {
		return this.student_department;
	}
}
