package oop.g8.repository.relation.person;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.person.P2O;
@Repository

public interface P2OR extends Neo4jRepository<P2O, Long>  {

}
