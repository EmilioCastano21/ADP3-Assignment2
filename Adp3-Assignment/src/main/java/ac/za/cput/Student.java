package ac.za.cput;

import java.util.Objects;

/**
 * Student Number: 219035709
 * Author: Emilio Castano
 * Date Due: 16/5/2021
 */
public class Student {

    //variables
    private String studentNum;
    private String firstName;
    private int grade;


    public Student(String studentNum) {

        this.studentNum = studentNum;

    }
//Getters and Setters

    public String getStudentNum() {

        return studentNum;

    }

    public void setStudentNum(String studentNum) {

        this.studentNum = studentNum;

    }

    public String getFirstName() {

        return firstName;

    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }

    public int getGrade() {

        return grade;

    }

    public void setGrade(int grade) {

        this.grade = grade;

    }
    @Override
    public String toString() {
        return "Student{" +
                "studentNum='" + studentNum + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentNum, student.studentNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNum);
    }
}
