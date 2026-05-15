package com.arl.arl_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;    

@NoArgsConstructor
@AllArgsConstructor
@Data

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

   

    
}
