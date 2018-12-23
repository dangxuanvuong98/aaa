package oop.g8.repository.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Event;

@Repository
public interface EventR extends Neo4jRepository<Event, Long> {
	
	List<Event> findTop20OrderByNeo4jId();
	
	Event findById(String id);

	List<Event> findByName(String name);

	List<Event> findByDescriptionContaining(String descriptionPattern);
	
	List<Event> findByTimeStart(Date timeStart);
	
	List<Event> findByTimeEnd(Date timeEnd);
	
	List<Event> findByTimeStartAndTimeEnd(Date timeStart, Date timeEnd);
	
	List<Event> findByVenue(String venue);
}
