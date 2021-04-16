package com.company.covectors;

import com.company.Student;
import com.company.interfaces.IStudentStringConverter;

public class ConvertStudentToString implements IStudentStringConverter {

    StringBuilder name = new StringBuilder(" Имя: ");
    StringBuilder age = new StringBuilder("\n Возраст: ");
    StringBuilder id = new StringBuilder("\n ID: ");
    StringBuilder salary = new StringBuilder("\n Зарплата: ");
    StringBuilder stringBuilder = new StringBuilder();
    String studentInfo;
    Student student;


    @Override
    public String convert(Student student) {

        String nameStudent = student.getName();
        int ageStudent = student.getAge();
        int idStudent = student.getId();
        double salaryStudent = student.getSalary();

        name.insert(6, nameStudent);
        age.insert(11, ageStudent);
        id.insert(6, idStudent);
        salary.insert(12, salaryStudent);

        stringBuilder.append(name).append(age).append(id).append(salary);
        studentInfo = stringBuilder.toString();

        return studentInfo;
    }
}
