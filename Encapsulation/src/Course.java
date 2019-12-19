public class Course {
	private int course_id;
	private String course_name;
	//Constructor
	Course(int id, String name){
		this.course_id = id;
		this.course_name = name;
	}
	
	//course_id Setter And Getter
	void setCourseId(int i) {
		this.course_id = i;
	}
	int getCourseId() {
		return this.course_id;
	}
	
	//course_name Setter And Getter
	void setCourseName(String n) {
		this.course_name = n;
	}
	String getCourseName() {
		return this.course_name;
	}
}
