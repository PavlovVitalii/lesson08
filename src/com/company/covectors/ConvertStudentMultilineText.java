package com.company.covectors;

import com.company.Student;
import com.company.interfaces.IStudentStringConverter;

/**
 * @author Pavlov Vitalii
 */

public class ConvertStudentMultilineText implements IStudentStringConverter {

    StringBuilder name = new StringBuilder("\n name=");
    StringBuilder age = new StringBuilder("\n age=");
    StringBuilder id = new StringBuilder("\n id=");
    StringBuilder salary = new StringBuilder("\n salary=");
    StringBuilder stringBuilder = new StringBuilder();


    @Override
    public String convert(Student student) {

        String nameStudent = student.getName();
        int ageStudent = student.getAge();
        int idStudent = student.getId();
        double salaryStudent = student.getSalary();

        name.insert(7, nameStudent);
        age.insert(6, ageStudent);
        id.insert(5, idStudent);
        salary.insert(9, salaryStudent);

        stringBuilder.append(name).append(age).append(id).append(salary);
        String studentStr = stringBuilder.toString();

        return studentStr;
    }

    public static void main(String[] args) {
        ConvertStudentMultilineText main = new ConvertStudentMultilineText();
        System.out.println(main.convert(new Student("Vitaliy", 25, 55, 364.25)));
    }
}
