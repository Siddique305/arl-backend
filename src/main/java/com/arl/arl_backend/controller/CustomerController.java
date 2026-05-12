package com.arl.arl_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.arl.arl_backend.entity.Customer;
import com.arl.arl_backend.service.CustomerService;


@RestController
@RequestMapping("/customers")
public class CustomerController {


    @Autowired
    private CustomerService customerService;
    
    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);

    }

    @GetMapping
    public List<Customer> getCustomer(){
        return customerService.getAllCustomers();
    }
}
