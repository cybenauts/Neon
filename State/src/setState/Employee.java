package setState;

import java.io.Externalizable;
import java.io.Serializable;

public class Employee implements Serializable
{
	int id;
	String name;
	static String dept;
	transient long phNo;
	double salary;

Employee()
{
super();
id=0;
name=null;
dept=null;
phNo=0;
salary=0.0;
}
Employee(int id,String name,String dept,long phNo,double salary)
{   
	super();
	this.id=id;
	this.name=name;
	this.dept=dept;
	this.phNo=phNo;
	this.salary=salary;
}
public void show()
{
	System.out.println("Employees Details are:");
	System.out.println("ID: "+id+"\nName: "+name+"\nDepart: "+dept+"\nPhone No: "+phNo+"\nSalary: "+salary+"\n");
}
}
