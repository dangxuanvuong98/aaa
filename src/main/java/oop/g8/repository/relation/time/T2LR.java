package oop.g8.repository.relation.time;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.time.T2L;

@Repository
public interface T2LR extends Neo4jRepository<T2L, Long> {

}
