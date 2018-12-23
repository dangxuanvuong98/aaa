package oop.g8.model.relation.person;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import oop.g8.model.entity.Organization;
import oop.g8.model.entity.Person;

@RelationshipEntity
public class P2O {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Person person;

	@EndNode
	private Organization organization;

	public P2O() {
		super();
	}

	public P2O(String type, Person person, Organization organization) {
		super();
		this.type = type;
		this.person = person;
		this.organization = organization;
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

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	@Override
	public String toString() {
		return "P2O [neo4jId=" + neo4jId + ", type=" + type + ", person=" + person + ", organization=" + organization
				+ "]";
	}

}
