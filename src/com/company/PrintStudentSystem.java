package com.company;

import com.company.covectors.ConvertStudentToString;
import com.company.interfaces.IStudentPrinter;
import com.company.interfaces.IStudentStringConverter;

public class PrintStudentSystem implements IStudentPrinter {

    ConvertStudentToString studentString;

    public PrintStudentSystem(ConvertStudentToString studentString) {
        this.studentString = studentString;
    }


    @Override
    public void print(Student student) {
        String studentInfo = studentString.convert(student);
        System.out.println(studentInfo);
    }


}
