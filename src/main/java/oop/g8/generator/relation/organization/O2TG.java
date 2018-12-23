package oop.g8.generator.relation.organization;

import java.util.Date;

import oop.g8.model.entity.Organization;
import oop.g8.model.entity.Time;
import oop.g8.model.relation.organization.O2T;

public class O2TG {
	public static O2T generateO2T(Organization o, Time t, String relationName, String link, Date date) {
		return new O2T(relationName, link, date,  o, t);
	}
}
