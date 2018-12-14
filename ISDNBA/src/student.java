
public class student {

	/**
	 * @param args
	 */
	int cno=0;
	int studentId;
	String firstName;
	String lastName;
	String email;
	Course c[]=new Course[7];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public student(int studentId, String firstName, String lastName,
			String email, Course[] c) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.c = c;
	}
 public void addCourse(Course cc)
 {
	 c[cno++]=cc;
 }
 public void subCourse(Course cc)
 {
	 cno--;
 }
 public void givedirectFeedback()
 {
	 directFeedback f=new directFeedback();
 }
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Course[] getC() {
		return c;
	}
	public void setC(Course[] c) {
		this.c = c;
	}


}