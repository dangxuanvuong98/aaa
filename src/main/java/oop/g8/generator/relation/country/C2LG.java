package oop.g8.generator.relation.country;

import oop.g8.model.entity.Country;
import oop.g8.model.entity.Location;
import oop.g8.model.relation.country.C2L;

public class C2LG {
	public static C2L generateC2L(Country c, Location l, String realtionName) {
		return new C2L(realtionName, c, l);
	}
}
