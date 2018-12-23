package oop.g8.model.entity;

import java.util.Date;

import org.neo4j.ogm.annotation.NodeEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oop.g8.model.relation.location.P2T;

@NodeEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event extends Entity {

	private Date timeStart;
	private Date timeEnd;
	private String venue;

}
