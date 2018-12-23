package oop.g8.generator.relation.location;

import oop.g8.model.entity.Location;
import oop.g8.model.entity.Organization;
import oop.g8.model.relation.location.L2O;

public class L2OG {

	public static L2O generateL2O(Location l, Organization o, String realtionName) {
		return new L2O(realtionName, l, o);
	}
}
