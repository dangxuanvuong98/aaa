package oop.g8.model.relation.person;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import oop.g8.model.entity.Country;
import oop.g8.model.entity.Person;

@RelationshipEntity
public class P2C {

	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Person person;

	@EndNode
	private Country country;

	public P2C() {
		super();
	}

	public P2C(String type, Person person, Country country) {
		super();
		this.type = type;
		this.person = person;
		this.country = country;
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

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "P2C [neo4jId=" + neo4jId + ", type=" + type + ", person=" + person + ", country=" + country + "]";
	}

}
