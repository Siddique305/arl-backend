package com.arl.arl_backend.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;    

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity /// this tell sping that this is  Database table
@Table(name ="customer")  // create customer table
public class Customer{

    @Id  // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment id
    private Long id;
    private String companyName;
    private String contactPerson;
    private String mobileNumber;
    private String address;

    
    

}