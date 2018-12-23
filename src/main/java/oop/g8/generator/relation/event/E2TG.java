package oop.g8.generator.relation.event;

import oop.g8.model.entity.Event;
import oop.g8.model.entity.Time;
import oop.g8.model.relation.event.E2T;

public class E2TG {
	public static E2T generateE2T(Event e, Time t, String realtionName) {
		return new E2T(realtionName, e, t);
	}
}
