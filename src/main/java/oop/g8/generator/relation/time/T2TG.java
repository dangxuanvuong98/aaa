package oop.g8.generator.relation.time;

import java.util.Date;

import oop.g8.model.entity.Time;
import oop.g8.model.relation.time.T2T;

public class T2TG {
	public static T2T generateT2T(Time t1, Time t2, String relationName, String link, Date date) {
		return new T2T(relationName,  link, date, t1, t2);
	}
}
