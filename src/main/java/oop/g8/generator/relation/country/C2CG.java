package oop.g8.generator.relation.country;

import java.util.Date;

import oop.g8.model.entity.Country;
import oop.g8.model.relation.country.C2C;

public class C2CG {
	public static C2C generateC2C(Country c1, Country c2, String relationName, String link, Date date) {
		return new C2C(relationName, link, date, c1, c2);
	}

}
