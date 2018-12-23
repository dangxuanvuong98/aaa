package oop.g8.repository.relation.person;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.person.P2O;

@Repository

public interface P2OR extends Neo4jRepository<P2O, Long> {
	Page<P2O> findAll(Pageable page);  

	List<P2O> findByPerson_NameAndOrganization_Name(String name1, String name2);

	List<P2O> findByPerson_NameAndType(String name, String type);
}
