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
import lombok.ToString;
import oop.g8.model.entity.Event;
import oop.g8.model.entity.Time;

@RelationshipEntity
@Data @ToString(callSuper=true, includeFieldNames=true)
@NoArgsConstructor
@AllArgsConstructor
public class E2T {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	private String link;

	private Date date;

	@StartNode
	private Event event;

	@EndNode
	private Time time;

	public E2T(String type, String link, Date date, Event event, Time time) {
		super();
		this.type = type;
		this.link = link;
		this.date = date;
		this.event = event;
		this.time = time;
	}

}
