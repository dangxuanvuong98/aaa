package oop.g8.generator.relation.organization;

import java.util.Date;

import oop.g8.model.entity.Organization;
import oop.g8.model.relation.organization.O2O;

public class O2OG {

	public static O2O generateO2O(Organization o1, Organization o2, String relationName, String link, Date date) {
		return new O2O(relationName, link, date,  o1, o2);
	}
}
