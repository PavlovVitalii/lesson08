package com.company.covectors;

import com.company.Student;
import com.company.interfaces.IStudentStringConverter;

/**
 * @author Pavlov Vitalii
 */

public class ConvertStudentXml  {

    StringBuilder root = new StringBuilder("<student>\n</student>");
    StringBuilder name = new StringBuilder("\n    <name></name>");
    StringBuilder age = new StringBuilder("\n    <age></age>");
    StringBuilder id = new StringBuilder("\n    <id></id>");
    StringBuilder salary = new StringBuilder("\n    <salary></salary>");
    StringBuilder stringBuilder = new StringBuilder();


    public String convert(Student student) {

        String nameStudent = student.getName();
        int ageStudent = student.getAge();
        int idStudent = student.getId();
        double salaryStudent = student.getSalary();

        name.insert(11, nameStudent);
        age.insert(10, ageStudent);
        id.insert(9, idStudent);
        salary.insert(13, salaryStudent);

        stringBuilder.append(name).append(age).append(id).append(salary);
        root.insert(9, stringBuilder);
        String studentStr = root.toString();

        return studentStr;
    }


}
