package oop.g8.generator.relation.location;

import org.springframework.stereotype.Component;

import oop.g8.model.entity.Country;
import oop.g8.model.entity.Location;
import oop.g8.model.relation.location.L2C;

@Component
public class L2CG {
	public static L2C generateL2C(Location l, Country c, String relationName) {
		return new L2C(relationName, l, c);
	}
	
}
