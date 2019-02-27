package oop.g8.repository.entity;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Time;

@Repository
public interface TimeRepository extends Neo4jRepository<Time, Long> {

	Page<Time> findAll(Pageable page);

	List<Time> findByMyid(String id);

	List<Time> findByName(String name);

	List<Time> findByDescriptionContaining(String descriptionPattern);
}
