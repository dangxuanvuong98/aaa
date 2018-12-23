package oop.g8.generator.relation.organization;

import oop.g8.model.entity.Organization;
import oop.g8.model.relation.organization.O2O;

public class O2OG {

	public static O2O generateO2O(Organization o1, Organization o2, String relationName) {
		return new O2O(relationName, o1, o2);
	}
}
