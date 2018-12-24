package oop.g8.repository.entity;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Organization;

@Repository
public interface OrganizationR extends Neo4jRepository<Organization, Long> {	
	
	Page<Organization> findAll(Pageable page);  
	
	Organization findById(String id);

	List<Organization> findByName(String name);

	List<Organization> findByDescriptionContaining(String descriptionPattern);
	
	List<Organization> findByHeadquarters(String headquarters);
	
	List<Organization> findByPhone(String phone);
	
	List<Organization> findByEmail(String email);
	
	List<Organization> findByChairman(String chairman);
}
