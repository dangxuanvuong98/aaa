package oop.g8.repository.relation.time;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import oop.g8.model.entity.Event;
import oop.g8.model.relation.time.T2T;

public interface T2TR extends Neo4jRepository<T2T, Long> {
	
	List<Event> findTop20OrderByNeo4jId();

	List<T2T> findByTime_NameAndTime_Name(String name1, String name2);

	List<T2T> findByTime_NameAndType(String name, String type);
}
