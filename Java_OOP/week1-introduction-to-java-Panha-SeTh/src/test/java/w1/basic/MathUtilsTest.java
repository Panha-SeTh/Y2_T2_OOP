package w1.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    
    @Test
    public void testAdd(){
        assertEquals(5, MathUtils.add(2, 3));
    }

    @Test
    public void testMax(){
        assertEquals(10, MathUtils.max(10, -100));
    }

    @Test
    public void testIsEven(){
        assertNotEquals(false, MathUtils.isEven(6));
    }

    @Test
    public void testFactorial(){
        assertEquals(120, MathUtils.factorial(5));
    }
}
