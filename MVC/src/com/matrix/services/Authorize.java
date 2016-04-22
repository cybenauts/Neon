package com.matrix.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.matrix.model.Employee;

public class Authorize {

	

	public static boolean isAuthorize(Employee emp)
	{
		boolean flag = false;
		String u = emp.getEmail();
		String p = emp.getPassword();
	try{
		Connection con = MySqlConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("select email,password from user where email=? and password =?");
		ps.setString(1,u);
		ps.setString(2,p);
		ResultSet rs = ps.executeQuery();
			if(rs.next()){
				flag = true;
			}
		}
		catch(Exception e){
			System.out.println("Exception in "+new Authorize().getClass()+" "+e);
		}
	//Very BAD practice check copy for details
		/*finally {
			return flag;
		}
*/		return flag;
		
	}
}
