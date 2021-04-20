package com.company.covertors;

import com.company.Student;
import com.company.interfaces.IStudentStringConverter;

/**
 * @author Pavlov Vitalii
 */

public class ConvertStudentXml implements IStudentStringConverter {

    @Override
    public String convert(Student student) {

        String studentInfo = new StringBuilder()
                .append("<student>")
                .append("\n    <name>")
                .append(student.getName())
                .append("</name>")
                .append("\n    <age>")
                .append(student.getAge())
                .append("</age>")
                .append("\n    <id>")
                .append(student.getId())
                .append("</id>")
                .append("\n    <salary>")
                .append(student.getSalary())
                .append("</salary>")
                .append("\n<student>\n")
                .toString();

        return studentInfo;
    }


}
