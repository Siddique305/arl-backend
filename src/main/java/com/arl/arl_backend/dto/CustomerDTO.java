package com.arl.arl_backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class CustomerDTO {
    
   @NotBlank(message = "Company Name is Required")
    private String companyName;
    
    @NotBlank(message = "Contact Person is requried")
    private String contactPerson;

    @Pattern(regexp="^[0-9]{10}$", message = "Mobile Number must be 10 digit")
    private String mobileNumber;

    @NotBlank(message = "Address is required")
    private String address;

    public CustomerDTO(){

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
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
