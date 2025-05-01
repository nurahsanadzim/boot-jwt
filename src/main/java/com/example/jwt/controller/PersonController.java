package com.example.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.jwt.entity.Person;
import com.example.jwt.service.PersonService;

import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    @GetMapping("/{id}")
    public Optional<Person> getPerson(@PathVariable Long id) {
        return personService.getPerson(id);
    }

    @GetMapping
    public Iterable<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
    }
}