
package com.example.student;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        System.out.println("Environment: " + AppConfig.getEnvironment());

        Student student = new Student(
            "Paras",
            101,
            new double[]{85, 90, 78}
        );

        StudentService service = new StudentService();

        double average = service.calculateAverage(student);
        boolean passed = service.hasPassed(student);

        Gson gson = new Gson();
        String json = gson.toJson(student);

        System.out.println("Student Report");
        System.out.println("--------------");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Passed: " + passed);
        System.out.println("JSON: " + json);
    }
}
