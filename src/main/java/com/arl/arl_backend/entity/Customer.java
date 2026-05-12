package com.arl.arl_backend.entity;
import jakarta.persistence.*;


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

    public Customer(){

    }

    public Customer(Long id, String companyName, String contactPerson, String mobileNumber, String address) {
        this.id = id;
        this.companyName = companyName;
        this.contactPerson = contactPerson;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getcompanyName() {
        return companyName;
    }

    public void setcompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    

}