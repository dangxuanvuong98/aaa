package oop.g8.model.entity;

import org.neo4j.ogm.annotation.NodeEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NodeEntity
@Data @ToString(callSuper=true, includeFieldNames=true)
@NoArgsConstructor
@AllArgsConstructor
public class Organization extends Entity {

	private String headquarters;
	private String phone;
	private String email;
	private String chairman;

}
