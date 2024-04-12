package com.day4q2.day4q2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.day4q2.day4q2.model.Job;
import com.day4q2.day4q2.repository.JobRepo;
import com.day4q2.day4q2.service.JobService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class JobController {
    
    @Autowired
    JobService jobService;

    @PostMapping("/job/insert")
    public Job postMethodName(@RequestBody Job entity) {
        return jobService.job(entity);
    }
    
    @GetMapping("/job/data")
    public List<Job> getMethodName()
    {
        return jobService.getId();
    }

    @GetMapping("/job/data/{id}")
    public Optional<Job> getMethodName(@PathVariable int id) {
        return jobService.getbyid(id);
    }
    
}
