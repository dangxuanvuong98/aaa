package oop.g8.repository.relation.location;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.location.L2L;

@Repository
public interface L2LR extends Neo4jRepository<L2L, Long> {

}
