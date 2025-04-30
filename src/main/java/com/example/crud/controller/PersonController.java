package com.example.crud.controller;

import com.example.crud.entity.Person;
import com.example.crud.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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