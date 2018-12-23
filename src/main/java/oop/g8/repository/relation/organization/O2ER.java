package oop.g8.repository.relation.organization;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.organization.O2E;

@Repository
public interface O2ER extends Neo4jRepository<O2E, Long> {

}
