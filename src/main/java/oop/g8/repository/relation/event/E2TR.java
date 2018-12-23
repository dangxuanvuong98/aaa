package oop.g8.repository.relation.event;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.event.E2T;

@Repository
public interface E2TR extends Neo4jRepository<E2T, Long> {

}
