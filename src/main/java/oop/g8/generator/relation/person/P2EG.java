package oop.g8.generator.relation.person;

import java.util.Date;

import oop.g8.model.entity.Event;
import oop.g8.model.entity.Person;
import oop.g8.model.relation.person.P2E;

public class P2EG {
	public static P2E generateP2E(Person p, Event e, String relationName, String link, Date date) {
		return new P2E(relationName, link, date,  p, e);
	}
}
