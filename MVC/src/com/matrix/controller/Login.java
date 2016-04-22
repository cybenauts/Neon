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

import com.matrix.model.Employee;
import com.matrix.services.Authorize;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String user = request.getParameter("field1");
		String pass = request.getParameter("field2");
		
		Employee emp = new Employee();
		emp.setEmail(user);
		emp.setPassword(pass);
		
		RequestDispatcher rd;
		
		if(Authorize.isAuthorize(emp)){
			HttpSession session = request.getSession();
			session.setAttribute("username", emp.getEmail());
			System.out.println("LOGIN:"+session.isNew());
		rd = request.getRequestDispatcher("session");
		rd.forward(request, response);
		}
		else{
		rd = request.getRequestDispatcher("index.html");
		rd.include(request, response);
		out.println("<script>window.alert('Invalid Credentials'); </script>");
		out.println("<script> document.getElementById('demo').innerHTML = '*check username or password';</script>");
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
