package oop.g8.repository.relation.person;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Person;
import oop.g8.model.relation.person.P2C;
@Repository

public interface P2CR extends Neo4jRepository<P2C, Long>  {

	P2C findByPerson_Job(String string);

}
