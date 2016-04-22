package com.info.service;

import com.info.model.Employee;

public class Main 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		emp.setUsername("Namit");
		emp.setPassword("namit123");
		
		if(EmployeeService.verifyEmployee(emp))
			System.out.println("Okay!!!!");

	}

}
