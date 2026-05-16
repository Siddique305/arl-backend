package com.arl.arl_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.arl.arl_backend.dto.RegisterRequestDTO;
import com.arl.arl_backend.entity.User;
import com.arl.arl_backend.repository.UserRepository;

@Service
public class UserServive {

    @Autowired
    private UserRepository userRepository;
   
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public User registerUser(RegisterRequestDTO register) {
        User user = new  User();

        user.setUsername(register.getUsername());

        //encode password
        user.setPassword(
            passwordEncoder.encode(register.getPassword())
        );

        user.setRole(register.getRole());

        return userRepository.save(user);

    }
    
}
