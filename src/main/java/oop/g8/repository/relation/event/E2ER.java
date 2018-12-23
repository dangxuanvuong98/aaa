package oop.g8.repository.relation.event;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.event.E2E;

@Repository
public interface E2ER extends Neo4jRepository<E2E, Long> {

}
