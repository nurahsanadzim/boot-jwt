package com.example.crud.service;

import com.example.crud.entity.Person;
import com.example.crud.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    public Optional<Person> getPerson(Long id) {
        return personRepository.findById(id);
    }

    public Iterable<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }
}
