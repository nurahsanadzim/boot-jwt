package com.example.jwt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.jwt.entity.Person;
import com.example.jwt.service.PersonService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
        
    private final PersonService personService;

    public AuthController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public Person login(@RequestBody Person person) {
        return personService.savePerson(person);
    }
}
