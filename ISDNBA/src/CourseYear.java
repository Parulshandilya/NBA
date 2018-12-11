public class CourseYear {

	public String coursename;
	public String year;
	public String batch;
	public String classsize;
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getClasssize() {
		return classsize;
	}
	public void setClasssize(String classsize) {
		this.classsize = classsize;
	}
	public CourseYear(String coursename, String year, String batch, String classsize) {
		super();
		this.coursename = coursename;
		this.year = year;
		this.batch = batch;
		this.classsize = classsize;
	}
	
	
}
