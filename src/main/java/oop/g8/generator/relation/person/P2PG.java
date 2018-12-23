package oop.g8.generator.relation.person;

import oop.g8.model.entity.Person;
import oop.g8.model.relation.person.P2P;

public class P2PG {
	public static P2P generateP2P(Person p1, Person p2, String relationName) {
		return new P2P(relationName, p1, p2);
	}
}
