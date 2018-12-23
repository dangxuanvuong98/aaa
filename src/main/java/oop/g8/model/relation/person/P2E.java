package oop.g8.model.relation.person;

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
import oop.g8.model.entity.Person;

@RelationshipEntity
@Data @ToString(callSuper=true, includeFieldNames=true)
@NoArgsConstructor
@AllArgsConstructor
public class P2E {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	private String link;

	private Date date;

	@StartNode
	private Person person;

	@EndNode
	private Event event;

	public P2E(String type, String link, Date date, Person person, Event event) {
		super();
		this.type = type;
		this.link = link;
		this.date = date;
		this.person = person;
		this.event = event;
	}


}
