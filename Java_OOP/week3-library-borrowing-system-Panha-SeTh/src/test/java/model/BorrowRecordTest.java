package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.library.model.Book;
import com.library.model.BorrowRecord;

public class BorrowRecordTest {
    private final Book b = new Book("ABC", "BCA");
    @Test
    public void constructor(){
        BorrowRecord r = new BorrowRecord(b, 1);
        assertEquals(r.getBook(), b);
        assertEquals(b.isAvailable(), false);

        r.returnBook();
    }

    @Test
    public void borrowNotAvailableBook(){
        BorrowRecord r = new BorrowRecord(b, 2);
        assertThrows(IllegalArgumentException.class, ()->{
            new BorrowRecord(b, 1);
        });
        r.returnBook(); // 
    }

    @Test
    public void totalBorrowed(){
        assertEquals(0, BorrowRecord.getTotalBorrowed());
        BorrowRecord r = new BorrowRecord(b, 2);
        assertEquals(1, BorrowRecord.getTotalBorrowed());
        r.returnBook();
        assertEquals(0, BorrowRecord.getTotalBorrowed());

    }
}
