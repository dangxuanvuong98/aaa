package oop.g8.generator.relation.location;

import java.util.Date;

import oop.g8.model.entity.Location;
import oop.g8.model.entity.Person;
import oop.g8.model.relation.location.L2P;

public class L2PG {
	public static L2P generateL2P(Location l, Person p, String relationName, String link, Date date) {
		return new L2P(relationName,  link, date, l, p);
	}
}
