package org.example;

public class FictionBook extends Books {
    private String genre;


    public FictionBook(String id, String Title, String Author, String genre)
        {
            super(id, Title, Author);
            this.genre = genre;
        }

        public String getGenre() {
            return genre;
        }
    }
