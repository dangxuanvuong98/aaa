package oop.g8.generator.relation.event;

import oop.g8.model.entity.Event;
import oop.g8.model.entity.Organization;
import oop.g8.model.relation.event.E2O;

public class E2OG {

	public static E2O generateE2O(Event e, Organization o, String realtionName) {
		return new E2O(realtionName, e, o);
	}
}
