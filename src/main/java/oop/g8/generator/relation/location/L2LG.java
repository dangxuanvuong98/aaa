package oop.g8.generator.relation.location;

import oop.g8.model.entity.Location;
import oop.g8.model.relation.location.L2L;

public class L2LG {
	public static L2L generateL2L(Location l1, Location l2, String realtionName) {
		return new L2L(realtionName, l1, l2);
	}
}
