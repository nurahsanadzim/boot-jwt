package com.example.jwt.initializer;

import com.example.jwt.entity.Person;
import com.example.jwt.service.PersonService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class AdminAccountCreator implements CommandLineRunner {

    private final PersonService personService;
    private final PasswordEncoder passwordEncoder;

    @Value("${app.admin.username}")
    private String adminUsername;
    
    @Value("${app.admin.email}")
    private String adminEmail;

    @Value("${app.admin.password}")
    private String adminPassword;

    public AdminAccountCreator(PersonService personService, PasswordEncoder passwordEncoder) {
        this.personService = personService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        if (personService.findByUsername(adminUsername).isEmpty()) {
            // Create root admin account
            Person admin = new Person();
            admin.setUsername(adminUsername);
            admin.setEmail(adminEmail);
            admin.setPassword(passwordEncoder.encode(adminPassword));
            admin.setAdmin(true);
            personService.savePerson(admin);
            System.out.println("Person admin account created successfully.");
        } else {
            System.out.println("Person admin account already exists.");
        }
    }
}
