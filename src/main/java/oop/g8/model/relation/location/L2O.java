package oop.g8.model.relation.location;

import java.util.Date;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import oop.g8.model.entity.Location;
import oop.g8.model.entity.Organization;
@RelationshipEntity
@Data @ToString(callSuper=true, includeFieldNames=true)
@NoArgsConstructor
@AllArgsConstructor
public class L2O {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	private String link;

	private Date date;

	@StartNode
	private Location location;

	@EndNode
	private Organization organization;

	public L2O(String type, String link, Date date, Location location, Organization organization) {
		super();
		this.type = type;
		this.link = link;
		this.date = date;
		this.location = location;
		this.organization = organization;
	}

	
}
