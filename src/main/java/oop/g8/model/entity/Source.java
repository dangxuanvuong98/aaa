//package oop.g8.model.entity;
//
//import java.util.Date;
//
//import org.neo4j.ogm.annotation.GeneratedValue;
//import org.neo4j.ogm.annotation.Id;
//import org.neo4j.ogm.annotation.NodeEntity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import oop.g8.model.relation.location.L2T;
//
//@NodeEntity
//@Data @ToString(callSuper=true, includeFieldNames=true)
//@NoArgsConstructor
//@AllArgsConstructor
//public class Source {
//
//	@Id
//	@GeneratedValue
//	private Long neo4jId;
//	private String link;
//	private Date date;
//
//	public Source(String link, Date date) {
//		super();
//		this.link = link;
//		this.date = date;
//	}
//
//}
