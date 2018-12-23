package oop.g8.generator.relation.person;

import java.util.Date;

import oop.g8.model.entity.Person;
import oop.g8.model.relation.person.P2P;

public class P2PG {
	public static P2P generateP2P(Person p1, Person p2, String relationName, String link, Date date) {
		return new P2P(relationName, link, date,  p1, p2);
	}
}
