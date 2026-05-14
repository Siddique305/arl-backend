package com.arl.arl_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.arl.arl_backend.entity.Payment;
import com.arl.arl_backend.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentContoller {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public Payment addPayment(@RequestBody Payment payment){
        return paymentService.savePayment(payment);
    }

    @GetMapping
    public List<Payment> getAllPayments(){
        return paymentService.getAllPayments();
    }
    
}
