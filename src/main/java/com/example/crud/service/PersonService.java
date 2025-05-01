package com.example.crud.service;

import com.example.crud.entity.Person;
import com.example.crud.repository.PersonRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import jakarta.persistence.EntityExistsException;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person savePerson(Person person) {
        try {
            return personRepository.save(person);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Username or email already exists", e);
        } catch (EntityExistsException e) {
            throw new RuntimeException("Person already exists", e);
        }
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
