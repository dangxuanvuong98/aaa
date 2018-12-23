package oop.g8.model.relation.event;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oop.g8.model.entity.Country;
import oop.g8.model.entity.Event;

@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class E2C {

	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Event event;

	@EndNode
	private Country country;

	public E2C(String type, Event event, Country country) {
		super();
		this.type = type;
		this.event = event;
		this.country = country;
	}

}
