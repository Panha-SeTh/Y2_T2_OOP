package w1.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    @Test
    public void testLength(){
        assertEquals(5, StringUtils.length("Hello"));
    }

    @Test
    public void testToUpper(){
        assertEquals("HELLO", StringUtils.toUpper("hello"));
    }

    @Test
    public void testRevers(){
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    public void testWordCount(){
        assertEquals(1, StringUtils.wordCount("Hello"));
        assertEquals(3, StringUtils.wordCount("Welcome to java!"));
    }
}
