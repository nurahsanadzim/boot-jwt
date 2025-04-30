package com.example.crud.repository;

import com.example.crud.entity.Person;
import org.springframework.data.repository.CrudRepository;


public interface PersonRepository extends CrudRepository<Person, Long> {
}
