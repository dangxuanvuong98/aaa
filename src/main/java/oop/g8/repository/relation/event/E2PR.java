package oop.g8.repository.relation.event;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Event;
import oop.g8.model.relation.country.C2O;
import oop.g8.model.relation.event.E2P;

@Repository
public interface E2PR extends Neo4jRepository<E2P, Long> {
	
	List<Event> findTop20OrderByNeo4jId();

	List<E2P> findByEvent_NameAndPerson_Name(String name1, String name2);

	List<E2P> findByEvent_NameAndType(String name, String type);
}
