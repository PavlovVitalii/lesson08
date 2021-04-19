package com.company.covertors;

import com.company.Student;

/**
 * @author Pavlov Vitalii
 */

public class ConvertStudentXml  {

   private StringBuilder root = new StringBuilder("<student>\n</student>");
   private StringBuilder name = new StringBuilder("\n    <name></name>");
   private StringBuilder age = new StringBuilder("\n    <age></age>");
   private StringBuilder id = new StringBuilder("\n    <id></id>");
   private StringBuilder salary = new StringBuilder("\n    <salary></salary>");
   private StringBuilder stringBuilder = new StringBuilder();


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
