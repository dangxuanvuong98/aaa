package oop.g8.repository.relation.time;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import oop.g8.model.relation.time.T2T;

public interface T2TR extends Neo4jRepository<T2T, Long> {
	
	Page<T2T> findAll(Pageable page);  

	List<T2T> findByTime_NameAndTime_Name(String name1, String name2);

	List<T2T> findByTime_NameAndType(String name, String type);
}
