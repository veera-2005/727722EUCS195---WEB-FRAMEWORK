package com.day4q1.day4q1.service;

import java.util.List;
import java.util.Optional;

// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.day4q1.day4q1.model.Medicine;
import com.day4q1.day4q1.repository.MedicineRepo;

@Service
public class MedicineService {
    @Autowired
    MedicineRepo medicineRepo;
    public Medicine savemedicine(Medicine M)
    {
        return medicineRepo.save(M);
    }
    public List<Medicine> findMedicine()
    {
        return medicineRepo.findAll();
    }
    public Optional<Medicine> findbyid(int id)
    {
        return medicineRepo.findById(id);
    }
}
