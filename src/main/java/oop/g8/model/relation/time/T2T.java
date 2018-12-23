package oop.g8.model.relation.time;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oop.g8.model.entity.Time;

@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class T2T {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Time time;

	@EndNode
	private Time time2;

	public T2T(String type, Time time, Time time2) {
		super();
		this.type = type;
		this.time = time;
		this.time2 = time2;
	}
	
}
