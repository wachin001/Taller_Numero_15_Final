package com.example.demo.model;

public class Patient {
    private Long id;
    private String name;
    private String lastName;
    private String idNumber;
    private int age;
    private String phone;

    // Constructor vacío (necesario para deserialización)
    public Patient() {
    }

    // Constructor con parámetros
    public Patient(Long id, String name, String lastName, String idNumber, int age, String phone) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.age = age;
        this.phone = phone;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
