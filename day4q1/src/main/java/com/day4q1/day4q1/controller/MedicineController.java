package com.day4q1.day4q1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.day4q1.day4q1.model.Medicine;
import com.day4q1.day4q1.service.MedicineService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class MedicineController {
    @Autowired
    MedicineService medicineService;
    

    @PostMapping("/medicine/insert")
    public Medicine postMethodName(@RequestBody Medicine entity) {
       return medicineService.savemedicine(entity);
    }
    @GetMapping("/medicine/datas")
    public List<Medicine> getMethodName() {
        return medicineService.findMedicine();
    }

    @GetMapping("/medicine/data/{id}")
    public Optional<Medicine> getMethodName(@PathVariable int id) {
        return medicineService.findbyid(id);
    }
    
    
    

}
