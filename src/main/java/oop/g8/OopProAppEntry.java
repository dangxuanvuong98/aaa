package oop.g8;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import oop.g8.model.entity.Country;
import oop.g8.model.entity.Person;
import oop.g8.model.entity.Source;
import oop.g8.model.relation.person.P2C;
import oop.g8.repository.entity.CountryR;
import oop.g8.repository.entity.PersonR;
import oop.g8.repository.entity.SourceR;
import oop.g8.repository.relation.person.P2CR;

@Component
public class OopProAppEntry implements CommandLineRunner {

	@Autowired
	private PersonR pr;

	@Autowired
	private CountryR cr;

	@Autowired
	SourceR sr;

	@Autowired
	private P2CR pcr;

	@Override
	public void run(String... args) throws Exception {

		Source s = new Source("some link", new Date());
		sr.save(s);
		System.out.println("save s success");

		Person p = new Person(20, true, "student");
		p.setId("Person001");
		p.setName("Hoang Nam");
		p.setDescription("no des");
		p.setSource(s);
		pr.save(p);
		System.out.println("save p success");

		Country c = new Country("Ha Noi");
		c.setId("Country001");
		c.setName("VietNam");
		c.setDescription("no des");
		c.setSource(s);
		cr.save(c);
		System.out.println("save c success");

		P2C pc = new P2C("live in", p, c);
		pcr.save(pc);
		System.out.println("save pc success");

	}

}
