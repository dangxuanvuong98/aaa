package oop.g8.generator.relation.event;

import java.util.Date;

import oop.g8.model.entity.Event;
import oop.g8.model.entity.Person;
import oop.g8.model.relation.event.E2P;

public class E2PG {
	public static E2P generateE2P(Event e, Person p, String relationName, String link, Date date) {
		return new E2P(relationName,  link, date, e, p);
	}
}
