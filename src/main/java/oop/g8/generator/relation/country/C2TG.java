package oop.g8.generator.relation.country;

import java.util.Date;

import oop.g8.model.entity.Country;
import oop.g8.model.entity.Time;
import oop.g8.model.relation.country.C2T;

public class C2TG {
	public static C2T generateC2T(Country c, Time t, String relationName, String link, Date date) {
		return new C2T(relationName,  link, date, c, t);
	}
}
