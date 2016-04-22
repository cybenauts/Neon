package setState;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Freeze {

	public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException
	{
		//Serialization
  	   /* Employee e1=new Employee();
		Employee e2=new Employee(2014,"Steve Jobs","Inno.Dept",7860916162L,7000.00);
		FileOutputStream fout=new FileOutputStream("backup.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fout);
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.close();
		fout.close();
		System.out.println("Serialization Completed");*/
		
		 //Deserialization
		FileInputStream fin=new FileInputStream("backup.ser");
		ObjectInputStream ois=new ObjectInputStream(fin);
		
		Employee e1=(Employee)ois.readObject();
		Employee e2=(Employee)ois.readObject();
		e1.show();
		e2.show();
		
	}

}
