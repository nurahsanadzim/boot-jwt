package com.example.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwt.entity.Person;


public interface PersonRepository extends JpaRepository<Person, Long> {
}
