package oop.g8.repository.entity;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Event;
import oop.g8.model.entity.Time;

@Repository
public interface TimeR extends Neo4jRepository<Time, Long> {	
	
	List<Event> findTop20OrderByNeo4jId();
	
	Time findById(String id);

	List<Time> findByName(String name);

	List<Time> findByDescriptionContaining(String descriptionPattern);
}
