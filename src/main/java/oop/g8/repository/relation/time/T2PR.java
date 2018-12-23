package oop.g8.repository.relation.time;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.time.T2P;

@Repository
public interface T2PR extends Neo4jRepository<T2P, Long> {
	
	Page<T2P> findAll(Pageable page);  

	List<T2P> findByTime_NameAndPerson_Name(String name1, String name2);

	List<T2P> findByTime_NameAndType(String name, String type);
}
