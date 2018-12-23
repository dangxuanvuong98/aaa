package oop.g8.model.relation.person;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import oop.g8.model.entity.Event;
import oop.g8.model.entity.Person;

@RelationshipEntity
public class P2E {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Person person;

	@EndNode
	private Event event;

	public P2E() {
		super();
	}

	public P2E(String type, Person person, Event event) {
		super();
		this.type = type;
		this.person = person;
		this.event = event;
	}

	public Long getNeo4jId() {
		return neo4jId;
	}

	public void setNeo4jId(Long neo4jId) {
		this.neo4jId = neo4jId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return "P2E [neo4jId=" + neo4jId + ", type=" + type + ", person=" + person + ", event=" + event + "]";
	}

}
