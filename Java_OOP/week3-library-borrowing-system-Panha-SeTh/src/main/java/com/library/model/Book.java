package com.library.model;

public class Book {
    private String title;        // reference type
    private String author;       // reference type
    private boolean available;   // primitive

    public Book(String title, String author) {
        setTitle(title);
        setAuthor(author);
        this.available = true;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        if(title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title must not be null or empty");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        if(author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author must not be null or empty");
        }
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }
    void markBorrowed() {
        
        this.available = false;
    }
    void markReturned() {
        this.available = true;
    }
}
