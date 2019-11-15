package edu.temple.bookshelf;

import java.io.Serializable;

public class Book {

    int id;
    String title;
    String author;
    int published;
    String coverURL;

    public Book(int id, String title, String author, int published, String coverURL){
        this.id = id;
        this.title = title;
        this.author = author;
        this.published = published;
        this.coverURL = coverURL;
    }

    public Book(Book bookClass) {
        this.id = bookClass.id;
        this.title = bookClass.title;
        this.author = bookClass.author;
        this.published = bookClass.published;
        this.coverURL = bookClass.coverURL;

    }

}
