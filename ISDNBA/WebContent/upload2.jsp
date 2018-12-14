<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>Upload CO/AC Assessment</title>

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
  width: 20%;
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
      <a class="navbar-brand" href="#"><img src="Logo-LNM.png" height="70rem"></a>
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
<br><br><br><br><br><br>
<p> <img src="COAC.png" align="left"><h4 style="colo: dark grey">Instructions</h4>
<h5 style="color: dark grey" >1.The CO/AC assessment table is to be submitted in excel sheet.<br>
2.All the blank spaces should be filled with zero.<br>
3.The image shown in the left is an example of the CO/AC assessment table.<br>
4.To upload the CO/AC assessment table ,click on upload button.<br>
5.After clicking on upload you will be directed to the next page where you can upload CO list.</h5></p>
<br>

<form action="up2" method="post" enctype="multipart/form-data">
		<h4>Upload</h4>
		</br>
		<!--  <p5>Course Name: </p5>
		<input type="text" name="coursename"> </br> </br>
		<p6>Year: </p6>
		<input type="text" name="year"> </br></br>
		<p7>Branch: </p7>
		<input type="text" name="branchname"> </br> </br>
		<p8>Class size: </p8>
		<input type="text" name="classsize"> </br> </br>-->
		Select File to  Upload(COvsAC):<input type="file" name="uploadFile1"/multiple>
		<!-- Select File to Upload:<input type="file" name="uploadFile2"/multiple>
		Select File to Upload:<input type="file" name="uploadFile3"/multiple>
		Select File to Upload:<input type="file" name="uploadFile4"/multiple> -->
        </br></br>
        <input type="submit" value="Upload">
		</font>
</form>

<br>
<br>
<br>
<footer>
  <div style="background-color:#343a40;;">
      <hr style="color: black;max-width: 100%;margin-top: 0;">
        <div class="container" style="margin-bottom: 3vh;">
          <div class="row">
            <div class="col-lg-3 col-md-3">
              <div class="footer-heading" style="color: white">CONTACT PERSON</div>
              <div class="footer-content" style="color: white">XYZ</div>
            </div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
            <div class="col-lg-3 col-md-3">
              <div class="footer-heading" style="color: white">PHONE</div>
              <div class="footer-content" style="color: white"><a href="tel:1111111111" style="color:rgba(255,255,255,0.9)">+91-11111 11111</a></div>
            </div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
            <div class="col-lg-3 col-md-3">
              <div class="footer-heading" style="color: white">EMAIL</div>
              <div class="footer-content" style="color: white"><a href="mailto:xyz@lnmiit.ac.in" style="color: rgba(255,255,255,0.9)">xyz@lnmiit.ac.in</a></div>
            </div>
           <!-- <div class="col-lg-3 col-md-3">
              <div class="footer-heading">VENUE</div>
              <div class="footer-content">The LNMIIT, Jaipur, Rajasthan </div>
            </div>
            
          </div>-->
        </div> 
          <div class="row" style="color:white;text-align: center;background: #343a40;">
            
           <div class="col-lg-12" style="margin-top: 3vh;margin-left: 1vw;font-size: 1.0vw;margin-bottom: 1vh;">
             <p class="developers"> Developers: Amisha Gupta,Komal Kungwani,Parul Shandilya,Priyansi Singh : The LNMIIT, Jaipur
            </p>
          </div>
        </div>
    </div>
</footer>
    </body>
</html>