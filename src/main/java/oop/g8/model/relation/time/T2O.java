package oop.g8.model.relation.time;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oop.g8.model.entity.Organization;
import oop.g8.model.entity.Time;

@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class T2O {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Time time;

	@EndNode
	private Organization organization;

	public T2O(String type, Time time, Organization organization) {
		super();
		this.type = type;
		this.time = time;
		this.organization = organization;
	}

}
