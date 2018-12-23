package oop.g8.generator.relation.location;

import oop.g8.model.entity.Location;
import oop.g8.model.entity.Person;
import oop.g8.model.relation.location.L2P;

public class L2PG {
	public static L2P generateL2P(Location l, Person p, String realtionName) {
		return new L2P(realtionName, l, p);
	}
}
