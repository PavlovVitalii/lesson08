package com.company;

import com.company.covertors.ConvertStudentJson;
import com.company.covertors.ConvertStudentMultilineText;
import com.company.covertors.ConvertStudentToString;
import com.company.covertors.ConvertStudentXml;
import com.company.interfaces.IStudentPrinter;
import com.company.interfaces.IStudentStringConverter;
import com.company.printters.DelegatePrint;
import com.company.printters.Dummy;
import com.company.printters.PrintStudentSystem;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Pavlov Vitaliy
 */

public class Main {


    public static void main(String[] args) {


        Student student = new Student("Роман", 20, 56, 543.59);

//        // конвертор JSON
//        ConvertStudentJson convertStudentJson = new ConvertStudentJson();
//        System.out.println("JSON format");
//        System.out.println("-----------");
//        System.out.println(convertStudentJson.convert(student));
//        System.out.println();
//
//        // конвертор XML
//        ConvertStudentXml convertStudentXml = new ConvertStudentXml();
//        System.out.println("XML format");
//        System.out.println("----------");
//        System.out.println(convertStudentXml.convert(student));
//        System.out.println();
//
//        // конвертор Multiline Text
//        ConvertStudentMultilineText convertStudentMultilineText = new ConvertStudentMultilineText();
//        System.out.println("Multiline Text format");
//        System.out.println("---------------------");
//        System.out.println(convertStudentMultilineText.convert(student));
//        System.out.println();
//
//        // задание 8.4.1 вывод в косоль
//        PrintStudentSystem printStudentSystem = new PrintStudentSystem(new ConvertStudentToString());
//        Student student1 = new Student("Григорий", 20, 12, 55.5);
//        printStudentSystem.print(student1);
//        System.out.println();
//
//        // задание 8.4.2 ничего не выводит
//        Dummy dummy = new Dummy(new ConvertStudentToString());
//        dummy.print(student1);
//        System.out.println();
//
//        // задание 8.4.3 делегирование
//        Dummy dummy1 = new Dummy(new ConvertStudentToString());
//        PrintStudentSystem printStudentSystem1 = new PrintStudentSystem(new ConvertStudentToString());
//        IStudentPrinter[] iStudentPrinters = {printStudentSystem1, dummy1};
//        DelegatePrint delegatePrint = new DelegatePrint(iStudentPrinters);
//        delegatePrint.print(student1);


        // задание 10.2
        int compare;
        compare = Student.runCompareByName()
                .compare(student, new Student("Иван", 20, 56, 543.59));
        System.out.println(compare);

        compare = Student.runCompareByAge()
                .compare(student, new Student("Роман", 21, 56, 543.59));
        System.out.println(compare);

        compare = Student.runCompareByNameAge()
                .compare(student, new Student("Роман", 20, 56, 543.59));
        System.out.println(compare);
        System.out.println("-----------------");


        // задание 10.3
        compare = Student.runCompareToByName()
                .compare(student, new Student("Роман", 20, 56, 543.59));
        System.out.println(compare);

        compare = Student.runCompareToByAge()
                .compare(student, new Student("Роман", 20, 56, 543.59));
        System.out.println(compare);

        compare = Student.runCompareToByNameAge()
                .compare(student, new Student("Роман", 25, 56, 543.59));
        System.out.println(compare);
        System.out.println("-----------------");

        
        // задание 10.4
        IStudentStringConverter converter = Student.converter();
        IStudentPrinter printer = Student.printer();
        printer.print(student);


    }


}
