<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="UploadDownloadFileServlet" method="post" >

<!-- 		
		
<a href="http://localhost:8080/ISDNBA/upload.jsp">upload marks</a>
<a href="http://localhost:8080/ISDNBA/upload1.jsp">upload1</a>
<a href="http://localhost:8080/ISDNBA/upload2.jsp">upload</a>
<a href="http://localhost:8080/ISDNBA/upload3.jsp">upload1</a>
 -->
<h4>Upload</h4>
		</br>
		<p5>Course Name: </p5>
		<input type="text" name="coursename"> </br> </br>
		<p6>Year: </p6>
		<input type="text" name="year"> </br></br>
		<p7>Branch: </p7>
		<input type="text" name="branchname"> </br> </br>
		<p8>Class size: </p8>
		<input type="text" name="classsize"> </br> </br>
		<!-- Select File to Upload:<input type="file" name="uploadFile1"/multiple>
		<!-- Select File to Upload:<input type="file" name="uploadFile2"/multiple>
		Select File to Upload:<input type="file" name="uploadFile3"/multiple>
		Select File to Upload:<input type="file" name="uploadFile4"/multiple> -->
        </br></br>
        <input type="submit" value="Upload">
		</font>
</form>
</body>
</html>