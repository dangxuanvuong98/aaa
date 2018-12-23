package oop.g8.generator.relation.organization;

import java.util.Date;

import oop.g8.model.entity.Event;
import oop.g8.model.entity.Organization;
import oop.g8.model.relation.organization.O2E;

public class O2EG {

	public static O2E generateO2E(Organization o, Event e, String relationName, String link, Date date) {
		return new O2E(relationName, link, date,  o, e);
	}
}
