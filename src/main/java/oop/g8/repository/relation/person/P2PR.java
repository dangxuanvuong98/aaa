package oop.g8.repository.relation.person;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.person.P2P;
@Repository

public interface P2PR extends Neo4jRepository<P2P, Long>  {

	List<P2P> findTop20OrderByNeo4jId();
	
	List<P2P> findByPerson_NameAndPerson2_Name(String name1, String name2);
	
	List<P2P> findByPerson_NameAndType(String name, String type);
	
	
}
