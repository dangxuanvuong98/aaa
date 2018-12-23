package oop.g8.generator.relation.event;

import oop.g8.model.entity.Event;
import oop.g8.model.entity.Person;
import oop.g8.model.relation.event.E2P;

public class E2PG {
	public static E2P generateE2P(Event e, Person p, String realtionName) {
		return new E2P(realtionName, e, p);
	}
}
