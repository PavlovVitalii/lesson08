package com.company.printters;

import com.company.Student;
import com.company.covertors.ConvertStudentToString;
import com.company.interfaces.IStudentPrinter;
import com.company.interfaces.IStudentStringConverter;

/**
 * @author Pavlov Vitaliy
 */

public class PrintStudentSystem implements IStudentPrinter {

   private IStudentStringConverter converter;

    public PrintStudentSystem(IStudentStringConverter converter) {
        this.converter = converter;
    }


    @Override
    public void print(Student student) {
        String studentInfo = converter.convert(student);
        System.out.println(studentInfo);
    }


}
