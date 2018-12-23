package oop.g8.repository.relation.time;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.time.T2E;

@Repository
public interface T2ER extends Neo4jRepository<T2E, Long> {

}
