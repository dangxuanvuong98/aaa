package oop.g8.repository.relation.event;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.event.E2T;

@Repository
public interface E2TR extends Neo4jRepository<E2T, Long> {

	List<E2T> findByTypeAndTime_Name_EndingWith(String string, String year);

}
