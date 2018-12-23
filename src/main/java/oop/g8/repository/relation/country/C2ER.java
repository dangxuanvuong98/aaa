package oop.g8.repository.relation.country;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.country.C2E;
@Repository

public interface C2ER extends Neo4jRepository<C2E, Long>  {

}
