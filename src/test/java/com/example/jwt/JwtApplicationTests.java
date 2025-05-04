package com.example.jwt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.jwt.security.JwtUtil;
// import io.jsonwebtoken.Claims;


@SpringBootTest
public class JwtApplicationTests {

    @Autowired
    private JwtUtil jwtUtil;

    // static JwtUtil jwtUtil;

    @Test
    void jwtUtilDebug() {
        System.out.println("#### START DEBUG ####");
        
        String test = jwtUtil.generateToken("debug username");

        System.out.println("jwtUtilDebug: " + test);
        
        System.out.println("#### END DEBUG ####");
    }
}
