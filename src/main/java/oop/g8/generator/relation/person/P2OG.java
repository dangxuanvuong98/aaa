package oop.g8.generator.relation.person;

import java.util.Date;

import oop.g8.model.entity.Organization;
import oop.g8.model.entity.Person;
import oop.g8.model.relation.person.P2O;

public class P2OG {
	public static P2O generateP2O(Person p, Organization o, String relationName, String link, Date date) {
		return new P2O(relationName, link, date,  p, o);
	}
}
