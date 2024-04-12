package com.day4q2.day4q2.service;

import java.util.List;
import java.util.Optional;

// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.day4q2.day4q2.model.Job;
import com.day4q2.day4q2.repository.JobRepo;


@Service
public class JobService {
    @Autowired
    JobRepo jobRepo;

    public Job job(Job J)
    {
        return jobRepo.save(J);
    }
    public List<Job> getId()
    {
        return jobRepo.findAll();
    }
    public Optional<Job> getbyid(int id)
    {
        return jobRepo.findById(id);
    }
}
