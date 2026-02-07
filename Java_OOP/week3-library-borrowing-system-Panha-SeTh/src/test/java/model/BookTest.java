package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.library.model.Book;

public class BookTest {
    String title = "How to cheat";
    String author = "Anonymous";

    @Test
    public void testBook(){
        
        
        Book b = new Book(title, author);

        assertEquals(title, b.getTitle());
        assertEquals(author, b.getAuthor());
    }

    @Test
    public void contructorValidation(){
        assertThrows(IllegalArgumentException.class, ()->{
            new Book(title, "");
        });

        assertThrows(IllegalArgumentException.class, ()->{
            new Book("", author);
        });
        assertThrows(IllegalArgumentException.class, ()->{
            new Book("", "");
        });
    }


}
