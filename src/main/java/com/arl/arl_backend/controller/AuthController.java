package com.arl.arl_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.arl.arl_backend.dto.RegisterRequestDTO;
import com.arl.arl_backend.entity.User;
import com.arl.arl_backend.response.ApiResponse;
import com.arl.arl_backend.service.UserServive;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserServive userService;

    @PostMapping("/register")
    public ApiResponse<User> registerUser(@Valid @RequestBody RegisterRequestDTO register) {

      User saveUser = userService.registerUser(register);
      return new ApiResponse<>(
        true,
        "User registered successfully",
        saveUser
      );
        
    }
    
}
