package com.day4.day4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.day4.day4.model.Student;
import com.day4.day4.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/insert")
    public Student postMethodName(@RequestBody Student entity) {
       return studentService.saveStudent(entity);
    }
    
}
