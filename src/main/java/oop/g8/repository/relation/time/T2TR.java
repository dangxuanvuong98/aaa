package oop.g8.repository.relation.time;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import oop.g8.model.relation.time.T2T;

public interface T2TR extends Neo4jRepository<T2T, Long> {

}
