package oop.g8.model.relation.country;

import java.util.Date;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oop.g8.model.entity.Country;
import oop.g8.model.entity.Organization;

@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class C2O {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;
	
	private String link;

	private Date date;

	@StartNode
	private Country country;

	@EndNode
	private Organization organization;

	public C2O(String type, String link, Date date, Country country, Organization organization) {
		super();
		this.type = type;
		this.link = link;
		this.date = date;
		this.country = country;
		this.organization = organization;
	}


}
