package oop.g8.generator.relation.country;

import java.util.Date;

import oop.g8.model.entity.Country;
import oop.g8.model.entity.Organization;
import oop.g8.model.relation.country.C2O;

public class C2OG {

	public static C2O generateC2O(Country c, Organization o, String relationName, String link, Date date) {
		return new C2O(relationName,  link, date, c, o);
	}
}
