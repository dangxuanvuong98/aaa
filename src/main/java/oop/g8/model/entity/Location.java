package oop.g8.model.entity;

import org.neo4j.ogm.annotation.NodeEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oop.g8.model.relation.location.P2T;

@NodeEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location extends Entity {
	private String country;

}
