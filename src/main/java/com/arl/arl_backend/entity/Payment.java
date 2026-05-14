package com.arl.arl_backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name="payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String paymentType;
    private double amount;
    private String paymentDate;
    private String remarks;

    @ManyToOne
    @JoinColumn(name="booking_id")
    private Booking booking;

    public Payment(){

    }

    public Payment(Long id, String paymentType, double amount, String paymentDate, String remarks, Booking booking) {
        this.id = id;
        this.paymentType = paymentType;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.remarks = remarks;
        this.booking = booking;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    

    
    
}
