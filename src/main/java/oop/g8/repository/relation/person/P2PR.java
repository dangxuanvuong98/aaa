package oop.g8.repository.relation.person;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.person.P2P;
@Repository

public interface P2PR extends Neo4jRepository<P2P, Long>  {

	Page<P2P> findAll(Pageable page);  
	
	List<P2P> findByPerson_NameAndPerson2_Name(String name1, String name2);
	
	List<P2P> findByPerson_NameAndType(String name, String type);

	List<P2P> findByPerson2_NameAndType(String person, String string);

	List<P2P> findByPerson2_NameAndTypeLike(String person, String string);
	
	
}
