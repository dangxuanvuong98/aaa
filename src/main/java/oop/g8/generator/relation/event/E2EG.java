package oop.g8.generator.relation.event;

import oop.g8.model.entity.Event;
import oop.g8.model.relation.event.E2E;

public class E2EG {

	public static E2E generateE2E(Event e1, Event e2, String realtionName) {
		return new E2E(realtionName, e1, e2);
	}
}
