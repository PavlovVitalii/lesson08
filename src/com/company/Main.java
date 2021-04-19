package com.company;

import com.company.covertors.ConvertStudentJson;
import com.company.covertors.ConvertStudentMultilineText;
import com.company.covertors.ConvertStudentToString;
import com.company.covertors.ConvertStudentXml;
import com.company.interfaces.IStudentPrinter;
import com.company.printters.DelegatePrint;
import com.company.printters.Dummy;
import com.company.printters.PrintStudentSystem;

/**
 * @author Pavlov Vitaliy
 */

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Роман", 20, 56, 543.59);

        // конвертор JSON
        ConvertStudentJson convertStudentJson = new ConvertStudentJson();
        System.out.println("JSON format");
        System.out.println("-----------");
        System.out.println(convertStudentJson.convert(student));
        System.out.println();

        // конвертор XML
        ConvertStudentXml convertStudentXml = new ConvertStudentXml();
        System.out.println("XML format");
        System.out.println("----------");
        System.out.println(convertStudentXml.convert(student));
        System.out.println();

        // конвертор Multiline Text
        ConvertStudentMultilineText convertStudentMultilineText = new ConvertStudentMultilineText();
        System.out.println("Multiline Text format");
        System.out.println("---------------------");
        System.out.println(convertStudentMultilineText.convert(student));
        System.out.println();

        // задание 8.4.1 вывод в косоль
        PrintStudentSystem printStudentSystem = new PrintStudentSystem(new ConvertStudentToString());
        Student student1 = new Student("Григорий",22,12,55.5);
        printStudentSystem.print(student1);
        System.out.println();

        // задание 8.4.2 ничего не выводит
        Dummy dummy = new Dummy(new ConvertStudentToString());
        dummy.print(student1);
        System.out.println();

        // задание 8.4.3 делегирование
        Dummy dummy1 = new Dummy(new ConvertStudentToString());
        PrintStudentSystem printStudentSystem1 = new PrintStudentSystem(new ConvertStudentToString());
        IStudentPrinter[] iStudentPrinters = {printStudentSystem1,dummy1};
        DelegatePrint delegatePrint = new DelegatePrint(iStudentPrinters);
        delegatePrint.print(student1);
   }
}
