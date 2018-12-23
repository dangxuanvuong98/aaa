package oop.g8.repository.entity;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Event;
import oop.g8.model.entity.Location;

@Repository
public interface LocationR extends Neo4jRepository<Location, Long> {	
	
	List<Event> findTop20OrderByNeo4jId();
	
	Location findById(String id);

	List<Location> findByName(String name);

	List<Location> findByDescriptionContaining(String descriptionPattern);

	List<Location> findByCountry(String country);

}
