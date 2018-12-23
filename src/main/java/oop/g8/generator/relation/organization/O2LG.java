package oop.g8.generator.relation.organization;

import java.util.Date;

import oop.g8.model.entity.Location;
import oop.g8.model.entity.Organization;
import oop.g8.model.relation.organization.O2L;

public class O2LG {
	public static O2L generateO2L(Organization o, Location l, String relationName, String link, Date date) {
		return new O2L(relationName, link, date,  o, l);
	}
}
