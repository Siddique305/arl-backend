package com.arl.arl_backend.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;    

@NoArgsConstructor
@AllArgsConstructor
@Data

public class PaymentDTO {

    @NotBlank(message = "Payment type is required")
    private String paymentType;

    @NotBlank(message = "Amount is required")
    private double amount;
    @NotBlank(message = "Payment date is required")
    private String paymentDate;
    @NotBlank(message = "Remarks is required")
    private String remarks;

    @NotBlank(message = "Booking ID is required")
    private Long booking_id;
    
   
    
}

