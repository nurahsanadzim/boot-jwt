package com.example.jwt.repository;
import com.example.jwt.entity.Person;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByUsername(String username);
}
