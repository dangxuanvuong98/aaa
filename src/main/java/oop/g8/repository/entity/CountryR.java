package oop.g8.repository.entity;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Country;
@Repository

public interface CountryR extends Neo4jRepository<Country, Long>  {

}
