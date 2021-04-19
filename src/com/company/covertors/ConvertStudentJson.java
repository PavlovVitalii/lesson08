package com.company.covertors;

import com.company.Student;
import com.company.interfaces.IStudentStringConverter;

/**
 * @author Pavlov Vitaliy
 */

public class ConvertStudentJson implements IStudentStringConverter {

    StringBuilder brackets = new StringBuilder("{}");
    StringBuilder name = new StringBuilder("\n \"name\": \"\"");
    StringBuilder age = new StringBuilder("\n \"age\": ");
    StringBuilder id = new StringBuilder("\n \"id\": ");
    StringBuilder salary = new StringBuilder("\n \"salary\": \n");
    StringBuilder stringBuilder = new StringBuilder();


    @Override
    public String convert(Student student) {

        String nameStudent = student.getName();
        int ageStudent = student.getAge();
        int idStudent = student.getId();
        double salaryStudent = student.getSalary();

        name.insert(11, nameStudent).append(",");
        age.insert(9, ageStudent).append(",");
        id.insert(8, idStudent).append(",");
        salary.insert(12, salaryStudent);

        stringBuilder.append(name).append(age).append(id).append(salary);
        brackets.insert(1, stringBuilder);
        String studentStr = brackets.toString();

        return studentStr;
    }


}
