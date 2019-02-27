package oop.g8.repository.entity;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Location;

@Repository
public interface LocationRepository extends Neo4jRepository<Location, Long> {	
	
	Page<Location> findAll(Pageable page);  
	
	List<Location> findByMyid(String id);

	List<Location> findByName(String name);

	List<Location> findByDescriptionContaining(String descriptionPattern);

	List<Location> findByCountry(String country);

}
