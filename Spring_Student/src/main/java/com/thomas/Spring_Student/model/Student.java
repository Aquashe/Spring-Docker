package com.thomas.Spring_Student.model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roll_no;
    private  int marks;
    private  String name;


    public Student(int roll_no, int marks, String name) {
        this.roll_no = roll_no;
        this.marks = marks;
        this.name = name;
    }

    public Student() {
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
