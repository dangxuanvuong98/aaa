package oop.g8.repository.relation.organization;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Event;
import oop.g8.model.relation.organization.O2E;
import oop.g8.model.relation.person.P2C;

@Repository
public interface O2ER extends Neo4jRepository<O2E, Long> {	
	
	List<Event> findTop20OrderByNeo4jId();
	

	List<O2E> findByOrganization_NameAndEvent_Name(String name1, String name2);

	List<O2E> findByOrganization_NameAndType(String name, String type);
}
