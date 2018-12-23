package oop.g8.generator.relation.organization;

import oop.g8.model.entity.Organization;
import oop.g8.model.entity.Time;
import oop.g8.model.relation.organization.O2T;

public class O2TG {
	public static O2T generateO2T(Organization o, Time t, String relationName) {
		return new O2T(relationName, o, t);
	}
}
