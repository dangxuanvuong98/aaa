package oop.g8.generator.relation.organization;

import oop.g8.model.entity.Location;
import oop.g8.model.entity.Organization;
import oop.g8.model.relation.organization.O2L;

public class O2LG {
	public static O2L generateO2L(Organization o, Location l, String relationName) {
		return new O2L(relationName, o, l);
	}
}
