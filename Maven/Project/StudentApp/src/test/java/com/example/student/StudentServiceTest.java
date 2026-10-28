
package com.example.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class StudentServiceTest {

    private final StudentService service = new StudentService();

    @Test
    void shouldCalculateAverageCorrectly() {
        Student student = new Student(
            "Paras", 101, new double[]{80, 90, 70}
        );

        assertEquals(80.0, service.calculateAverage(student), 0.001);
    }

    @Test
    void shouldPassWhenAverageIsAtLeast40() {
        Student student = new Student(
            "Aman", 102, new double[]{40, 40, 40}
        );

        assertTrue(service.hasPassed(student));
    }

    @Test
    void shouldFailWhenAverageIsBelow40() {
        Student student = new Student(
            "Riya", 103, new double[]{30, 35, 39}
        );

        assertFalse(service.hasPassed(student));
    }

    @Test
    void shouldRejectMarksAbove100() {
        assertThrows(
            IllegalArgumentException.class,
            () -> new Student("Aman", 102, new double[]{110})
        );
    }

    @Test
    void shouldRejectEmptyName() {
        assertThrows(
            IllegalArgumentException.class,
            () -> new Student(" ", 102, new double[]{80})
        );
    }
}
