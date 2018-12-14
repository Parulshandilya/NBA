
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
    String coursename  = request.getParameter("coursename");
String batchname = request.getParameter("batchname");
String year= request.getParameter("year");
String classsize = request.getParameter("classsize");
	String driverName = "com.mysql.jdbc.Driver";
	String connectionUrl = "jdbc:mysql://localhost:3306/";
	String dbName = "isdlab";
	String userId = "root";
	String password = "parul";
	
	try {
		Class.forName(driverName);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
%>
<h2 align="center"><font><strong>Retrieve data from database in jsp</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
	<tr bgcolor="#A52A2A">
		<td><b>Quiz1</b></td>
		<td><b>Quiz2</b></td>
		<td><b>Assignment1</b></td>
		<td><b>Assignment2</b></td>
		<td><b>Mid-term</b></td>
		<td><b>End-Term-term</b></td>
	</tr>
   <%
	try{	
		connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
		statement=connection.createStatement();
		String sql ="SELECT * FROM "+coursename+"_"+year+"_"+"COAttainment";

		resultSet = statement.executeQuery(sql);
		while(resultSet.next()){
	%>
		<tr bgcolor="#DEB887">
			
			<td><%=resultSet.getString("AC1") %></td>
			<td><%=resultSet.getString("AC2") %></td>
			<td><%=resultSet.getString("AC3") %></td>
			<td><%=resultSet.getString("AC4") %></td>
			<td><%=resultSet.getString("AC5") %></td>
			<td><%=resultSet.getString("AC6") %></td>
			
		</tr>
		            
	<%		
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
%>
</table>