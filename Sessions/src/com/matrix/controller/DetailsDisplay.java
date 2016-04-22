package com.matrix.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DetailsDisplay
 */
@WebServlet("/detailsDisp")
public class DetailsDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DetailsDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session = request.getSession();
		String email = (String)session.getAttribute("id"); //Type Conversion 
		
		String s1=request.getParameter("field1");
		String s2=request.getParameter("field2");
		//String s3=request.getParameter("field3");
		String s4=request.getParameter("field4");
		String s5=request.getParameter("field5");
		
		out.println("Hello "+ s1+"<br>");
		out.println("Your Contact No. is "+s2+"<br>");
		out.println("Your Interest is in "+s4+"<br>");
		out.println("About Your College "+s5+"<br>");
		out.println("<strong>Your LOGIN ID is: </strong>"+email+"<i> [Session Var]</i>");	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
