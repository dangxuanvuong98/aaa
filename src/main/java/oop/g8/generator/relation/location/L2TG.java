package oop.g8.generator.relation.location;

import java.util.Date;

import oop.g8.model.entity.Location;
import oop.g8.model.entity.Time;
import oop.g8.model.relation.location.L2T;

public class L2TG {
	public static L2T generateL2T(Location l, Time t, String relationName, String link, Date date) {
		return new L2T(relationName,  link, date, l, t);
	}
}
