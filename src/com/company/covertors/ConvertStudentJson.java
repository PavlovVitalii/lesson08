package com.company.covertors;

import com.company.Student;
import com.company.interfaces.IStudentStringConverter;

/**
 * @author Pavlov Vitaliy
 */

public class ConvertStudentJson implements IStudentStringConverter {
//
//    StringBuilder brackets = new StringBuilder("{}");
//    StringBuilder name = new StringBuilder("\n \"name\": \"\"");
//    StringBuilder age = new StringBuilder("\n \"age\": ");
//    StringBuilder id = new StringBuilder("\n \"id\": ");
//    StringBuilder salary = new StringBuilder("\n \"salary\": \n");
//    StringBuilder stringBuilder = new StringBuilder();


    @Override
    public String convert(Student student) {

        String infoStudent = new StringBuilder()
                .append("{\n")
                .append(" \"name\": \"")
                .append(student.getName())
                .append("\"\n")
                .append(" \"age\": \"")
                .append(student.getAge())
                .append("\"\n")
                .append(" \"id\": \"")
                .append(student.getId())
                .append("\"\n")
                .append(" \"salary\": \"")
                .append(student.getSalary())
                .append("\"\n")
                .append("}")
                .toString();

        return infoStudent;
    }


}
