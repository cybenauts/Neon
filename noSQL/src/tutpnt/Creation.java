package tutpnt;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;



public class Creation {
public static void main(String[] args) {
	
	
	MongoClient mongoClient = new MongoClient("localhost", 27017);
	MongoDatabase db = mongoClient.getDatabase("test");
}
}
