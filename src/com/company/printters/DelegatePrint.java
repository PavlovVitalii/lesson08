package com.company.printters;

import com.company.Student;
import com.company.interfaces.IStudentPrinter;

/**
 * @author Pavlov Vitaliy
 */

public class DelegatePrint implements IStudentPrinter {

    private IStudentPrinter[] iStudentPrinters;

    public DelegatePrint(IStudentPrinter[] iStudentPrinters) {
        this.iStudentPrinters = iStudentPrinters;
    }

    @Override
    public void print(Student student) {
        for (int i = 0; i < iStudentPrinters.length; i++) {
            iStudentPrinters[i].print(student);
        }
    }
}
