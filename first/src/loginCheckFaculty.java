
import javax.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import java.awt.event.*;
import first.DbConnection;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class loginCheckFaculty extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginCheckFaculty() {
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
		
		
		
			try {
				String user = request.getParameter("uname");
				String pswd=request.getParameter("password");
				Connection con=null;
				DbConnection d=new DbConnection();
				con=d.getConnection();

					
					
					
					try {
					String s="use isdlab";
					PreparedStatement p=con.prepareStatement(s);
					
					ResultSet rr=p.executeQuery(s);
					}
					catch(Exception eee)
					{
						System.out.println("Hi"+eee);
					}
					
					try {
					String q="select  * From flogin where username='"+user+ "'and password='"+pswd+"'";
					PreparedStatement pat=con.prepareStatement(q);
					
					//pat.setString(0,user);
					//pat.setString(1,pswd);
					ResultSet rs = pat.executeQuery(q);
					int COUNT=0;
					while(rs.next())
					{ 
						COUNT++;
						
			        }
					if(COUNT==0)
					{
						
						response.sendRedirect("errorPage.jsp");
						 
					}
					else {
						HttpSession session =request.getSession();
						session.setAttribute("uname",user);
						response.sendRedirect("facultyPage.jsp");
					}
					}
					catch(Exception eeee)
					{
						System.out.println("HiHi"+eeee);
					}
					/*if(user.equals("amisha")&&(pswd.equals("1234")))
					{
						JOptionPane.showMessageDialog(null, "successful login");
							
						
					}
					else
					{
						JOptionPane.showMessageDialog(null, " login failed :"
								+ ""
								+ " invalid username or password");
						 
					}*/
				
				}
				catch(Exception ee)
				{
					JOptionPane.showMessageDialog(null, "error in accessing login data");
				}
			}
	}


