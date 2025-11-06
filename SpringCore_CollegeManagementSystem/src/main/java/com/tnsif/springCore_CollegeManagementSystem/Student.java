package com.tnsif.springCore_CollegeManagementSystem;

public class Student {
    private String studentName;
    private int studentId;
    private String email;
    private String city;

    public Student() {
    }

    public Student(String studentName, int studentId, String email, String city) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.email = email;
        this.city = city;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student Name: " + studentName + ", ID: " + studentId + ", Email: " + email + ", City: " + city;
    }
}
