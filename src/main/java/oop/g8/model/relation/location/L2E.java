package oop.g8.model.relation.location;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oop.g8.model.entity.Event;
import oop.g8.model.entity.Location;

@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class L2E {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Location location;

	@EndNode
	private Event event;

	public L2E(String type, Location location, Event event) {
		super();
		this.type = type;
		this.location = location;
		this.event = event;
	}

}
