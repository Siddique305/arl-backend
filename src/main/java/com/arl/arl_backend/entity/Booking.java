package com.arl.arl_backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="booking")
public class Booking {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String fromLocation;
    private String toLocation;
    private String materialType;
    private Double freightAmount;
    private Double advanceAmount;
    private Double remainingAmount;
    private String status;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

   @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;
    
    public Booking(){

    }

    public Booking(Long id, String fromLocation, String toLocation, String materialType, Double freightAmount,
            Double advanceAmount, Double remainingAmount, String status, Customer customer, Vehicle vehicle) {
        this.id = id;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.materialType = materialType;
        this.freightAmount = freightAmount;
        this.advanceAmount = advanceAmount;
        this.remainingAmount = remainingAmount;
        this.status = status;
        this.customer = customer;
        this.vehicle = vehicle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public Double getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(Double freightAmount) {
        this.freightAmount = freightAmount;
    }

    public Double getAdvanceAmount() {
        return advanceAmount;
    }

    public void setAdvanceAmount(Double advanceAmount) {
        this.advanceAmount = advanceAmount;
    }

    public Double getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(Double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    
}
