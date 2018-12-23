package oop.g8.repository.entity;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Organization;

@Repository
public interface OrganiztionR extends Neo4jRepository<Organization, Long> {

}
