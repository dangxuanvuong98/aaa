package oop.g8.model.relation.location;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oop.g8.model.entity.Country;
import oop.g8.model.entity.Location;

@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class L2C {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Location location;

	@EndNode
	private Country country;


	public L2C(String type, Location location, Country country) {
		super();
		this.type = type;
		this.location = location;
		this.country = country;
	}

}
