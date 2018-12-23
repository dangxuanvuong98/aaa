package oop.g8.repository.relation.event;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.event.E2P;

@Repository
public interface E2PR extends Neo4jRepository<E2P, Long> {
	
	Page<E2P> findAll(Pageable page);  

	List<E2P> findByEvent_NameAndPerson_Name(String name1, String name2);

	List<E2P> findByEvent_NameAndType(String name, String type);
}
