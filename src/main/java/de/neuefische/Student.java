package de.neuefische;

import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private String StudentId;

    public Student(String firstName, String lastName, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        StudentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", StudentId='" + StudentId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(StudentId, student.StudentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, StudentId);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }
}
