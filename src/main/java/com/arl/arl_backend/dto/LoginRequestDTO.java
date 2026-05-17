package com.arl.arl_backend.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequestDTO {

    @NotBlank(message=" Username is Required")
    private String username;

    @NotBlank(message=" Password is Requried")
    private String password;

    
}
