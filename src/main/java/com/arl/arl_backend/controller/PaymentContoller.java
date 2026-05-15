package com.arl.arl_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.arl.arl_backend.entity.Payment;
import com.arl.arl_backend.response.ApiResponse;
import com.arl.arl_backend.service.PaymentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/payments")
public class PaymentContoller {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public ApiResponse<Payment> addPayment(@Valid @RequestBody Payment payment){

        Payment newPayment = new Payment();

        newPayment.setAmount(payment.getAmount());
        newPayment.setPaymentDate(payment.getPaymentDate());
        newPayment.setRemarks(payment.getRemarks());
        newPayment.setBooking(payment.getBooking());
        
        Payment savPayment = paymentService.savePayment(newPayment);
        return new ApiResponse<>(
            true, "Payment added successfully", savPayment
        );
    }

    @GetMapping
    public List<Payment> getAllPayments(){
        return paymentService.getAllPayments();
    }
    
}
