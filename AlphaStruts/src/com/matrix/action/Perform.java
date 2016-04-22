package com.matrix.action;

import com.matrix.model.Student;
import com.matrix.service.Validate;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Perform extends ActionSupport implements ModelDriven<Student> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Student stu = new Student();
	
	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}
	
	public String execute(){
		if(Validate.isValid(stu)){
			return "yes";
		}
		else{
			return "no";	
		}
	}
	
	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		return stu;
	}

}
