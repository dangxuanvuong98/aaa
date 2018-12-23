package oop.g8.generator.relation.event;

import java.util.Date;

import org.springframework.stereotype.Component;

import oop.g8.model.entity.Country;
import oop.g8.model.entity.Event;
import oop.g8.model.relation.event.E2C;

@Component
public class E2CG {
	public static E2C generateE2C(Event e, Country c, String relationName, String link, Date date) {
		return new E2C(relationName, link, date,  e, c);
	}
	
}
