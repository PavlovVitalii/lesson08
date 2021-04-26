package com.company;

import java.util.Comparator;

/**
 * @author Pavlov Vitaliy
 */

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

//----------------------------------------------------------------------
// задание 10


    // задание 10.1
    private static class CompareByName implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    // 10.1
    private static class CompareByAge implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.age, o2.age);
        }
    }

    // 10.1
    private static class CompareByNameAge implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            CompareByAge compareToByAge = new CompareByAge();

            if (o1.name.compareTo(o2.name) == 0) {
                compareToByAge.compare(o1, o2);
            }

            return o1.name.compareTo(o2.name);
        }
    }

    // задание 10.2
    public static Comparator<Student> runCompareByAge() {
        return new CompareByAge();
    }

    // задание 10.2
    public static Comparator<Student> runCompareByName() {
        return new CompareByName();
    }

    // задание 10.2
    public static Comparator<Student> runCompareByNameAge() {
        return new CompareByNameAge();
    }

    // задание 10.3
    public static Comparator<Student> runCompareToByAge() {
        Comparator<Student> comparator;
        comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.age, o2.age);
            }
        };

        return comparator;
    }


    // задание 10.3
    public static Comparator<Student> runCompareToByName() {
        Comparator<Student> comparator;
        comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        return comparator;
    }

    // задание 10.3
    public static Comparator<Student> runCompareToByNameAge() {
        Comparator<Student> comparator;
        comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.name.compareTo(o2.name) == 0) {
                    return Integer.compare(o1.age, o2.age);
                }
                return o1.name.compareTo(o2.name);
            }
        };


        return comparator;
    }
}
