package oop.g8.model.relation.organization;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oop.g8.model.entity.Organization;

@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class O2O {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Organization organization;

	@EndNode
	private Organization organization2;

	public O2O(String type, Organization organization, Organization organization2) {
		super();
		this.type = type;
		this.organization = organization;
		this.organization2 = organization2;
	}

}
