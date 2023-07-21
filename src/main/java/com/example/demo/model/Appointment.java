package com.example.demo.model;

public class Appointment {
    private Long id;
    private Long patientId;
    private String specialty;

  
    public Appointment() {
    }

   
    public Appointment(Long id, Long patientId, String specialty) {
        this.id = id;
        this.patientId = patientId;
        this.specialty = specialty;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
