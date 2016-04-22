package com.matrix.services;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.matrix.model.Employee;

public class Insert {

	public static boolean isInserted(Employee emp){
		boolean flag=false;
		try{
		Connection con = ConnectDB.isConnected();
		PreparedStatement ps =con.prepareStatement("insert into user values(?,?,?,?,?,?)");
		ps.setString(1, emp.getEmail());
		ps.setString(2, emp.getPassword());
		ps.setString(3, emp.getName());
		ps.setString(4, emp.getPhone());
		ps.setString(5, emp.getDob());
		ps.setString(6, String.valueOf(emp.getGender().charAt(0))); 
		//Trick Extracting Char using String.valueOf(char)
		
		if(ps.executeUpdate() > 0){
			flag = true;
		}
		}
		catch(Exception e){
			System.out.println("Exception in "+new Insert().getClass()+":"+e);
		}
		
		return flag;
	}
}
