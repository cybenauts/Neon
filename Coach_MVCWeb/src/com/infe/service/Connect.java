package com.infe.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect 
{
	public static Connection getConnection() throws Exception
	{
		Connection con = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_4pm", "root", "sumit123");
		}
		catch(Exception e)
		{
			System.out.println("Exception in Connect class: "+e);
		}
		return con;
	}
}
