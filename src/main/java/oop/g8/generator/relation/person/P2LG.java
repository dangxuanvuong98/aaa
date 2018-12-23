package oop.g8.generator.relation.person;

import oop.g8.model.entity.Location;
import oop.g8.model.entity.Person;
import oop.g8.model.relation.person.P2L;

public class P2LG {
	public static P2L generateP2L(Person p, Location l, String relationName) {
		return new P2L(relationName, p, l);
	}
}
