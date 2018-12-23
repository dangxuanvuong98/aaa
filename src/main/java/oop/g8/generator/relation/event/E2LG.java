package oop.g8.generator.relation.event;

import oop.g8.model.entity.Event;
import oop.g8.model.entity.Location;
import oop.g8.model.relation.event.E2L;

public class E2LG {
	public static E2L generateE2L(Event e, Location l, String realtionName) {
		return new E2L(realtionName, e, l);
	}
}
