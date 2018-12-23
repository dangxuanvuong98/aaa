package oop.g8.generator.relation.location;

import java.util.Date;

import oop.g8.model.entity.Location;
import oop.g8.model.entity.Organization;
import oop.g8.model.relation.location.L2O;

public class L2OG {

	public static L2O generateL2O(Location l, Organization o, String relationName, String link, Date date) {
		return new L2O(relationName,  link, date, l, o);
	}
}
