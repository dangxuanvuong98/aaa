package oop.g8.generator.relation.person;

import oop.g8.model.entity.Event;
import oop.g8.model.entity.Person;
import oop.g8.model.relation.person.P2E;

public class P2EG {
	public static P2E generateP2E(Person p, Event e, String relationName) {
		return new P2E(relationName, p, e);
	}
}
