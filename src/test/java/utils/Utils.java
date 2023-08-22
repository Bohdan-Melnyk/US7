package utils;

import student.Student;

public class Utils {

    public static Student createStudent(int age, int grade) {
        Student student = new Student();

        student.setAge(age);
        student.setGrade(grade);

        return student;
    }
}
