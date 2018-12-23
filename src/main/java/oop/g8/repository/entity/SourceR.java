package oop.g8.repository.entity;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import oop.g8.model.entity.Source;

public interface SourceR extends Neo4jRepository<Source, Long> {

}
