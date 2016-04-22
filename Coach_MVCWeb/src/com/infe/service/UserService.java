package com.infe.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.infe.model.User;

public class UserService
{
	public static boolean verifyUser(User obj)
	{
		boolean flag = false;
		try
		{
			Connection con = Connect.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from user where email=? AND pass=?");
			ps.setString(1, obj.getUsername());
			ps.setString(2, obj.getPassword());
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				flag = true;
			}			
		}
		catch(Exception e)
		{
			System.out.println("Error while validation!!!");
		}
		
		return flag;	
	}
}
