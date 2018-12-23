package oop.g8.generator.relation.country;

import oop.g8.model.entity.Country;
import oop.g8.model.entity.Organization;
import oop.g8.model.relation.country.C2O;

public class C2OG {

	public static C2O generateC2O(Country c, Organization o, String realtionName) {
		return new C2O(realtionName, c, o);
	}
}
