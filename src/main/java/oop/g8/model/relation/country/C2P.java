package oop.g8.model.relation.country;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oop.g8.model.entity.Country;
import oop.g8.model.entity.Person;

@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class C2P {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Country country;

	@EndNode
	private Person person;

	public C2P(String type, Country country, Person person) {
		super();
		this.type = type;
		this.country = country;
		this.person = person;
	}

}
