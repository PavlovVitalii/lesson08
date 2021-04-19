package com.company.covertors;

import com.company.Student;
import com.company.interfaces.IStudentStringConverter;

/**
 * @author Pavlov Vitaliy
 */

public class ConvertStudentToString implements IStudentStringConverter {

   private StringBuilder name = new StringBuilder(" Имя: ");
   private StringBuilder age = new StringBuilder("\n Возраст: ");
   private StringBuilder id = new StringBuilder("\n ID: ");
   private StringBuilder salary = new StringBuilder("\n Зарплата: ");
   private StringBuilder stringBuilder = new StringBuilder();
   private String studentInfo;
   private Student student;


    @Override
    public String convert(Student student) {

        String nameStudent = student.getName();
        int ageStudent = student.getAge();
        int idStudent = student.getId();
        double salaryStudent = student.getSalary();

        name.insert(6, nameStudent);
        age.insert(11, ageStudent);
        id.insert(6, idStudent);
        salary.insert(12, salaryStudent);

        stringBuilder.append(name).append(age).append(id).append(salary);
        studentInfo = stringBuilder.toString();

        return studentInfo;
    }
}
