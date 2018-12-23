package oop.g8.generator.relation.organization;

import oop.g8.model.entity.Organization;
import oop.g8.model.entity.Person;
import oop.g8.model.relation.organization.O2P;

public class O2PG {
	public static O2P generateO2P(Organization o, Person p, String relationName) {
		return new O2P(relationName, o, p);
	}
}
