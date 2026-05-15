package com.arl.arl_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;    

@NoArgsConstructor
@AllArgsConstructor
@Data

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
    

    
}
