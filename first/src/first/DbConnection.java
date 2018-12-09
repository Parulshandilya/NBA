package first;
import java.sql.*;
public class DbConnection {
	static Connection con;
	   public DbConnection()
	   {
	      con =null;
	   }
	   public Connection getConnection()
	    {
	       try{  
	             Class.forName("com.mysql.jdbc.Driver");  
	          }
	       catch(ClassNotFoundException e)
		      {
		        System.out.println("Hi"+e);
				System.exit(1);
			  }	
			try{
				//here test is database name, root is username and password 
				this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/isdlab","root","parul");  
				
				}
				catch(SQLException e)
				{
				    System.out.println(e);
				}
			return this.con;
		}
		public void closeDb()
		{
		   try{
		         if(this.con!=null)
				     this.con.close();
			   }
	     	catch(SQLException e)
				{
				    System.out.println(e);
				}
	     }

}
