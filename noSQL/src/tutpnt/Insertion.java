package tutpnt;
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class Insertion {

	public static void main(String[] args) {
		MongoClient mongoClient= new MongoClient("localhost",27017);
		MongoDatabase db = mongoClient.getDatabase("matrix");
		
		db.createCollection("Auth");
		
		db.getCollection("Auth").insertOne(
				new Document("email", "dareloder@gmail.com")
				.append("password", "matrix786")
				);

		mongoClient.close();
	}

}
