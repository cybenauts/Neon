package serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		
		try
		{
			
			
		FileInputStream fout=new FileInputStream("backup2.ser");
		ObjectInputStream os=new ObjectInputStream(fout);
		
		Employee e1=(Employee)os.readObject();
		Employee e2=(Employee)os.readObject();
		 
		
		e1.show();
		e2.show();
		
		System.out.println("Done");
		os.close();
		fout.close();
		}
		catch(Exception e)
		{
			System.out.println("Object didn't serilized"+e);
		}
	}

}
