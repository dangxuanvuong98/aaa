package oop.g8.repository.relation.organization;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.organization.O2L;

@Repository
public interface O2LR extends Neo4jRepository<O2L, Long> {	
	
	Page<O2L> findAll(Pageable page);  
	

	List<O2L> findByOrganization_NameAndLocation_Name(String name1, String name2);

	List<O2L> findByOrganization_NameAndType(String name, String type);
}
