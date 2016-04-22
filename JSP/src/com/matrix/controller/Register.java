package com.matrix.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.matrix.model.Employee;
import com.matrix.services.Insert;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Register() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
	Employee emp = new Employee();
	emp.setName(request.getParameter("field1"));
	//Address//request.getParameter("field2");
	emp.setEmail(request.getParameter("field3"));
	emp.setPhone(request.getParameter("field4"));
	emp.setGender(request.getParameter("field5"));
	emp.setPassword(request.getParameter("field6"));
	emp.setDob(request.getParameter("field9"));
	
	RequestDispatcher rd;
	if(Insert.isInserted(emp)){
		rd = request.getRequestDispatcher("index.jsp");
		rd.include(request, response);
		out.println("<script> document.getElementById('notify').innerHTML = 'Successfully Registered<br>Login Now';</script>");
		out.println("<script> var x=document.getElementById('notify'); x.style.color='#cb6868'; x.style.fontSize='15px';</script>");
	}
	else{
		rd = request.getRequestDispatcher("details.jsp");
		rd.include(request, response);
		out.println("<script> document.getElementById('renter').innerHTML='Entry Failed Retry'</script>");
		
	}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
