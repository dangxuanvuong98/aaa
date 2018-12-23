package oop.g8.model.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 * Đây là lớp Entity, chứa mọi thông tin chung cho các thực thể sau này kế thừa
 * @author Hoang Nam
 * 
 */

/**
 * @author Hoang Nam NodeEntity là của Neo4j --> đánh dấu đây là một nút trong
 *         đồ thị Data --> sinh tự động Getter, Setter NoArgsConstructor -->
 *         sinh contructor không tham số AllArgsConstructor --> sinh constructor
 *         với đầy đủ tham số Id & GeneratedValue --> Id sinh và quản lý tự động
 *         bởi neo4J
 */
@NodeEntity
@Data @ToString(callSuper=true, includeFieldNames=true)
@NoArgsConstructor
@AllArgsConstructor
public class Entity {

	@Id
	@GeneratedValue
	protected Long neo4jId;
	protected String id;
	protected String name;
	protected String description;

}
