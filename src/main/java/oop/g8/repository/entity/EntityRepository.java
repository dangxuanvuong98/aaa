package oop.g8.repository.entity;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Entity;

/*
 *
 */
@Repository
public interface EntityRepository extends Neo4jRepository<Entity, Long> {
	
	Page<Entity> findAll(Pageable page);
	
	List<Entity> findByMyid(String id);
	
	List<Entity> findByName(String name);
	
	List<Entity> findByDescriptionContaining(String descriptionPattern);
}
