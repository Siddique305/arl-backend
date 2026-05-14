package com.arl.arl_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arl.arl_backend.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    
}
