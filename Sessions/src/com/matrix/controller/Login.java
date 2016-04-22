package com.matrix.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
    }
    
    public boolean auth(String u,String p){
    	/*if(u.equals("dareloder@gmail.com") && p.equals("matrix786"))
    	{
    		return true;
    		}
    	else
    		return false;*/
    	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","matrix78692110");
		PreparedStatement ps=con.prepareStatement("select email,password from user where email=? and password=?");
		ps.setString(1, u);
		ps.setString(2, p);
		ResultSet rs=ps.executeQuery();
		return (rs.next() == true);
    	}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*PrintWriter out = response.getWriter();
	response.setContentType("text/html");*/
	String email = request.getParameter("field1"); //$_POST['filed1']
	String pass = request.getParameter("field2");
	RequestDispatcher rd;
	if(auth(email,pass))
	{
		HttpSession session = request.getSession();
		session.setAttribute("id", email); //Session Creation
		
		rd = request.getRequestDispatcher("details.html");
		rd.forward(request, response);
	}
	else
	{
		 rd =request.getRequestDispatcher("pnf/index.html");
		 rd.forward(request, response);
	}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
