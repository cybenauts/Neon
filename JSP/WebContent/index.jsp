<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Login</title>
<link rel="stylesheet" href="css/c06.css" />
</head>
<body>

	<div class='body'></div>

	<div id="page">
		<h1>List King</h1>
		<!-- Me -->
		<h3 id="header" class="">Matrix Inc.</h3>




		<h2 id="notify">LOGIN</h2>
		<form method="post" action="login">
			<label for="username">Username: </label> <input type="email"
				id="username" name='field1' required />
			<div id="feedback"></div>

			<label for="password">Password: </label> <input type="password"
				id="password" name='field2' required />

			<!-- Notification -->
			<h6 id="demo"></h6>

			<input type="submit" value="Login" name="submit" />
			<div class="reminder">
				<b>Not a member? <a href="details.jsp">Sign up now</a></b><br>
				<b><a href="pnf/index.html">Forgot password?</a></b>
			</div>
		</form>



	</div>
	<script src="js/event-handler.js"></script>

</body>
</html>