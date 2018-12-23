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
import oop.g8.model.entity.Entity;
import oop.g8.model.entity.Organization;
import oop.g8.model.entity.Source;

@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class C2O {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Country country;

	@EndNode
	private Organization organization;

	public C2O(String type, Country country, Organization organization) {
		super();
		this.type = type;
		this.country = country;
		this.organization = organization;
	}

}
