package oop.g8.repository.relation.country;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.country.C2C;
@Repository

public interface C2CR extends Neo4jRepository<C2C, Long> {

	List<C2C> findByTypeAndCountry2_Name(String relationship, String country);

}
