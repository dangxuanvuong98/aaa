package oop.g8.repository.relation.location;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Event;
import oop.g8.model.relation.location.L2E;
import oop.g8.model.relation.location.L2P;

@Repository
public interface L2PR  extends Neo4jRepository<L2P, Long>{
	
	List<Event> findTop20OrderByNeo4jId();

	List<L2P> findByLocation_NameAndPerson_Name(String name1, String name2);

	List<L2P> findByLocation_NameAndType(String name, String type);
}
