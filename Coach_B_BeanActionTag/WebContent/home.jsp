<%@page import="com.info.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ page import="com.info.model.Employee"  %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
	<h2>Welcome to the Home page. Mr.
	
		<%
			Employee emp = (Employee)session.getAttribute("emp");
					
			String phone = request.getParameter("phone");
			String city = request.getParameter("city");
		%>	
			<%=emp.getUsername() %><br>
			Phone: <%=phone %><br>
			City: <%=city %>	
	</h2>
</body>
</html>