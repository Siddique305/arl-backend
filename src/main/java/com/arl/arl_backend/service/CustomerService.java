package com.arl.arl_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arl.arl_backend.entity.Customer;
import com.arl.arl_backend.repository.CustomerRepository;

@Service  // Registers this class as Spring Bean.
public class CustomerService {


    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
        
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
    
}
