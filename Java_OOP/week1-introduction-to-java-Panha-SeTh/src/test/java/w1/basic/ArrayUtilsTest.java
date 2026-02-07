package w1.basic;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {
    @Test
    public void testSum(){
        assertEquals(10, ArrayUtils.sum(new int[]{2,3,5}));
    }

    @Test
    public void testMax(){
        assertEquals(10, ArrayUtils.max(new int[]{10, 1,-5,-15}));
    }

    @Test
    public void testSort(){
        assertArrayEquals(new int[]{1,1,2,3}, ArrayUtils.sort(new int[]{3,2,1,1}));
    }
}
