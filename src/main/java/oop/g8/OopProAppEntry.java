package oop.g8;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import oop.g8.generator.entity.CountryGenerator;
import oop.g8.generator.entity.PersonGenerator;
import oop.g8.generator.entity.SourceGenerator;
import oop.g8.model.entity.Country;
import oop.g8.model.entity.Person;
import oop.g8.repository.entity.CountryR;
import oop.g8.repository.entity.PersonR;
import oop.g8.repository.entity.SourceR;
import oop.g8.repository.relation.country.C2CR;
import oop.g8.repository.relation.person.P2CR;

@Component
public class OopProAppEntry implements CommandLineRunner {

	// mọi crud and truy vấn liên quan đến Person đều được thực hiện bởi PersonRepo
	// pr
	@Autowired
	private PersonR pr;

	// tương tự
	@Autowired
	private CountryR cr;

	// tương tự
	@Autowired
	SourceR sr;

	// tương tự
	@Autowired
	private P2CR pcr;

	@Autowired
	private C2CR cc;

	@Override
	public void run(String... args) throws Exception {

//		// create source s
//		Source s = new Source("some link", new Date());
//		// save s to database
//		sr.save(s);
//		System.out.println("save s success");
//
//		// create person p
//		Person p = new Person(20, true, "student");
//		p.setId("Person001");
//		p.setName("Hoang Nam");
//		p.setDescription("no des");
//		p.setSource(s);
//		// save p to database
//		pr.save(p);
//		System.out.println("save p success");
//
//		// create country c
//		Country c = new Country("Ha Noi");
//		c.setId("Country001");
//		c.setName("VietNam");
//		c.setDescription("no des");
//		c.setSource(s);
//		// save c to database
//		cr.save(c);
//		System.out.println("save c success");
//
//		// create relation betweeb p and c
//		// if p, c not exits, it auto be created
//		// if p, c are exits, it only create relationship
//		P2C pc = new P2C("live in", p, c);
//		pcr.save(pc);
//		System.out.println("save pc success");
//		
//		Person p1 = pr.findByName("Hoang Nam");
//		System.out.println(p1);
//		
//		Person p2 = pr.findByNameLikeAndAge("Hoan*", 20);
//		System.err.println(p2);
//		
//		P2C p2c = pcr.findByPerson_Job("student");
//		System.out.println(p2c);

		////////////////
		PersonGenerator.getData(
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Person\\firstname_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Person\\midname_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Person\\lastname_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Person\\job_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Person\\des_element_list");

		////////////////
		SourceGenerator.getData(
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Source\\domain_list");

		////////////////
		CountryGenerator.getData(
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Country\\country_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Country\\capital_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Country\\des_element1_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Country\\des_element2_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Country\\des_element3_list");

		System.out.println("read file done!");

		
		
		List<Country> cL = new ArrayList<>();
//		List<Country> cL2 = new ArrayList<>();
		long s1 = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 1000; j++) {
				Country c = CountryGenerator.generateCountry();
				cL.add(c);
//				cL2.add(c);
			}
			cr.saveAll(cL);
			System.out.println("save" + i + " !");
			cL.clear();
		}
		long e1 = System.currentTimeMillis();
		System.out.println("time generate Country:" + (e1 - s1));

		
		
		
		
		List<Person> pL = new ArrayList<>();
//		List<Person> pL2 = new ArrayList<>();
		long s = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 1000; j++) {
				Person p = PersonGenerator.generatePerson();
				pL.add(p);
//				pL2.add(p);
			}
			pr.saveAll(pL);
			System.out.println("save" + i + " !");
			pL.clear();
		}
		long e = System.currentTimeMillis();
		System.out.println("time generate Person:" + (e - s));

	}

}
