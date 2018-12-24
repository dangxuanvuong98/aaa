package oop.g8.repository.relation.person;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.person.P2E;
@Repository

public interface P2ER extends Neo4jRepository<P2E, Long>  {

	List<P2E> findByEvent_NameAndType(String event, String string);

	List<P2E> findByPerson_NameAndType(String person, String string);

}
