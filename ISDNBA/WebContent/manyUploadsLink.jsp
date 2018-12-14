<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>Upload Page</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">

    <!-- Custom styles for this template -->
    <link href="navbar-top-fixed.css" rel="stylesheet">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=text], input[type=text], input[type=text] {
  width: 50%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 10%;
}
    .wrapper{
		text-align: center;
}

button:hover {
  opacity: 0.7;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

</style>
</head>
<body>
  <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
      <a class="navbar-brand" href="#"><img src="Logo-LNM.png"></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarCollapse">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="home.jsp">Home<span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="facultyLogin.jsp">Faculty Login</a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="studentLogin.jsp">Student Login</a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="aboutUs.jsp">About Us</a>
          </li>
        </ul>
      </div>
    </nav>
<br>
<br>
<br>
  
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