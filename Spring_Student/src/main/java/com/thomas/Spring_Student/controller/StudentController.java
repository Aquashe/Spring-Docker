package com.thomas.Spring_Student.controller;

import com.thomas.Spring_Student.model.Student;
import com.thomas.Spring_Student.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo repo;
    @GetMapping("getStudents")
    public ResponseEntity<List<Student>> getSTudents(){
        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
    }

    @PostMapping("addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        return new ResponseEntity<>(repo.save(student),HttpStatus.CREATED);
    }
}
