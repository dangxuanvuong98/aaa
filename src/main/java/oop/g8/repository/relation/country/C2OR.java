package oop.g8.repository.relation.country;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.country.C2O;
@Repository

public interface C2OR  extends Neo4jRepository<C2O, Long> {
	
	Page<C2O> findAll(Pageable page);  

	List<C2O> findByCountry_NameAndOrganization_Name(String name1, String name2);

	List<C2O> findByCountry_NameAndType(String name, String type);
}
