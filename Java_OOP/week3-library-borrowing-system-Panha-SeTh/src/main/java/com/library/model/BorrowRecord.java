package com.library.model;

public class BorrowRecord {
    private Book book;        // reference type
    private int days;         // primitive

    private static int totalBorrowed = 0;

    public BorrowRecord(Book book, int days) {
        setBook(book);
        setDays(days);

        book.markBorrowed();
        totalBorrowed++;
    }

    public Book getBook() {
        return book;
    }

    private void setBook(Book book) {
        if (book == null){
            throw new IllegalArgumentException("Book must not be null");
        }
        if (!book.isAvailable()) {
            throw new IllegalArgumentException("Book is not available");
        }
        this.book = book;
    }
    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        if(days <= 0){
            throw new IllegalArgumentException("Days must be greater than 0");
        }
        this.days = days;
    }

    public static int getTotalBorrowed() {
        return totalBorrowed;
    }

    public void returnBook() {
        this.book.markReturned();
        totalBorrowed--;
    }
}
