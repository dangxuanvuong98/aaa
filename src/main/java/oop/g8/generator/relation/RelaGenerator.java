package oop.g8.generator.relation;

import java.util.Date;

import org.springframework.stereotype.Component;

import oop.g8.model.entity.Entity;
import oop.g8.model.relation.Rela;

@Component
public class RelaGenerator {

	public static Rela generateRela(String type, String link, Date date, Entity e1, Entity e2) {
		return new Rela(type, link, date, e1, e2);
	}

}
