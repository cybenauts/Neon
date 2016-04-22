package com.matrix.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.matrix.services.Show;

@WebServlet("/admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Admin() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		RequestDispatcher rd ;
		
		HttpSession session = request.getSession(false);
		String u = (String)session.getAttribute("username");
		System.out.println(session.isNew());
		
		if(session.isNew() == false){
			String data="Email:Password:FName:Phone:DateOfBirth:Gender";
			String s = request.getParameter("submit");
		    
			if(s.equals("Show") ||(s.equals("Update"))||(s.equals("Delete"))){
				
		    rd = request.getRequestDispatcher("admin.html");
			rd.include(request, response);
			out.println("<script> document.getElementById('notify').innerHTML = 'Welcome : "+u+"';</script>");
			
				ResultSet rs = Show.showData();
			try {
				while(rs.next()){
				data+=rs.getString(1)+":";
				data+=rs.getString(2)+":";
				data+=rs.getString(3)+":";
				data+=rs.getString(4)+":";
				data+=rs.getString(5)+":";
				data+=rs.getString(6)+":";
				}
			}
			catch (SQLException e) {
				System.out.println("No data "+e);
			}
			//System.out.println(data);
			out.println("<script> document.getElementById('textarea').innerHTML ='"+data+"';</script>");
		}	
	}
		else{
			
			rd =request.getRequestDispatcher("index.html");
			rd.include(request, response);
			out.println("<script> document.getElementById('demo').innerHTML = '* no sneeking ';</script>");
		}
	}
	
	



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
