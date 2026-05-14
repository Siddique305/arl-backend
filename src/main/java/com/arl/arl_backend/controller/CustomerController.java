package com.arl.arl_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.arl.arl_backend.dto.CustomerDTO;
import com.arl.arl_backend.entity.Customer;
import com.arl.arl_backend.service.CustomerService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/customers")
public class CustomerController {


    @Autowired
    private CustomerService customerService;
    
    @PostMapping
    public Customer addCustomer(@Valid @RequestBody CustomerDTO customersDTO){

        Customer customer = new Customer();
        customer.setcompanyName(customersDTO.getCompanyName());
        customer.setContactPerson(customersDTO.getContactPerson());
        customer.setMobileNumber(customersDTO.getMobileNumber());
        customer.setAddress(customersDTO.getAddress());
        
        return customerService.saveCustomer(customer);

    }

    @GetMapping
    public List<Customer> getCustomer(){
        return customerService.getAllCustomers();
    }
}
