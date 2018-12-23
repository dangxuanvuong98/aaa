package oop.g8.model.entity;

import org.neo4j.ogm.annotation.NodeEntity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NodeEntity

@Data @ToString(callSuper=true, includeFieldNames=true)
@NoArgsConstructor
public class Time extends Entity {

}
