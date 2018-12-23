package oop.g8.model.entity;

import org.neo4j.ogm.annotation.NodeEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NodeEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country extends Entity {

	private String capital;

}
