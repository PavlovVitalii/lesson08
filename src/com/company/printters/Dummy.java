package com.company.printters;

import com.company.Student;
import com.company.interfaces.IStudentPrinter;
import com.company.interfaces.IStudentStringConverter;

/**
 * @author Pavlov Vitaliy
 */

public class Dummy implements IStudentPrinter {

    private IStudentStringConverter converter;

    public Dummy(IStudentStringConverter converter) {
        this.converter = converter;
    }

    @Override
    public void print(Student student) {

    }
}
