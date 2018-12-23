package oop.g8.generator.relation.location;

import oop.g8.model.entity.Event;
import oop.g8.model.entity.Location;
import oop.g8.model.relation.location.L2E;

public class L2EG {

	public static L2E generateL2E(Location l, Event e, String relationName) {
		return new L2E(relationName, l, e);
	}
}
