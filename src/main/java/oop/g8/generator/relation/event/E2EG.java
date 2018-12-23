package oop.g8.generator.relation.event;

import java.util.Date;

import oop.g8.model.entity.Event;
import oop.g8.model.relation.event.E2E;

public class E2EG {

	public static E2E generateE2E(Event e1, Event e2, String relationName, String link, Date date) {
		return new E2E(relationName,  link, date, e1, e2);
	}
}
