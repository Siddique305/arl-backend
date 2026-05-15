package com.arl.arl_backend.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;    

@NoArgsConstructor
@AllArgsConstructor
@Data

public class VehicleDTO {

    @NotBlank(message = "Vehicle Number is required")
    private String vehicleNumber;

    @NotBlank(message = "Owner Name is required")
    private String ownerName;
    @NotBlank(message = "Owner Mobile is required")
    private String ownerMobile;
    @NotBlank(message = "Driver Name is required")
    private String driverName;
    @NotBlank(message = "Driver Mobile is required")
    private String driverMobile;
    @NotBlank(message = "Vehicle Type is required")
    private String vehicleType;
    @NotBlank(message = "Availability is required")
    private Boolean available;


    
    
}
