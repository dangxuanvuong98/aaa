package oop.g8.repository.relation.location;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.location.L2C;

@Repository
public interface L2CR extends Neo4jRepository<L2C, Long> {

}
