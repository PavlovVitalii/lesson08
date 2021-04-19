package com.company.printters;

import com.company.Student;
import com.company.covertors.ConvertStudentToString;
import com.company.interfaces.IStudentPrinter;

/**
 * @author Pavlov Vitaliy
 */

public class Dummy implements IStudentPrinter {

   private ConvertStudentToString studentString;

    public Dummy(ConvertStudentToString studentString) {
        this.studentString = studentString;
    }

    @Override
    public void print(Student student) {

    }
}
