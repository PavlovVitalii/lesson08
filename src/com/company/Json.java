package com.company;

public class Json implements IStudentStringConverter {

    StringBuilder brackets = new StringBuilder("{}");
    StringBuilder name = new StringBuilder("\n \"name:\"");
    StringBuilder age = new StringBuilder("\n \"age:\"");
    StringBuilder id = new StringBuilder("\n \"id:\"\n");
    StringBuilder stringBuilder = new StringBuilder();


    @Override
    public String convert(Student student) {

        String nameStudent = student.getName();
        int ageStudent = student.getAge();
        int idStudent = student.getId();
        name.insert(8, nameStudent);
        age.insert(7, ageStudent);
        id.insert(6, idStudent);
        stringBuilder.append(name).append(age).append(id);
        brackets.insert(1, stringBuilder);
        String studentStr = brackets.toString();
        return studentStr;
    }

    public static void main(String[] args) {
        Json main = new Json();
        System.out.println(main.convert(new Student("SSFDBhhhhD", 25, 325)));
    }
}
