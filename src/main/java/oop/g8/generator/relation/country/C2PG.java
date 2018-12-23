package oop.g8.generator.relation.country;

import java.util.Date;

import oop.g8.model.entity.Country;
import oop.g8.model.entity.Person;
import oop.g8.model.relation.country.C2P;

public class C2PG {
	public static C2P generateC2P(Country c, Person p, String relationName, String link, Date date) {
		return new C2P(relationName,  link, date, c, p);
	}
}
