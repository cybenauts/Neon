package com.info.service;

import com.info.model.Employee;

public class EmployeeService 
{
	public static boolean verifyEmployee(Employee emp)
	{
		boolean flag = false;
		
		String username = emp.getUsername();
		String password = emp.getPassword();
		
		if("Namit".equalsIgnoreCase(username) && "namit123".equals(password))
		{
			flag = true;
		}
		
		return flag;
	}
}
