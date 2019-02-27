package oop.g8.repository.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Event;

@Repository
public interface EventRepository extends Neo4jRepository<Event, Long> {
	
	Page<Event> findAll(Pageable page);  
	
	List<Event> findByMyid(String id);

	List<Event> findByName(String name);

	List<Event> findByDescriptionContaining(String descriptionPattern);
	
	List<Event> findByTimeStart(Date timeStart);
	
	List<Event> findByTimeEnd(Date timeEnd);
	
	List<Event> findByTimeStartAndTimeEnd(Date timeStart, Date timeEnd);
	
	List<Event> findByVenue(String venue);
}
