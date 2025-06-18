package org.example;

public class NonFicitonBook extends Books
{
    private String Subject;
    public NonFicitonBook(String id, String Title, String Author, String Subject)
    {
        super(id,Title, Author);
        this.Subject = Subject;
    }

    public String getSubject() {
        return Subject;
    }
}
