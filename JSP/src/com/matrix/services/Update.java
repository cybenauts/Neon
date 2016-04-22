package com.matrix.services;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.matrix.model.Employee;

public class Update {

	public static boolean isUpdated(Employee emp){
		boolean flag=false;
		try{
		Connection con = ConnectDB.isConnected();
		PreparedStatement ps =con.prepareStatement("update user set password=?,name=?,dob=?,gender=? where email=?");
		ps.setString(1, emp.getPassword());
		ps.setString(2, emp.getName());
		ps.setString(3, emp.getDob());
		ps.setString(4, String.valueOf(emp.getGender().charAt(0))); 
		ps.setString(5, emp.getEmail());
		//Trick Extracting Char using String.valueOf(char)
		
		if(ps.executeUpdate() > 0){
			flag = true;
		}
		con.close();
		}
		catch(Exception e){
			System.out.println("Exception in "+new Update().getClass()+":"+e);
		}
		
		return flag;
	}
}
