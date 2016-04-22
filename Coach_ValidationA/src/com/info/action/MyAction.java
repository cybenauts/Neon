package com.info.action;

import com.info.model.Employee;
import com.info.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MyAction extends ActionSupport implements ModelDriven<Employee>
{
	private Employee emp = new Employee();
	
	public String execute()
	{		
		if(EmployeeService.verifyEmployee(emp))
			System.out.println("Valid User!!!!!!!");
		else
			System.out.println("Invalid User!!!");
		
		return "success";
	}


	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public Employee getModel() {
		return emp;
	}

}
