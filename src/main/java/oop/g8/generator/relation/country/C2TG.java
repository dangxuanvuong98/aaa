package oop.g8.generator.relation.country;

import oop.g8.model.entity.Country;
import oop.g8.model.entity.Time;
import oop.g8.model.relation.country.C2T;

public class C2TG {
	public static C2T generateC2T(Country c, Time t, String realtionName) {
		return new C2T(realtionName, c, t);
	}
}
