package tutpnt;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class SelectAlter {

	public static void main(String[] args) {
		 

 		MongoClient client = new MongoClient("localhost", 27017);
 		MongoDatabase db = client.getDatabase("matrix");
 		
 		MongoCollection<Document> collection = db.getCollection("Auth");
  
 		List<Document> lst = (List<Document>) collection.find().into(new ArrayList<Document>());
  
                for(Document document : lst){
                    System.out.println(document);
        }

	}

}
