package com.student.manage;

public class Student {
    private int studentId;
    private String studentName;
    private String studentPhone;
    private int studentAge;

    public Student(int studentId, String studentName, String studentPhone, int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentAge = studentAge;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public Student(String studentName, String studentPhone, int studentAge) {
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentAge = studentAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentPhone='" + studentPhone + '\'' +
                ", studentAge=" + studentAge +
                '}';
    }
}
