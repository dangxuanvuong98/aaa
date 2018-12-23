package oop.g8.repository.relation.location;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.location.L2E;

@Repository
public interface L2ER extends Neo4jRepository<L2E, Long> {

}
