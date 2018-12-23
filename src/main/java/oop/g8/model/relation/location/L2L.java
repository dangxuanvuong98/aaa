package oop.g8.model.relation.location;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import oop.g8.model.entity.Entity;
import oop.g8.model.entity.Location;
import oop.g8.model.entity.Source;
@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class L2L {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Location location;

	@EndNode
	private Location location2;

	public L2L(String type, Location location, Location location2) {
		super();
		this.type = type;
		this.location = location;
		this.location2 = location2;
	}
	
}
