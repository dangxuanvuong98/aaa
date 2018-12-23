package oop.g8.generator.relation.location;

import oop.g8.model.entity.Location;
import oop.g8.model.entity.Time;
import oop.g8.model.relation.location.L2T;

public class L2TG {
	public static L2T generateL2T(Location l, Time t, String realtionName) {
		return new L2T(realtionName, l, t);
	}
}
