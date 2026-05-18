package com.arl.arl_backend.security;

import java.util.Date;

import javax.crypto.SecretKey;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    private final String SECRET_KEY =
            "mySuperSecretJwtKeyForAndhraRoadLines2026Secure";

    private final SecretKey key =
        Keys.hmacShaKeyFor(SECRET_KEY.getBytes());

    public String generateToken(String username, String role) {

        return Jwts.builder()
                .setSubject(username).claim("role", role)
                .setIssuedAt(new Date())
                .setExpiration(
                        new Date(
                                System.currentTimeMillis()
                                        + 1000 * 60 * 60
                        )
                )
                .signWith(
                        key
                )
                .compact();
    }

    public String extractUsername(String token){
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    public String extractRole(String token){
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(key).build().parseClaimsJws(token).getBody();

        return claims.get("role", String.class);
    }

    public boolean validateToken(String token){
        try{
                Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJwt(token);
                return true;
        }
        catch(JwtException e){
                return false;
        }

    }
}
