package oop.g8.repository.relation.location;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.location.L2T;

@Repository
public interface L2TR extends Neo4jRepository<L2T, Long> {

}
