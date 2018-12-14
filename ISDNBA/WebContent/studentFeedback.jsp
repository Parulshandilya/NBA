<html>
<head>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>Log Out</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">

    <!-- Custom styles for this template -->
    <link href="navbar-top-fixed.css" rel="stylesheet">
<style>
div.stars {

	  width: 270px;

	  display: inline-block;
	 

	}

	 

	input.star { display: none;
	 }

	 

	label.star {
	text-align: center;

	  float: right;

	  padding: 10px;

	  font-size: 36px;

	  color: #444;

	  transition: all .2s;

	}

	 

	input.star:checked ~ label.star:before {

	  content: '\f005';

	  color: #FD4;

	  transition: all .25s;

	}

	 

	input.star-5:checked ~ label.star:before {

	  color: #FE7;

	  text-shadow: 0 0 20px #952;

	}

	 

	input.star-1:checked ~ label.star:before { color: #F62; }

	 

	label.star:hover { transform: rotate(-15deg) scale(1.3); }

	 

	label.star:before {

	  content: '\f006';

	  font-family: FontAwesome;

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
<br>
<h1 align="center">Student Feedback</h1>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<div class="stars">

	  <form action="">
		<h3 align="center">CO1:QUESTION</h3>

	    <input class="star star-5" id="star-5" type="radio" name="star"/>

	    <label class="star star-5" for="star-5"></label>

	    <input class="star star-4" id="star-4" type="radio" name="star"/>

	    <label class="star star-4" for="star-4"></label>
	    <input class="star star-3" id="star-3" type="radio" name="star"/>

	    <label class="star star-3" for="star-3"></label>

	    <input class="star star-2" id="star-2" type="radio" name="star"/>

	    <label class="star star-2" for="star-2"></label>

	    <input class="star star-1" id="star-1" type="radio" name="star"/>

	    <label class="star star-1" for="star-1"></label>
          </form>
<br>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <form action="">
		<h3 align="center">CO2:QUESTION</h3>

	    <input class="star star-5" id="star-51" type="radio" name="star"/>

	    <label class="star star-5" for="star-51"></label>

	    <input class="star star-4" id="star-41" type="radio" name="star"/>

	    <label class="star star-4" for="star-41"></label>
	    <input class="star star-3" id="star-31" type="radio" name="star"/>

	    <label class="star star-3" for="star-31"></label>

	    <input class="star star-2" id="star-21" type="radio" name="star"/>

	    <label class="star star-2" for="star-21"></label>

	    <input class="star star-1" id="star-11" type="radio" name="star"/>

	    <label class="star star-1" for="star-11"></label>

	  </form>
	</div>
<br>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<div class="stars">

	  <form action="">
		<h3 align="center">CO3:QUESTION</h3>

	    <input class="star star-5" id="star-52" type="radio" name="star"/>

	    <label class="star star-5" for="star-52"></label>

	    <input class="star star-4" id="star-42" type="radio" name="star"/>

	    <label class="star star-4" for="star-42"></label>
	    <input class="star star-3" id="star-32" type="radio" name="star"/>

	    <label class="star star-3" for="star-32"></label>

	    <input class="star star-2" id="star-22" type="radio" name="star"/>

	    <label class="star star-2" for="star-22"></label>

	    <input class="star star-1" id="star-12" type="radio" name="star"/>

	    <label class="star star-1" for="star-12"></label>

	  </form>
	</div>
<br>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<div class="stars">

	  <form action="">
		<h3 align="center">CO4:QUESTION</h3>

	    <input class="star star-5" id="star-53" type="radio" name="star"/>

	    <label class="star star-5" for="star-53"></label>

	    <input class="star star-4" id="star-43" type="radio" name="star"/>

	    <label class="star star-4" for="star-43"></label>
	    <input class="star star-3" id="star-33" type="radio" name="star"/>

	    <label class="star star-3" for="star-33"></label>

	    <input class="star star-2" id="star-23" type="radio" name="star"/>

	    <label class="star star-2" for="star-23"></label>

	    <input class="star star-1" id="star-13" type="radio" name="star"/>

	    <label class="star star-1" for="star-13"></label>

	  </form>
	</div>
<br>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<div class="stars" align="center">

	  <form action="">
		<h3 align="center">CO5:QUESTION</h3>

	    <input class="star star-5" id="star-54" type="radio" name="star"/>

	    <label class="star star-5" for="star-54"></label>

	    <input class="star star-4" id="star-44" type="radio" name="star"/>

	    <label class="star star-4" for="star-44"></label>
	    <input class="star star-3" id="star-34" type="radio" name="star"/>

	    <label class="star star-3" for="star-34"></label>

	    <input class="star star-2" id="star-24" type="radio" name="star"/>

	    <label class="star star-2" for="star-24"></label>

	    <input class="star star-1" id="star-14" type="radio" name="star"/>

	    <label class="star star-1" for="star-14"></label>

	  </form>
	</div>
<br>
<br>
 <div class="s_btn text-center pt16 pb16" data-name="Buttons">
                <a href="studentPage.jsp" class="btn btn-primary" data-original-title="" title="" aria-describedby="tooltip871321">SUBMIT</a>
              </div>
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