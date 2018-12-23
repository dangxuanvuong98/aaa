package oop.g8.generator.relation.country;

import oop.g8.model.entity.Country;
import oop.g8.model.entity.Person;
import oop.g8.model.relation.country.C2P;

public class C2PG {
	public static C2P generateC2P(Country c, Person p, String realtionName) {
		return new C2P(realtionName, c, p);
	}
}
