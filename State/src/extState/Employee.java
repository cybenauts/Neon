package extState;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;


public class Employee implements Externalizable
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
@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException 
{
	
	
}
@Override
public void writeExternal(ObjectOutput out) throws IOException
{
	
	
}
}
