package oop.g8.generator.relation.country;

import java.util.Date;

import oop.g8.model.entity.Country;
import oop.g8.model.entity.Location;
import oop.g8.model.relation.country.C2L;

public class C2LG {
	public static C2L generateC2L(Country c, Location l, String relationName, String link, Date date) {
		return new C2L(relationName,  link, date, c, l);
	}
}
