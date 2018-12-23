package oop.g8.generator.relation.time;

import oop.g8.model.entity.Time;
import oop.g8.model.relation.time.T2T;

public class T2TG {
	public static T2T generateT2T(Time t1, Time t2, String realtionName) {
		return new T2T(realtionName, t1, t2);
	}
}
