package oop.g8.generator.relation.time;

import oop.g8.model.entity.Organization;
import oop.g8.model.entity.Time;
import oop.g8.model.relation.time.T2O;

public class T2OG {

	public static T2O generateT2O(Time t, Organization o, String realtionName) {
		return new T2O(realtionName, t, o);
	}
}
