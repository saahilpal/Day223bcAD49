package org.example;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class mongo {
    private final MongoCollection<Document> collection;

    public mongo() {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

        MongoDatabase database = mongoClient.getDatabase("testdb");

        this.collection = database.getCollection("Books");
    }

    public void insertBook(Books book) {
        Document doc = new Document("id", book.getid())
                .append("title", book.getTitle())
                .append("author", book.getAuthor());

        if (book instanceof FictionBook) {
            doc.append("type", "Fiction")
                    .append("genre", ((FictionBook) book).getGenre());
        } else if (book instanceof NonFicitonBook) {
            doc.append("type", "NonFiction")
                    .append("subject", ((NonFicitonBook) book).getSubject());
        }

        collection.insertOne(doc);
        System.out.println("Book inserted successfully!");
    }

    public void displayAllBooks() {
        System.out.println(" Books in the Library:");
        for (Document doc : collection.find()) {
            System.out.println(doc.toJson());
        }
    }
}