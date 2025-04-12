package com.roy.raj.Spring.Security.Model;

public class Student {
    private String studentName;
    private String studentMajor;

    public Student(String studentName, String studentMajor) {
        this.studentName = studentName;
        this.studentMajor = studentMajor;
    }

    public String getStudentName() {    
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", studentMajor=" + studentMajor + "]";
    }
}
