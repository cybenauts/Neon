<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
		
		<%
			System.out.println("Request is being processed!!!");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			if(username.equalsIgnoreCase("Namit") && password.equals("namit123"))
			{
				out.println("<h1>A valid user</h1>");
			}
			else
			{
				out.println("<h1>Invalid user</h1>");				
			}		
		%>
		
	</body>
</html>