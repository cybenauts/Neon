package javaDBConnect;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBDemo {
 public static void m(String[] args) {
	try{
		//Not Require after JDBC API 4.0
		//Class c=com.mysql.jdbc.Driver.class;
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","matrix78692110");
		 Statement st=cn.createStatement();
		// st.executeUpdate("insert into employee values(4444,'1990/5/31','Pablo','Escobar',2014)");
		 ResultSet rs=st.executeQuery("select * from employee");
		 while(rs.next())
		 {
			 int e_no=rs.getInt(1);
			 Date d=rs.getDate(2);
			 String fname=rs.getString(3);
			 String lname=rs.getString(4);
			 String dept_no=rs.getString(5);
			 System.out.println(e_no+":"+d+":"+fname+":"+lname+":"+dept_no);
			 
			
		 }
		 cn.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

}
