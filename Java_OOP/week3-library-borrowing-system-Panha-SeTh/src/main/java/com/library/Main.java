package com.library;

import com.library.model.Book;
import com.library.model.BorrowRecord;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert Martin");
        Book book2 = new Book("Effective Java", "Joshua Bloch");

        BorrowRecord r1 = new BorrowRecord(book1, 7);

        System.out.println(book1.isAvailable()); // false
        System.out.println(BorrowRecord.getTotalBorrowed()); // 1

        r1.returnBook();
        System.out.println(book1.isAvailable()); // true

        System.out.println(book2.isAvailable()); // true
    }
}