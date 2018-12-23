package oop.g8.repository.relation.person;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.person.P2O;

@Repository

public interface P2OR extends Neo4jRepository<P2O, Long> {
	List<P2O> findTop20OrderByNeo4jId();

	List<P2O> findByPerson_NameAndOrganization_Name(String name1, String name2);

	List<P2O> findByPerson_NameAndType(String name, String type);
}
