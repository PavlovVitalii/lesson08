package com.company.printters;

import com.company.Student;
import com.company.covertors.ConvertStudentToString;
import com.company.interfaces.IStudentPrinter;

/**
 * @author Pavlov Vitaliy
 */

public class PrintStudentSystem implements IStudentPrinter {

   private ConvertStudentToString studentString;

    public PrintStudentSystem(ConvertStudentToString studentString) {
        this.studentString = studentString;
    }


    @Override
    public void print(Student student) {
        String studentInfo = studentString.convert(student);
        System.out.println(studentInfo);
    }


}
