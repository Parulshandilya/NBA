
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String coursename = (String) request.getSession(false).getAttribute("coursename");
String classsize=(String) request.getSession(false).getAttribute("classsize");
String year = (String) request.getSession(false).getAttribute("year");
String branchname =(String) request.getSession(false).getAttribute("branchname");
    //String coursename  = request.getParameter("coursename");
//String batchname = request.getParameter("batchname");
//String year= request.getParameter("year");
//String classsize = request.getParameter("classsize");
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

<h1>NBA Report</h1>
<br><br>
<h2 align="center"><font><strong>CO Attainment Matrix</strong></font></h2>
<h3>1. First column shows  </h3>
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

<br><br><br><br><br><br>

<h2 align="center"><font><strong>Direct_Indirect Matrix</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
	<tr bgcolor="#A52A2A">
	    <td><b>Type</b></td>
		<td><b>PO1</b></td>
		<td><b>PO2</b></td>
		<td><b>PO3</b></td>
		<td><b>PO4</b></td>
		<td><b>PO5</b></td>
		<td><b>PO6</b></td><td>
		<b>PO7</b></td>
		<td><b>PO8</b></td>
		<td><b>PO9</b></td>
		<td><b>P010</b></td>
		<td><b>PO11</b></td>
		<td><b>PO12</b></td>
		<td><b>PSO1</b></td>
		<td><b>PSO2</b></td>
		<td><b>PSO3</b></td>
	</tr>
   <%
	try{	
		connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
		statement=connection.createStatement();
		String sql ="SELECT * FROM "+coursename+"_"+year+"_"+"DirectIndirectTable";

		resultSet = statement.executeQuery(sql);
		while(resultSet.next()){
	%>
		<tr bgcolor="#DEB887">
			
			<td><%=resultSet.getString("Type") %></td>
			<td><%=resultSet.getString("PO1") %></td>
			<td><%=resultSet.getString("PO2") %></td>
			<td><%=resultSet.getString("PO3") %></td>
			<td><%=resultSet.getString("PO4") %></td>
			<td><%=resultSet.getString("PO5") %></td>
			<td><%=resultSet.getString("PO6") %></td>
			<td><%=resultSet.getString("PO7") %></td>
			<td><%=resultSet.getString("PO8") %></td>
			<td><%=resultSet.getString("PO9") %></td>
			<td><%=resultSet.getString("PO10") %></td>
			<td><%=resultSet.getString("PO11") %></td>
			<td><%=resultSet.getString("PO12") %></td>
			<td><%=resultSet.getString("PSO1") %></td>
			<td><%=resultSet.getString("PSO2") %></td>
			<td><%=resultSet.getString("PSO3") %></td>
			
			
		</tr>
		            
	<%		
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
%>
</table>