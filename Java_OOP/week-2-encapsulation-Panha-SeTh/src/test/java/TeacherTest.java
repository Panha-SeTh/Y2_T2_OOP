import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import school.management.Teacher;

public class TeacherTest {

    @Test
    public void testValidConstructor() {
        Teacher t = new Teacher("Mr. Dara", 30, "T001", 2000);

        assertEquals("Mr. Dara", t.getName());
        assertEquals(30, t.getAge());
        assertEquals("T001", t.getTeacherId());
        assertEquals(2000, t.getSalary());
    }

    @Test
    public void testAnnualSalaryCalculation() {
        Teacher t = new Teacher("Ms. Lina", 28, "T002", 1500);
        assertEquals(18000, t.getAnnualSalary());
    }

    @Test
    public void testInvalidName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Teacher("", 30, "T003", 2000);
        });
    }

    @Test
    public void testInvalidAge() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Teacher("Mr. Young", 24, "T004", 2000);
        });
    }

    @Test
    public void testInvalidSalaryZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Teacher("Mr. Poor", 35, "T005", 0);
        });
    }

    @Test
    public void testInvalidSalaryNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Teacher("Mr. Debt", 40, "T006", -500);
        });
    }
}
