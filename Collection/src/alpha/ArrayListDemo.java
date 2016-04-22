package alpha;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	static int i;
	public static void main(String[] args) {
		ArrayList<String> names= new ArrayList<String>();
		names.add("Sherlock");
		names.add("Watson");
		names.add("Stark");
		names.add("Escobar");
		
		/*for(String name:names)
		{
			System.out.println("Element:"+(i++)+name);
		}*/
		/*for(int j=0;j<names.size();j++)
		{
			System.out.println("Element:"+(i++)+names.get(j));
		}
*/
		Iterator<String> iter=names.iterator();
		
		System.out.println("Size before removal:"+names.size());
		while(iter.hasNext())
		{ 
			//iter.remove(); //IllegalStateException
			System.out.println("Element:"+(i++)+iter.next());
			iter.remove();
		}
		System.out.println("Size after removal:"+names.size());
	}
	

}
