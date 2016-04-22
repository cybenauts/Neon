package com.matrix.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Show {
public static ResultSet showData(){
	ResultSet rs = null;
	try{
	Connection con = MySqlConnection.getConnection();
	PreparedStatement ps=con.prepareStatement("select * from user");
	rs = ps.executeQuery();
	}
	catch(Exception e){
		System.out.println(e);
	}
	return rs;
}
}
