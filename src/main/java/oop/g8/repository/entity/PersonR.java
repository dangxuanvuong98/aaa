package oop.g8.repository.entity;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Person;

@Repository
public interface PersonR extends Neo4jRepository<Person, Long> {	
	
	Page<Person> findAll(Pageable page);
	
	Person findById(String id);

	List<Person> findByName(String name);

	List<Person> findByDescriptionContaining(String descriptionPattern);
	
	List<Person> findByAge(int age);
	
	List<Person> findByGender(boolean gender);
	
	List<Person> findByJob(String job);
}
