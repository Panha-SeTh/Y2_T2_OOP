import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import school.management.Student;
public class StudentTest {

    @Test
    public void testValidConstructor() {
        Student st = new Student("Name", 20, "idt123", 3.4);

        assertEquals("Name", st.getName());
        assertEquals(20, st.getAge());
        assertEquals("idt123", st.getStudentId());
        assertEquals(3.4, st.getGpa());
        assertFalse(st.isHonorStudent());
    }

    @Test
    public void testHonorStudentBoundary() {
        Student st = new Student("Top", 22, "idt999", 3.5);
        assertTrue(st.isHonorStudent());
    }

    @Test
    public void testInvalidName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Student("", 20, "id1", 3.0);
        });
    }

    @Test
    public void testInvalidAge() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Student("Name", 17, "id2", 3.0);
        });
    }

    @Test
    public void testInvalidGpaTooHigh() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Student("Name", 20, "id3", 4.5);
        });
    }

    @Test
    public void testInvalidGpaNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Student("Name", 20, "id4", -1.0);
        });
    }
}

