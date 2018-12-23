package oop.g8.generator.relation.time;

import java.util.Date;

import oop.g8.model.entity.Location;
import oop.g8.model.entity.Time;
import oop.g8.model.relation.time.T2L;

public class T2LG {
	public static T2L generateT2L(Time t, Location l, String relationName, String link, Date date) {
		return new T2L(relationName,  link, date, t, l);
	}
}
