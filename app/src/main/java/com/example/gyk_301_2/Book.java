package com.example.gyk_301_2;

public class Book {
    private String book_name;
    private String book_author;

    public Book(String book_name, String book_author) {
        this.book_name = book_name;
        this.book_author = book_author;
    //burası constructor bu sayade özellikleri alıcaz okucaz.
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

}

