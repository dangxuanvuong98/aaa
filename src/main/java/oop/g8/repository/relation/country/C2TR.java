package oop.g8.repository.relation.country;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.country.C2T;
@Repository

public interface C2TR extends Neo4jRepository<C2T, Long>  {

}
