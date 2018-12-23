package oop.g8.generator.relation.time;

import oop.g8.model.entity.Location;
import oop.g8.model.entity.Time;
import oop.g8.model.relation.time.T2L;

public class T2LG {
	public static T2L generateT2L(Time t, Location l, String realtionName) {
		return new T2L(realtionName, t, l);
	}
}
