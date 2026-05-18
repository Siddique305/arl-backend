package com.arl.arl_backend.security;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;

import java.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter{

@Autowired
private JwtUtil jwtUtil;

@Override
protected void doFilterInternal(
    HttpServletRequest request, HttpServletResponse response, 
    FilterChain filterChain) throws ServletException, IOException{

        final String authHeader = request.getHeader("Authorization");
        String username = null;
        String role= null;
        String jwtToken = null;

         // CHECK TOKEN PRESENT
        if(authHeader != null && authHeader.startsWith("Bearer ")){
            jwtToken = authHeader.substring(7);

            // EXTRACT USERNAME
            if(jwtUtil.validateToken(jwtToken)){
                username = jwtUtil.extractUsername(jwtToken);
            }
        }

        // AUTHENTICATE USER
        if(username !=null && SecurityContextHolder.getContext().getAuthentication() == null){
            UsernamePasswordAuthenticationToken authToken = new
            UsernamePasswordAuthenticationToken(
                username,  null,  List.of(
                        new SimpleGrantedAuthority(
                                "ROLE_" + role
                        )
                )
            );

            authToken.setDetails(new 
                WebAuthenticationDetailsSource()
                .buildDetails(request));

            SecurityContextHolder.getContext()
            .setAuthentication(authToken);
        }

        filterChain.doFilter(request, response);


    }

    
}
