package mongoDB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;
import com.mongodb.Block;
import com.mongodb.client.FindIterable;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Sorts.ascending;
import static java.util.Arrays.asList;

public class Finding {
public static void main(String[] args) {
	
	
	MongoClient mongoClient = new MongoClient("localhost", 27017);
	MongoDatabase db = mongoClient.getDatabase("test");
	
	//Full DataBase
	/*FindIterable<Document> iterable = db.getCollection("restaurants").find();
	iterable.forEach(new Block<Document>() {
	    @Override
	    public void apply(final Document document) {
	        System.out.println(document);
	    }
	});*/
	
	FindIterable<Document> iterable = db.getCollection("restaurants").find(
	        new Document("borough", "Manhattan"));
	iterable.forEach(new Block<Document>() {
	    @Override
	    public void apply(final Document document) {
	        System.out.println(document);
	    }
	});
	
}
}
