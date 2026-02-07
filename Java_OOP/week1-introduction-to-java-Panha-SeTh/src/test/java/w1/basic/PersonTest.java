package w1.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void testConstructor(){
        Person p = new Person("The Snake", 15);
        assertEquals("The Snake", p.getName());
        assertEquals(15, p.getAge());
    }
}
