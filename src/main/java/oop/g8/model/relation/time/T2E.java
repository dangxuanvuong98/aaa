package oop.g8.model.relation.time;

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

	private String link;

	private Date date;

	@StartNode
	private Time time;

	@EndNode
	private Event event;

	public T2E(String type, String link, Date date, Time time, Event event) {
		super();
		this.type = type;
		this.link = link;
		this.date = date;
		this.time = time;
		this.event = event;
	}


}
