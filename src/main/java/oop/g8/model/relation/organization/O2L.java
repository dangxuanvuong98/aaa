package oop.g8.model.relation.organization;

import java.util.Date;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oop.g8.model.entity.Location;
import oop.g8.model.entity.Organization;

@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class O2L {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	private String link;

	private Date date;

	@StartNode
	private Organization organization;

	@EndNode
	private Location location;

	public O2L(String type, String link, Date date, Organization organization, Location location) {
		super();
		this.type = type;
		this.link = link;
		this.date = date;
		this.organization = organization;
		this.location = location;
	}


}
