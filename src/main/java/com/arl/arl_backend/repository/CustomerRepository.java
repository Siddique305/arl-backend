package com.arl.arl_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// spring automatically give save, findAll, findById, delete, update .

import com.arl.arl_backend.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    
}
