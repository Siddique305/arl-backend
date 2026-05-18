package com.arl.arl_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.arl.arl_backend.dto.LoginRequestDTO;
import com.arl.arl_backend.dto.RegisterRequestDTO;
import com.arl.arl_backend.entity.User;
import com.arl.arl_backend.repository.UserRepository;
import com.arl.arl_backend.security.JwtUtil;

@Service
public class UserServive {

    @Autowired
    private UserRepository userRepository;
   
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

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

    public String loginUser(LoginRequestDTO loginRequest){
        User user = userRepository.findByUsername(
            loginRequest.getUsername()).
            orElseThrow(()-> new RuntimeException("Invalid Username"));

        boolean passwordMatch =
        passwordEncoder.matches(loginRequest.getPassword(), user.getPassword());

        if(!passwordMatch){
            throw new RuntimeException("Invalid Password");
        }
        
        return jwtUtil.generateToken(
            user.getUsername(), user.getRole()
        );
        
    }
    
}
