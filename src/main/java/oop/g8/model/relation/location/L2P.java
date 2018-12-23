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
import oop.g8.model.entity.Location;
import oop.g8.model.entity.Person;
@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class L2P {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	private String link;

	private Date date;

	@StartNode
	private Location location;

	@EndNode
	private Person person;

	public L2P(String type, String link, Date date, Location location, Person person) {
		super();
		this.type = type;
		this.link = link;
		this.date = date;
		this.location = location;
		this.person = person;
	}

	
}
