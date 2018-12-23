package oop.g8.model.relation.person;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import oop.g8.model.entity.Location;
import oop.g8.model.entity.Person;

@RelationshipEntity
public class P2L {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Person person;

	@EndNode
	private Location location;

	public P2L() {
		super();
	}

	public P2L(String type, Person person, Location location) {
		super();
		this.type = type;
		this.person = person;
		this.location = location;
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

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "P2L [neo4jId=" + neo4jId + ", type=" + type + ", person=" + person + ", location=" + location + "]";
	}

}
