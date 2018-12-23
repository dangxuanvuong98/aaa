package oop.g8.model.entity;

import java.util.Date;

import org.neo4j.ogm.annotation.NodeEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NodeEntity
@Data @ToString(callSuper=true, includeFieldNames=true)
@NoArgsConstructor
@AllArgsConstructor
public class Event extends Entity {

	private Date timeStart;
	private Date timeEnd;
	private String venue;

}
