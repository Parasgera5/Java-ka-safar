
package com.example.student;

public class Student {

    private final String name;
    private final int id;
    private final double[] marks;

    public Student(String name, int id, double[] marks) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                "Student name cannot be empty"
            );
        }

        if (marks == null || marks.length == 0) {
            throw new IllegalArgumentException(
                "Marks must not be empty"
            );
        }

        for (double mark : marks) {
            if (!Double.isFinite(mark) || mark < 0 || mark > 100) {
                throw new IllegalArgumentException(
                    "Each mark must be between 0 and 100"
                );
            }
        }

        this.name = name;
        this.id = id;
        this.marks = marks.clone();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double[] getMarks() {
        return marks.clone();
    }
}
