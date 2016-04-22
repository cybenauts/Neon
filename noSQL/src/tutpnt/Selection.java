package tutpnt;

import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;

public class Selection {
public static void main(String[] args) {
	
	MongoClient mongoClient = new MongoClient("localhost",27017);
	MongoDatabase db = mongoClient.getDatabase("matrix");
	
	FindIterable<Document> iterable = db.getCollection("Auth").find();
	 
	 iterable.forEach(new Block <Document>()
	 { public void apply(final Document document)
	 {System.out.println(document);}});
}
	
	
}
