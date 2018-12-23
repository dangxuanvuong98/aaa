package oop.g8.model.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oop.g8.model.relation.location.P2T;

@NodeEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Entity {

	@Id
	@GeneratedValue
	protected Long neo4jId;
	protected String id;
	protected String name;
	protected String description;
	protected Source source;


	public Entity(String id, String name, String description, Source source) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.source = source;
	}

}
