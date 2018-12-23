package oop.g8.repository.relation.country;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.country.C2E;
@Repository

public interface C2ER extends Neo4jRepository<C2E, Long>  {
	
	Page<C2E> findAll(Pageable page);  

	List<C2E> findByCountry_NameAndEvent_Name(String name1, String name2);

	List<C2E> findByCountry_NameAndType(String name, String type);
}
