<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="com.info.model.Employee" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	</head>
	
	<body>
		
		<%
			String username = request.getParameter("username");
			String password = request.getParameter("password");		

			if("Namit".equalsIgnoreCase(username) && "namit123".equals(password))
			{		
		%>		
				<jsp:useBean id="emp" class="com.info.model.Employee" scope="session">
					<jsp:setProperty name="emp" property="username" value="<%=username%>" />
					<jsp:setProperty name="emp" property="password" value="<%=password %>" />
				</jsp:useBean>
				
				<h1>Welcome to the home!!!</h1>
				<h2>
				<form action='home.jsp'>
				Enter Phone: <input type='text' name='phone'>
				Enter City: <input type='text' name='city'>
				<input type='submit' value='Submit'>
				</form>
				</h2>
						
		<%	
			}
			else
			{				
		%>
				<font style="color:red">Wrong username or password...</font>
				<jsp:include page="index.html" />
		<%					
			}
		%>
		
	
		
		
		
	</body>
</html>