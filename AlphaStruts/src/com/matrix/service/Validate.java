package com.matrix.service;

import com.matrix.model.Student;

public class Validate {
	public static boolean isValid(Student stu){
		boolean flag = false;
		if("dareloder@gmail.com".equals(stu.getName())&&"matrix786".equals(stu.getPassword())){
			flag = true;
		}
	return flag;
	}
}
