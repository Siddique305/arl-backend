package com.arl.arl_backend.entity;

import com.arl.arl_backend.enumtype.BookingStatus;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;    

@NoArgsConstructor
@AllArgsConstructor
@Data
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
    @Enumerated(EnumType.STRING)
    private BookingStatus status;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

   @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;
    
    
    
}
