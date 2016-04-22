package alpha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;

public class DBManager {
	public DBManager() {
	}
	
		Connection con=null;
		int ch;
		String email,password,name,phone,dob,gender;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void input() throws IOException,ParseException{
		estabCon(); //establishing connection
		System.out.println("Do You Want To: \n[1]-[Login] \n[2]-[Register]");
		ch=Integer.parseInt(br.readLine());
		
		if(ch==1)
		{
			int c=1;
	do{
			System.out.println("\r");
			System.out.format("[LOGIN FORM]\n");
			System.out.println("Enter The Login ID:");
			email=br.readLine();
			System.out.println("Enter The Password:");
			password=br.readLine();
			if(login(email, password))
			{
				System.out.println("\r[AUTHENTICATED]");
				c=0;
			}
			else
			{
				System.out.println("[INVALID ID or PASSWORD]");
				System.out.println("\r[RETRY][1]\n[TERMINATE][0]");
				c=Integer.parseInt(br.readLine());
				
			}
		}
			while(c!=0);
			termCon();
			System.exit(0);
		}
		
		else if(ch==2)
		{
			int c=1;
	   do{
			System.out.println("\r");
			System.out.format("[REGISTRATION FORM]\n");
			System.out.println("Enter The Login ID:");
			email=br.readLine();
			System.out.println("Enter The Password:");
			password=br.readLine();
			System.out.println("Enter The Name:");
			name=br.readLine();
			System.out.println("Enter The Phone No.:");
			phone=br.readLine();
			do{
			System.out.println("Enter The Date of Birth(DD-MM-YYYY):");
			dob=br.readLine();
			}
			while(!dob.matches("\\d{2}-\\d{2}-\\d{4}"));//regEx
			System.out.println("Enter Gender(M/F)");
			gender=br.readLine();
		if(register(email, password, name, phone, dob, gender))
		{
			System.out.println("\r[DATA ENTERED]");
			System.exit(0);
		}
		else
		{
			System.out.println("\r[DATA NOT ACCEPTED]");
			System.out.println("\r[RETRY][1]\n[TERMINATE][0]");
			c=Integer.parseInt(br.readLine());
		}
	   }
		while(c!=0);
		termCon();
		System.exit(0);	
		}
		else
		{
			System.out.println("[INVALID INPUT]");
			termCon();
			System.exit(0);
		}
		
	}
	
	public void estabCon(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","matrix78692110");
		System.out.println("<connection started>");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public void termCon(){
		try{
		con.close();
		System.out.println("<Connection Ended>");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public boolean login(String mail,String pass){
		try{
		PreparedStatement ps=con.prepareStatement("select email,password from user where email=? and password=?");
		ps.setString(1, mail);
		ps.setString(2, pass);
		
		ResultSet rs=ps.executeQuery();
		return (rs.next());
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
		
	}
	
	public boolean register(String e,String p,String n,String ph,String d,String g){
		try{
			PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?,STR_TO_DATE(?,'%d-%m-%Y'),?);");
			ps.setString(1, e);
			ps.setString(2, p);
			ps.setString(3, n);
			ps.setString(4, ph);
			ps.setString(5, d);
			ps.setString(6, g);
	
			if(ps.executeUpdate()>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			}
			catch(Exception ex)
			{
				System.out.println(ex.toString());
				return false;
			}
			
		
	}
	
	public static void main(String[] args) {
		
		DBManager db = new DBManager();
		try{
		db.input();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		

}
}
