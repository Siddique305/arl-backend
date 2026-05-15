package com.arl.arl_backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;    

@NoArgsConstructor
@AllArgsConstructor
@Data

public class CustomerDTO {
    
   @NotBlank(message = "Company Name is Required")
    private String companyName;
    
    @NotBlank(message = "Contact Person is requried")
    private String contactPerson;

    @Pattern(regexp="^[0-9]{10}$", message = "Mobile Number must be 10 digit")
    private String mobileNumber;

    @NotBlank(message = "Address is required")
    private String address;

   

}
