package oop.g8.model.relation.organization;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oop.g8.model.entity.Entity;
import oop.g8.model.entity.Event;
import oop.g8.model.entity.Organization;
import oop.g8.model.entity.Source;
@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class O2E {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Organization organization;

	@EndNode
	private Event event;
}
