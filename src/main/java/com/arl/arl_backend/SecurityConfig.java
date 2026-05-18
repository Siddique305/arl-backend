package com.arl.arl_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.arl.arl_backend.security.JwtAuthenticationFilter;

@Configuration
public class SecurityConfig {

    @Autowired
    private JwtAuthenticationFilter jwtFilter;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(
            HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable())

                .sessionManagement(session -> session.sessionCreationPolicy(
                    SessionCreationPolicy.STATELESS
                ))
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/auth/login")
                        .permitAll()
                        
                        .requestMatchers("/auth/register").hasRole("ADMIN")
                        .requestMatchers("/bookings/**").hasAllRoles("ADMIN","EMPLOYEE")
                        .requestMatchers("/customers/**").hasAllRoles("ADMIN","EMPLOYEE")
                        .requestMatchers("/reports/**").hasAllRoles("ADMIN","VIEWER")

                        .anyRequest()
                        .authenticated()
                )
                .addFilterBefore(
                    jwtFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
    
}
