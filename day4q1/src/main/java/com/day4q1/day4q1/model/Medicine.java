package com.day4q1.day4q1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medicine {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int medicineid;
   private String medicineName;
   private String medicineFor;
   private String medicineBrand;
   private String medicineturedln;
   private double medicinePrice;
   private String expiryDate;
   public Medicine(int medicineid, String medicineName, String medicineFor, String medicineBrand,
         String medicineturedln, double medicinePrice, String expiryDate) {
      this.medicineid = medicineid;
      this.medicineName = medicineName;
      this.medicineFor = medicineFor;
      this.medicineBrand = medicineBrand;
      this.medicineturedln = medicineturedln;
      this.medicinePrice = medicinePrice;
      this.expiryDate = expiryDate;
   }
   public Medicine(){}
   public int getMedicineid() {
      return medicineid;
   }
   public void setMedicineid(int medicineid) {
      this.medicineid = medicineid;
   }
   public String getMedicineName() {
      return medicineName;
   }
   public void setMedicineName(String medicineName) {
      this.medicineName = medicineName;
   }
   public String getMedicineFor() {
      return medicineFor;
   }
   public void setMedicineFor(String medicineFor) {
      this.medicineFor = medicineFor;
   }
   public String getMedicineBrand() {
      return medicineBrand;
   }
   public void setMedicineBrand(String medicineBrand) {
      this.medicineBrand = medicineBrand;
   }
   public String getMedicineturedln() {
      return medicineturedln;
   }
   public void setMedicineturedln(String medicineturedln) {
      this.medicineturedln = medicineturedln;
   }
   public double getMedicinePrice() {
      return medicinePrice;
   }
   public void setMedicinePrice(double medicinePrice) {
      this.medicinePrice = medicinePrice;
   }
   public String getExpiryDate() {
      return expiryDate;
   }
   public void setExpiryDate(String expiryDate) {
      this.expiryDate = expiryDate;
   }
   
}
