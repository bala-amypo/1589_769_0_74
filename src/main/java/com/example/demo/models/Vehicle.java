package com.example.demo.models;

public class Vehicle {
    private Long id;
    private User user;
    private String vehicleNumber;
    private Double capacityKg;
    private Double fuelEfficiency;
    public Vehicle(){}
    public Vehicle(User user, String vehicleNumber, Double capacityKg, Double fuelEfficiency) {
        this.user = user;
        this.vehicleNumber = vehicleNumber;
        this.capacityKg = capacityKg;
        this.fuelEfficiency = fuelEfficiency;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public void setCapacityKg(Double capacityKg) {
        this.capacityKg = capacityKg;
    }
    public void setFuelEfficiency(Double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }
    public Long getId() {
        return id;
    }
    public User getUser() {
        return user;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public Double getCapacityKg() {
        return capacityKg;
    }
    public Double getFuelEfficiency() {
        return fuelEfficiency;
    }
    

    
}