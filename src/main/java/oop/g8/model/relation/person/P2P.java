package oop.g8.model.relation.person;

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
import oop.g8.model.relation.country.C2C;

@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class P2P {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Person person;

	@EndNode
	private Person person2;


	public P2P(String type, Person person, Person person2) {
		super();
		this.type = type;
		this.person = person;
		this.person2 = person2;
	}


}
