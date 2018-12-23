package oop.g8.generator.relation.location;

import java.util.Date;

import oop.g8.model.entity.Location;
import oop.g8.model.relation.location.L2L;

public class L2LG {
	public static L2L generateL2L(Location l1, Location l2, String relationName, String link, Date date) {
		return new L2L(relationName,  link, date, l1, l2);
	}
}
