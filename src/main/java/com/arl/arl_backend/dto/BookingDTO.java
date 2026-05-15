package com.arl.arl_backend.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;    

@NoArgsConstructor
@AllArgsConstructor
@Data

public class BookingDTO {
    
    @NotBlank(message = "From Location is required")
    private String fromLocation;

    @NotBlank(message = "To Location is required")
    private String toLocation;

    @NotBlank(message = "Material Type is required")
    private String materialType;

    @NotBlank(message = "FreightAmount is required")
    @Min(value = 1, message = "Freight amount must be greater than 0")
    private Double freightAmount;

    @NotBlank(message = "Advance Amount is required")
    private Double advanceAmount;

    @NotBlank(message = "Remaining Amount is required")
    private Double remainingAmount;

    @NotBlank(message = "Status is required")
    private String status;

    @NotNull(message = "Customer ID is required")
    private Long customerId;

    @NotNull(message = "Vehicle ID is required")
    private Long vehicleId;

   
}
