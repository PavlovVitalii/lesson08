package com.company.covertors;

import com.company.Student;
import com.company.interfaces.IStudentStringConverter;

/**
 * @author Pavlov Vitalii
 */

public class ConvertStudentMultilineText implements IStudentStringConverter {


    @Override
    public String convert(Student student) {

        String infoStudent = new StringBuilder()
                .append(" name=")
                .append(student.getName())
                .append("\n")
                .append(" age=")
                .append(student.getAge())
                .append("\n")
                .append(" id=")
                .append(student.getId())
                .append("\n")
                .append(" salary=")
                .append(student.getSalary())
                .append("\n")
                .toString();

        return infoStudent;
    }

}
