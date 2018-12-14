import java.io.IOException;

public class indirectFeedback {
	private String year;
	private int courseID ;
	private String coursename ;
	private String branchname;
	private String classsize;
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	 public void uploadCOListdatabase() throws IOException
	    {
		 ReadExcel r=new ReadExcel();
	        
	        r.reading3(coursename,year,branchname,classsize);
	    }
	    public void uploadMarksListdatabase() throws IOException
	    {
	    	ReadExcel r=new ReadExcel();
	        
	        r.reading(coursename,year,branchname,classsize);
	    }
	    public void uploadCOvsACdatabase() throws IOException
	    {
	    		ReadExcel r=new ReadExcel();
	        
	        r.reading1(coursename,year,branchname,classsize);
	    }
	    public void uploadCOMatrixdatabase() throws IOException
	    {
	    	ReadExcel r=new ReadExcel();
	        
	        r.reading2(coursename,year,branchname,classsize);
	    }
	    public void uploadPOListdatabase() throws IOException
	    {
	    	ReadExcel r=new ReadExcel();
	        
	        r.reading3(coursename,year,branchname,classsize);
	    }
	

}
