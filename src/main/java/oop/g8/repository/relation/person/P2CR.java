package oop.g8.repository.relation.person;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.person.P2C;
import oop.g8.model.relation.person.P2P;

@Repository

public interface P2CR extends Neo4jRepository<P2C, Long> {

	P2C findByPerson_Job(String string);
	
	List<P2P> findTop20OrderByNeo4jId();

	List<P2C> findByPerson_NameAndCountry_Name(String name1, String name2);

	List<P2C> findByPerson_NameAndType(String name, String type);
}
