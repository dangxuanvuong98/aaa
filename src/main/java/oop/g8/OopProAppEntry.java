package oop.g8;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import oop.g8.model.entity.Country;
import oop.g8.model.entity.Person;
import oop.g8.model.entity.Source;
import oop.g8.model.relation.location.L2C;
import oop.g8.model.relation.person.P2C;
import oop.g8.repository.entity.PersonR;
import oop.g8.repository.relation.person.P2CR;

@Component
public class OopProAppEntry implements CommandLineRunner {

	@Autowired
	private PersonR pr;

	@Autowired
	private P2CR pcr;

	@Override
	public void run(String... args) throws Exception {

		Person p = new Person(20, true, "student");
		p.setName("Hoang Nam");
		p.setDescription("no des");
		p.setId("Person001");
		p.setSource(new Source("someurl", new Date()));

		pr.save(p);
		System.out.println("save p success");
		Country c = new Country("Ha Noi");
		c.setId("Country001");
		c.setName("VietNam");
		c.setDescription("no des");
		c.setSource(new Source("someurl", new Date()));

		P2C pc = new P2C("live", p, c);
		pcr.save(pc);
		System.out.println("save pc successX");

	}

}
