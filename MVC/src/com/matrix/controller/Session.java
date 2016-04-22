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

@WebServlet("/session")
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Session() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		RequestDispatcher rd ;
		
		HttpSession session = request.getSession(false);
		String u = (String)session.getAttribute("username");
		System.out.println("Session:"+session.isNew());
		
			 rd = request.getRequestDispatcher("admin.html");
				rd.include(request, response);
				out.println("<script> document.getElementById('notify').innerHTML = 'Welcome : "+u+"';</script>");

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
