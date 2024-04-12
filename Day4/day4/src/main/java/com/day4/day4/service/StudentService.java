package com.day4.day4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4.day4.model.Student;
import com.day4.day4.repository.StudentRopository;

@Service
public class StudentService {

   @Autowired
   private StudentRopository repository;
    
    public Student saveStudent(Student entity)
     {
        return repository.save(entity);
    }
    
}