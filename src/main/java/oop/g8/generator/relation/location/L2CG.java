package oop.g8.generator.relation.location;

import java.util.Date;

import org.springframework.stereotype.Component;

import oop.g8.model.entity.Country;
import oop.g8.model.entity.Location;
import oop.g8.model.relation.location.L2C;

@Component
public class L2CG {
	public static L2C generateL2C(Location l, Country c, String relationName, String link, Date date) {
		return new L2C(relationName, link, date,  l, c);
	}
	
}
