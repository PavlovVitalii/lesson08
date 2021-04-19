package com.company.covertors;

import com.company.Student;
import com.company.interfaces.IStudentStringConverter;

/**
 * @author Pavlov Vitalii
 */

public class ConvertStudentMultilineText implements IStudentStringConverter {

   private StringBuilder name = new StringBuilder(" name=");
   private StringBuilder age = new StringBuilder("\n age=");
   private StringBuilder id = new StringBuilder("\n id=");
   private StringBuilder salary = new StringBuilder("\n salary=");
   private StringBuilder stringBuilder = new StringBuilder();


    @Override
    public String convert(Student student) {

        String nameStudent = student.getName();
        int ageStudent = student.getAge();
        int idStudent = student.getId();
        double salaryStudent = student.getSalary();

        name.insert(6, nameStudent);
        age.insert(6, ageStudent);
        id.insert(5, idStudent);
        salary.insert(9, salaryStudent);

        stringBuilder.append(name).append(age).append(id).append(salary);
        String studentStr = stringBuilder.toString();

        return studentStr;
    }

}
