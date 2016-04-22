package com.matrix.controller;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/third")
public class SerInt implements Servlet {

    
    public SerInt() {
        
    }

	
	public void init(ServletConfig config) throws ServletException {
       System.out.println("Init of Servlet Interface");
	}

	
	public void destroy() {
		System.out.println("Destroy of Servlet Interface");
	}
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Service of Servlet Interface");
	}
	
	public ServletConfig getServletConfig() {

		return null;
	}

	public String getServletInfo() {

		return null; 
	}

	
	

}
