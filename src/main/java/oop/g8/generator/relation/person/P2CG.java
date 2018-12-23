package oop.g8.generator.relation.person;

import oop.g8.model.entity.Country;
import oop.g8.model.entity.Person;
import oop.g8.model.relation.person.P2C;

public class P2CG {
	public static P2C generateP2C(Person p, Country c, String relationName) {
		return new P2C(relationName, p, c);
	}
}
