package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String ...m){
		
		Hashtable<String, String> names=new Hashtable<String,String>();
		//HashMap<String, String> names=new HashMap<String,String>();
		//LinkedHashMap<String, String> names=new LinkedHashMap<String,String>();
		
		names.put("K_999", "Sherlock");//no order is maintained 
		names.put("K_222", "Watson");
		names.put("K_333", "Stark");
		names.put("K_444", "Escobar");
		names.put("K_555", "Hannibal");
		
		names.put("K_444", "Pablo");//overwrite existing
		
		//1 Way of retrieval
		/*Set<String> keys=names.keySet();//Holding in to SET which is compatible with Iterator
		
		for(String k: keys){
			System.out.println(k+" : "+names.get(k));
		}*/
		
		Set<Map.Entry<String, String>> entries=names.entrySet();
		
		for(Map.Entry<String, String> ent: entries){
			System.out.println(ent.getKey()+":"+ent.getValue());
		}
		
		
		
		
	}

}
