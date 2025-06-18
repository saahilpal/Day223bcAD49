package org.example;

import com.mongodb.client.MongoClients;

public class Main {
    public static void main(String[] args) {
        mongo db = new mongo();


    FictionBook fb = new FictionBook("1 ","Harry potter"," J.k Rowling","fantasy");
    NonFicitonBook nfb = new NonFicitonBook("2 ","java","James Gosling", " Coding");

        db.insertBook(fb);
        db.insertBook(nfb);


        System.out.println("All Books in Library:");
        db.displayAllBooks();
    }
}