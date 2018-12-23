package oop.g8.model.relation.person;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import oop.g8.model.entity.Person;

@RelationshipEntity
public class P2P {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Person person;

	@EndNode
	private Person person2;

	public P2P() {
		super();
	}

	public P2P(String type, Person person, Person person2) {
		super();
		this.type = type;
		this.person = person;
		this.person2 = person2;
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

	public Person getPerson2() {
		return person2;
	}

	public void setPerson2(Person person2) {
		this.person2 = person2;
	}

	@Override
	public String toString() {
		return "P2P [neo4jId=" + neo4jId + ", type=" + type + ", person=" + person + ", person2=" + person2 + "]";
	}

}
