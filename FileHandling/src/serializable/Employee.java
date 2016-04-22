package serializable;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 3080116125590279148L;

	
int id;
String name;
int x;
String y;

public Employee(int id, String name,int x,String y) {
	super();
	this.id = id;
	this.name = name;
	this.x=x;
	this.y=y;
	
}

public void show()
{
	System.out.println(id+":::"+name+"::"+x+"::"+y);
}
}
