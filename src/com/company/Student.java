package com.company;

import com.company.interfaces.IStudentStringConverter;

public class Student {

    private String name;
    private int age;
    private int id;
    private double salary;

    public Student(String name, int age, int id, double salary) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

}
