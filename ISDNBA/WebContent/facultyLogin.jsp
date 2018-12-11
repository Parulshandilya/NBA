
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="../../../../favicon.ico">
    <style>
	body {font-family: Arial, Helvetica, sans-serif;}
	form {border: 3px solid #f1f1f1;}

	input[type=text], input[type=password] {
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
	  width: 25%;
	}
	.wrapper {
	    text-align: center;
	}


	button:hover {
	  opacity: 0.8;
	}

	.imgcontainer {
	  text-align: center;
	  margin: 10px 0 6px 0;
	}

	img.avatar {
	  width: 20%;
	  border-radius: 20%;
	}

	.container {
	  padding: 16px;
	}

	span.psw {
	  float: right;
	  padding-top: 16px;
	}

	/* Change styles for span and cancel button on extra small screens */
	@media screen and (max-width: 300px) {
	  span.psw {
	     display: block;
	     float: none;
	  }
	  
	}
	</style>

    <title>NBA Accreditation</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">

    <!-- Custom styles for this template -->
    <link href="navbar-top-fixed.css" rel="stylesheet">
  </head>

<body>
     <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
      <a class="navbar-brand" href="#"><img src="Logo.png"></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarCollapse">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="#">Home<span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="#">Faculty Login</a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="#">Studet Login</a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="#">Contact Us</a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="#">About Us</a>
          </li>
        </ul>
        <!--<form class="form-inline mt-2 mt-md-0">
          <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>-->
      </div>
    </nav>

<br>
<br>
<br> 
<br>
<br>
<br>

	<h2 align="center">Faculty Login</h2>
 
	<form method="post" action="facultyLoginCheck">
		<div class="imgcontainer">
	    <img src="image.png" alt="Faculty image" class="avatar">
	  </div>
    
	  <div class="wrapper">
	    <label for="uname"><b>Username</b></label>
	    <input type="text" placeholder="Enter Username"  name="uname" required >
            <br>
	    <label for="psw"><b>Password</b></label>
	    <input type="password" placeholder="Enter Password" name="password" required>
	    </div>
            <br>
            <div class="wrapper">
	    <button type="submit">Login</button>
            </div>
	</form>
</body>
</html>