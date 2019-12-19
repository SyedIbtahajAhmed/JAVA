import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Student std_1 = new Student("Syed Ibtahaj Ahmed", 16, "CSE");
		Student std_2 = new Student("Syed Saboor Ahmed", 20, "CSE");
		Student std_3 = new Student("Syed Ali Ahmed", 11, "EE");
		Student std_4 = new Student("Abdul Wasey", 04, "EE");
		Student std_5 = new Student("Mohammad Bilal Khan", 10, "CSE");
		
		Course cour_1 = new Course(122, "Computer Engineering Workshop");
		Course cour_2 = new Course(190, "Linear Algebra & Differential Equations");
		Course cour_3 = new Course(220, "Discrete Structures");
		Course cour_4 = new Course(149, "Electronic Circuit Design");
		Course cour_5 = new Course(170, "Computer Architecture & Organzation");
		
		//Updated Name Using Setter Method
		std_1.setName("Syed Ibtahaj Ahmed Rizvi");
		//Printing Information Of First Student
		System.out.println("\n\nThe Name Of The Student Is: " + std_1.getName());
		System.out.println("The Roll No. Of The Student Is: " + std_1.getRollNo());
		System.out.println("The Department Of The Student Is: " + std_1.getDepartment());
		
		//Printing Information Of Second Student
		System.out.println("\n\nThe Name Of The Student Is: " + std_2.getName());
		System.out.println("The Roll No. Of The Student Is: " + std_2.getRollNo());
		System.out.println("The Department Of The Student Is: " + std_2.getDepartment());
		
		//Printing Information Of Third Student
		System.out.println("\n\nThe Name Of The Student Is: " + std_3.getName());
		System.out.println("The Roll No. Of The Student Is: " + std_3.getRollNo());
		System.out.println("The Department Of The Student Is: " + std_3.getDepartment());
		
		//Printing Information Of Fourth Student
		System.out.println("\n\nThe Name Of The Student Is: " + std_4.getName());
		System.out.println("The Roll No. Of The Student Is: " + std_4.getRollNo());
		System.out.println("The Department Of The Student Is: " + std_4.getDepartment());
		
		//Printing Information Of Fifth Student
		System.out.println("\n\nThe Name Of The Student Is: " + std_5.getName());
		System.out.println("The Roll No. Of The Student Is: " + std_5.getRollNo());
		System.out.println("The Department Of The Student Is: " + std_5.getDepartment());
		
		
		
		//Printing Information Of First Courses
		System.out.println("\n\nThe Name Of The Course Is: " + cour_1.getCourseName());
		System.out.println("The ID Of The Course Is: " + cour_1.getCourseId());
		
		//Printing Information Of Second Courses
		System.out.println("\n\nThe Name Of The Course Is: " + cour_2.getCourseName());
		System.out.println("The ID Of The Course Is: " + cour_2.getCourseId());
		
		//Printing Information Of Third Courses
		System.out.println("\n\nThe Name Of The Course Is: " + cour_3.getCourseName());
		System.out.println("The ID Of The Course Is: " + cour_3.getCourseId());
		
		//Printing Information Of Fourth Courses
		System.out.println("\n\nThe Name Of The Course Is: " + cour_4.getCourseName());
		System.out.println("The ID Of The Course Is: " + cour_4.getCourseId());
		
		//Printing Information Of Fifth Courses
		System.out.println("\n\nThe Name Of The Course Is: " + cour_5.getCourseName());
		System.out.println("The ID Of The Course Is: " + cour_5.getCourseId());
	}

}
