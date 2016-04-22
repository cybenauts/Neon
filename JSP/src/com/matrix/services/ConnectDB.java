package com.matrix.services;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
	public static Connection isConnected(){
		
		Connection con = null;
try{
	Class.forName("com.mysql.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","matrix78692110");
}
catch(Exception e)
{
	System.out.println("Exception While Making Connection in Connect DB"+e);
}

	return con;
}
}