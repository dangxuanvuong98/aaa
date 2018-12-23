package oop.g8.repository.relation.country;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.country.C2O;
@Repository

public interface C2OR  extends Neo4jRepository<C2O, Long> {

}
