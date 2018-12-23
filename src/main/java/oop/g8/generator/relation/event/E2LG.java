package oop.g8.generator.relation.event;

import java.util.Date;

import oop.g8.model.entity.Event;
import oop.g8.model.entity.Location;
import oop.g8.model.relation.event.E2L;

public class E2LG {
	public static E2L generateE2L(Event e, Location l, String relationName, String link, Date date) {
		return new E2L(relationName,  link, date, e, l);
	}
}
