package oop.g8.repository.relation.country;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Event;
import oop.g8.model.relation.country.C2E;
import oop.g8.model.relation.country.C2O;
@Repository

public interface C2OR  extends Neo4jRepository<C2O, Long> {
	
	List<Event> findTop20OrderByNeo4jId();

	List<C2O> findByCountry_NameAndOrganization_Name(String name1, String name2);

	List<C2O> findByCountry_NameAndType(String name, String type);
}
