package com.example.student;

public class StudentService {

    public double calculateAverage(Student student) {
        double[] marks = student.getMarks();

        double total = 0;

        for (double mark : marks) {
            total += mark;
        }

        return total / marks.length;
    }

    public boolean hasPassed(Student student) {
        return calculateAverage(student) >= 40;
    }
}
