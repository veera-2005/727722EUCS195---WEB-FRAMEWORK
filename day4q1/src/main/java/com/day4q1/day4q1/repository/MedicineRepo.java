package com.day4q1.day4q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day4q1.day4q1.model.Medicine;

public interface MedicineRepo extends JpaRepository <Medicine,Integer> {

}
