package oop.g8.generator.relation.location;

import java.util.Date;

import oop.g8.model.entity.Event;
import oop.g8.model.entity.Location;
import oop.g8.model.relation.location.L2E;

public class L2EG {

	public static L2E generateL2E(Location l, Event e, String relationName, String link, Date date) {
		return new L2E(relationName, link, date,  l, e);
	}
}
