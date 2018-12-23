package oop.g8.model.relation.event;

import java.util.Date;

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
public class E2L {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	private String link;

	private Date date;

	@StartNode
	private Event event;

	@EndNode
	private Location location;

	public E2L(String type, String link, Date date, Event event, Location location) {
		super();
		this.type = type;
		this.link = link;
		this.date = date;
		this.event = event;
		this.location = location;
	}



}
