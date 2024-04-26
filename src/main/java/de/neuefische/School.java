package de.neuefische;

import java.util.ArrayList;
import java.util.List;

/**
 *
 Step 3: Create a class "School" to which students can be added through a method ('addStudent').

 Step 4: Implement a method to print all students of the school (as text, to the console).

 Step 5: Add a method to find a student by their ID. The found student should be returned.

 Step 6: Create a method to remove a student from the school.
 */
public class School {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void printStudents(){
        for (Student s:students) {
            System.out.println(s);
        }
    }

    public Student findById(String id){

        for (Student s:students) {
            if (s.getStudentId().equals(id)){
                return s;
            }
        }
        return null;
    }

    public void deleteStudent(Student student){
        students.remove(student);
    }

    public void deleteStudentById(String id){
        Student student = findById(id);
        students.remove(student);
    }
}
