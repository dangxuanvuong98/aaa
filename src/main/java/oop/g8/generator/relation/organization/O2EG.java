package oop.g8.generator.relation.organization;

import oop.g8.model.entity.Event;
import oop.g8.model.entity.Organization;
import oop.g8.model.relation.organization.O2E;

public class O2EG {

	public static O2E generateO2E(Organization o, Event e, String relationName) {
		return new O2E(relationName, o, e);
	}
}
