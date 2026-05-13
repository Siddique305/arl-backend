package com.arl.arl_backend.entity;

import jakarta.persistence.*;

@Entity

@Table(name="vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vehicleNumber;
    private String ownerName;
    private String ownerMobile;
    private String driverName;
    private String driverMobile;
    private String vehicleType;
    private Boolean available;

    public Vehicle(){
        
    }

    public Vehicle(Long id, String vehicleNumber, String ownerName, String ownerMobile, String driverName,
            String driverMobile, String vehicleType, Boolean available) {
        this.id = id;
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.ownerMobile = ownerMobile;
        this.driverName = driverName;
        this.driverMobile = driverMobile;
        this.vehicleType = vehicleType;
        this.available = available;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerMobile() {
        return ownerMobile;
    }

    public void setOwnerMobile(String ownerMobile) {
        this.ownerMobile = ownerMobile;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getdriverMobile() {
        return driverMobile;
    }

    public void setdriverMobile(String driverMobile) {
        this.driverMobile = driverMobile;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String VehicleType) {
        this.vehicleType = VehicleType;
    }

    public Boolean isAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
    

    
}
