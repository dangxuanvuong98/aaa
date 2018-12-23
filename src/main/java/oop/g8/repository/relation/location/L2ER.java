package oop.g8.repository.relation.location;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Event;
import oop.g8.model.relation.location.L2E;
import oop.g8.model.relation.organization.O2L;

@Repository
public interface L2ER extends Neo4jRepository<L2E, Long> {	
	
	List<Event> findTop20OrderByNeo4jId();

	List<L2E> findByLocation_NameAndEvent_Name(String name1, String name2);

	List<L2E> findByLocation_NameAndType(String name, String type);
}
