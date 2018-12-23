package oop.g8.generator.relation.person;

import oop.g8.model.entity.Person;
import oop.g8.model.entity.Time;
import oop.g8.model.relation.person.P2T;

public class P2TG {
	public static P2T generateP2T(Person p, Time t, String relationName) {
		return new P2T(relationName, p, t);
	}
}
