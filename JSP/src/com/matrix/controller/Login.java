package com.matrix.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.matrix.model.Employee;
import com.matrix.services.Authenticate;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");
		RequestDispatcher rd;
		Employee emp = new Employee();
		String u =request.getParameter("field1");
		String p=request.getParameter("field2");
		emp.setEmail(u);
		emp.setPassword(p);
	
	if(Authenticate.isAuthenticated(emp)){
		HttpSession session = request.getSession();
		session.setAttribute("emp", emp);//name of session var : object of Employee class
		rd = request.getRequestDispatcher("update.jsp");
		rd.forward(request, response);
	}
	else{
		rd =request.getRequestDispatcher("index.jsp");
		rd.include(request, response);
		//out.println("<script>window.alert('Invalid Credentials'); </script>");
		out.println("<script> document.getElementById('demo').innerHTML = '*check username or password';</script>");
	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
