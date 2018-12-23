package oop.g8.generator.relation.time;

import oop.g8.model.entity.Person;
import oop.g8.model.entity.Time;
import oop.g8.model.relation.time.T2P;

public class T2PG {
	public static T2P generateT2P(Time t, Person p, String realtionName) {
		return new T2P(realtionName, t, p);
	}
}
