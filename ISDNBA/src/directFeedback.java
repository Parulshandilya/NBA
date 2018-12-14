
public class directFeedback {

	/**
	 * @param args
	 */
	int courseId;
	int CO[][];
	String studentId;
	int feedback[]=new int[7];
	public void directFedback(int courseId, int[][] cO, String studentId) {
	
		this.courseId = courseId;
		CO = cO;
		this.studentId = studentId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int[][] getCO() {
		return CO;
	}

	public void setCO(int[][] cO) {
		CO = cO;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	
	
	public int[] getFeedback() {
		return feedback;
	}

	public void setFeedback(int[] feed) {
		this.feedback = feed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}