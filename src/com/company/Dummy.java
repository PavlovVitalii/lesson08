package com.company;

import com.company.interfaces.IStudentPrinter;
import com.company.interfaces.IStudentStringConverter;

public class Dummy implements IStudentPrinter {

    IStudentStringConverter converter;

    public Dummy(IStudentStringConverter converter) {
        this.converter = converter;
    }

    @Override
    public void print(Student student) {

    }
}
