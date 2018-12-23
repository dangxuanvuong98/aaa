package oop.g8.repository.entity;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Country;

/**
 * Đây là magic của Spring Data Neo4j không cần viết code, cũng có sẵn các hàm
 * để dùng ví dụ CRUD: cr.save(myobject); cr.findById(id); cr.save(myobject);
 * --> cả save và update đều gọi hàm save(); cr.delete(myobject);
 * 
 * đặc biệt hơn: + để tìm những contry có tên là "abc" thì chỉ cần viết 1 nguyên
 * mẫu hàm dạng: List<Country> findByName(String name); --> Vậy thôi --> sau này
 * cứ gọi hàm này ra mà dùng tương tự với các thuộc tính khác
 * 
 * + nếu muốn tìm theo tên và capital thì viết: List<Country>
 * findByNameAndCapital(String name, String Capital) --> thế là oke ..... vân
 * vân
 * 
 * @author Hoang Nam
 *
 */
@Repository
public interface CountryR extends Neo4jRepository<Country, Long> {

	Page<Country> findAll(Pageable page);  
	
	Country findById(String id);
	
	List<Country> findByName(String name);

	List<Country> findByDescriptionContaining(String descriptionPattern);
	
	List<Country> findByCapital(String capital);
}
