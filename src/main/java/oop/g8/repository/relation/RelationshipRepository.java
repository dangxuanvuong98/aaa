package oop.g8.repository.relation;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.*;
import oop.g8.model.relation.Relationship;

@Repository
public interface RelationshipRepository<E1 extends Entity, E2 extends Entity> extends Neo4jRepository<Relationship<E1, E2>, Long> {

	Page<Relationship<E1, E2>> findAll(Pageable page); 

	List<Relationship<E1, E2>> findByType(String relationship, String country);

	List<Relationship<E1, E2>> findByTypeAndEntity2_Name(String relationship, String country); 
	
	List<Relationship<E1, E2>> findByEntity1_NameAndEntity2_Name(String name1, String name2);
	
	List<Relationship<E1, E2>> findByEntity1_NameAndType(String name, String type);
	
	List<Relationship<E1, E2>> findByEntity1_Name(String name);
	
	List<Relationship<E1, E2>> findByEntity2_Name(String name);
	
	List<Relationship<E1, Time>> findByEntity2_Name_EndingWith(String string, String year);
	
	List<Relationship<E1, E2>> findByTypeLikeAndEntity2_Name(String string, String name);
	
	List<Relationship<E1, E2>> findByEntity1_NameAndTypeLike(String name, String string);
	
-

}
