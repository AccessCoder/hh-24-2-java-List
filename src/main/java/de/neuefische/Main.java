package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        School school = new School();

        school.addStudent(new Student("Max", "Muster", "1"));
        school.addStudent(new Student("Maxi", "Muster", "2"));

//        school.printStudents();
//        System.out.println(school.findById("2"));

        school.deleteStudent(new Student("Max", "Muster", "1"));
        school.deleteStudentById("2");

       school.printStudents();
    }
}