package com.arl.arl_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arl.arl_backend.entity.Payment;
import com.arl.arl_backend.repository.PaymentRepository;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment savePayment(Payment payment){
        return paymentRepository.save(payment);
    }
    
    public List<Payment> getAllPayments(){
        return paymentRepository.findAll();
    }
}
