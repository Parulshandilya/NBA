
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class up1
 */
@WebServlet("/up3")
public class up3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public up3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String coursename = (String) request.getSession(false).getAttribute("coursename");
		String branchname =(String) request.getSession(false).getAttribute("branchname");
		String year = (String) request.getSession(false).getAttribute("year");
		String classsize=(String) request.getSession(false).getAttribute("classsize");

		System.out.println(coursename);
		
		System.out.println(coursename);
		try {
	    	ServletFileUpload sf=new ServletFileUpload(new DiskFileItemFactory());
	    	List<FileItem> multifiles=sf.parseRequest(request);
	    	for(FileItem item : multifiles)
	    	{
	    		item.write(new File("/home/parul/eclipse-workspace/ISDNBA/uploads/"+coursename+"_"+year+"_COMatrix.xlsx"));
	    	}
	    	request.setAttribute("message", "upload has been successfull!");
	    	//System.out.println("file uploaded");
	    	}
	    	catch(Exception ex)
	    	{
	    		request.setAttribute("message", "There has been an error "+ex.getMessage());
	    		//System.out.println(ex);
	    	}
		ReadExcel reading=new ReadExcel();
		reading.reading2(coursename,year,branchname,classsize);
		
		getServletContext().getRequestDispatcher("/upload4.jsp").forward(request, response);	
    
	}
}
