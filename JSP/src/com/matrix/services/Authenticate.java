package com.matrix.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.matrix.model.Employee;

public class Authenticate {
public static boolean isAuthenticated(Employee emp){
	boolean flag=false;
	String u = emp.getEmail();
	String p =emp.getPassword();
	//System.out.println("In Authenticate class"+u+"::"+p);
	try{
		Connection con = ConnectDB.isConnected();
		PreparedStatement ps = con.prepareStatement("select * from user where email=? and password =?");
		ps.setString(1, u);
		ps.setString(2, p);
		ResultSet rs =ps.executeQuery();
		if(rs.next()){  
			flag=true;
			emp.setName(rs.getString(3));
			emp.setPhone(rs.getString(4));
			emp.setDob(rs.getString(5));
			emp.setGender(rs.getString(6));
			
			/*System.out.println("Check");
			System.out.println(emp.getEmail()+emp.getPassword()+emp.getName()+emp.getPhone());
			System.out.println(emp.getDob()+emp.getGender());*/
		}
		
		con.close(); //check
	}
	catch(Exception e){
		e.printStackTrace();
	}

	return flag;
}
}
