package com.matrix.controller;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/second")
public class GenSer extends GenericServlet {
	
	private static final long serialVersionUID = 1L;
       
    public GenSer() {
        super();
           }

	//Automatically called 
	/*public void init(ServletConfig config) throws ServletException {
	System.out.println("Init of Gen Ser from Servlet Interface ");
	}*/

	//Automatically called from init(ServletConfig config)
	public void init()
	{
		System.out.println("Init of Genereic Servlet");
	}
	
	public void destroy() {
		System.out.println("Destroy of Genereic Servlet");
	}

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Service of Genereic Servlet");
	}

}
