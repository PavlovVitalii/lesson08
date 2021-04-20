package com.company.covertors;

import com.company.Student;
import com.company.interfaces.IStudentStringConverter;

/**
 * @author Pavlov Vitaliy
 */

public class ConvertStudentToString implements IStudentStringConverter {

    @Override
    public String convert(Student student) {

        String studentInfo = new StringBuilder()
                .append(" Имя: ")
                .append(student.getName())
                .append("\n Возраст: ")
                .append(student.getAge())
                .append("\n ID: ")
                .append(student.getId())
                .append("\n Зарплата: ")
                .append(student.getSalary())
                .toString();

        return studentInfo;
    }
}
