package oop.g8.generator.relation.organization;

import java.util.Date;

import org.springframework.stereotype.Component;

import oop.g8.model.entity.Country;
import oop.g8.model.entity.Organization;
import oop.g8.model.relation.organization.O2C;

@Component
public class O2CG {
	public static O2C generateO2C(Organization o, Country c, String relationName, String link, Date date) {
		return new O2C(relationName, link, date,  o, c);
	}
	
}
