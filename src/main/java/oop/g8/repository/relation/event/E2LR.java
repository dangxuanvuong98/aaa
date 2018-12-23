package oop.g8.repository.relation.event;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.event.E2L;

@Repository
public interface E2LR extends Neo4jRepository<E2L, Long> {
	
	Page<E2L> findAll(Pageable page);  

	List<E2L> findByEvent_NameAndLocation_Name(String name1, String name2);

	List<E2L> findByEvent_NameAndType(String name, String type);
}
