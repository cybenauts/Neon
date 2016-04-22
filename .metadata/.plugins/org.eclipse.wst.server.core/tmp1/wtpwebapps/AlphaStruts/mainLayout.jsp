<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<title></title>
	<style type="text/css">


	header {
    background-color:black;
    font-family: sans-serif;
    color:white;
    text-align:center;
    padding:10px; 
    margin: 10px;
}
		
		.menu{
			text-align: right;
			line-height:30px;
		    background-color:#eeeeee;
		    height:300px;
		    width:100px;
		    float:left;
		    padding:5px; 

		}

		.body{
			background-color: ;
			font-family: sans-serif;
			font-size: 25px;
			text-align: center;
			color: ;
			margin: 10px;
			border-color: blue;
			padding: 10px;
		}
		.form{
			float :right;
			background-color:#eeeeee; 
			height:300px;
		    width:100px;
		    padding:5px; 
		}
		.footer{
		background-color: #A9A9A9;
			text-align: center;
			margin: 10px;
			padding: 10px;
			
		}
		/*body{
			background-image: url('http://wallpapercave.com/wp/khv9YHz.jpg');

		}*/
	</style>
</head>
<body>

<header class="header">
</header>

<div class="menu">
</div>

<div class="form">
<form action="" method="post" accept-charset="utf-8">
Enter Program<br><br>
<fieldset>	
	</fieldset>
</form>


<br>
<br>

</div>

<div class="body">
<h1>Welcome to my home page!</h1>
<?php include 'vars.php';
echo "This is an $color $car.";
?>
<p>Rendering File Inclusion.</p>
<p>With JAVA files.</p>
</div>



<div class="footer">

</div>
</body>
</html>