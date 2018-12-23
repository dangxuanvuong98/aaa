package oop.g8.model.relation.time;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oop.g8.model.entity.Event;
import oop.g8.model.entity.Time;

@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class T2E {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Time time;

	@EndNode
	private Event event;

	public T2E(String type, Time time, Event event) {
		super();
		this.type = type;
		this.time = time;
		this.event = event;
	}

}
