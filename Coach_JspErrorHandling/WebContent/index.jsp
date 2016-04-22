<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Login Form</title>
	</head>
	
	<body style="margin:0px;">

	
		<h1 style="margin-left:350px; margin-top:50px; font-family:lucida sans unicode;">Servlet Life Cycle Checking....</h1>
		<hr>
		<form action="login.jsp" method="get">
			<table style="border-radius:10px; box-shadow:10px 10px 10px grey; margin-left:420px; margin-top:130px; border:1px solid black; padding:50px; background-image:url(contentback.jpg); background-repeat:repeat-x;" cellpadding="0" cellspacing="20">

				<tr>
					<td><font style="font-family:lucida sans unicode;">UserName</font></td>
					<td><input type="text" name="username" /></td>
				</tr>			
				<tr>
					<td><font style="font-family:lucida sans unicode;">Password</font></td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Log In" /></td>
				</tr>
			</table>
		</form>
		<br><br><br>
		<hr>
	</body>
</html>