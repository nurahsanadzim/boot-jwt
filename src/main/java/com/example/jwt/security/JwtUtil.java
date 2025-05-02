package com.example.jwt.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import javax.crypto.SecretKey;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;

public class JwtUtil {
    private static final String SECRET = "${jwt.secret}";
    private final SecretKey secretKey = Keys.hmacShaKeyFor(SECRET.getBytes());

    @Value("${jwt.expiration}")
    private Long exp;

    public String generateToken(String username) {
        // return Jwts.builder()
        //     .subject(username)
        //     .issuedAt(new Date())
        //     .expiration(new Date(System.currentTimeMillis() + exp))
        //     .signWith(secretKey)
        //     .compact();
        return "testGenerateToken";
    }

    // public Claims extractClaims(String token) {
    public String extractClaims(String token) {
        // return Jwts.parser()
        //         .verifyWith(secretKey)
        //         .build()
        //         .parseSignedClaims(token)
        //         .getPayload();
        return "testExtractClaims";
    }

    // public boolean isTokenExpired(String token) {
    //     return extractClaims(token).getExpiration().before(new Date());
    // }

    // public String extractUsername(String token) {
    //     return extractClaims(token).getSubject();
    // }

    // public boolean validateToken(String token, String username) {
    //     return (username.equals(extractUsername(token)) && !isTokenExpired(token));
    // }
}
