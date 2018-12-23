package oop.g8.repository.entity;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Person;
@Repository
public interface PersonR extends Neo4jRepository<Person, Long>  {

	Person findByName(String string);

	Person findByNameLikeAndAge(String string, int i);

}
