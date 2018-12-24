package oop.g8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import oop.g8.generator.entity.CountryGenerator;
import oop.g8.generator.entity.EventGenerator;
import oop.g8.generator.entity.LocationGenerator;
import oop.g8.generator.entity.OrganizationGenerator;
import oop.g8.generator.entity.PersonGenerator;
import oop.g8.generator.entity.TimeGenerator;
import oop.g8.service.InitDB;
import oop.g8.service.QueryService;
import oop.g8.service.ScannerService;

/**
 * public void run(String... args) throws Exception <----> hàm main() mọi thứ
 * trong hàm run(
 * 
 * @author Hoang Nam
 *
 */
@Component
public class OopProAppEntry implements CommandLineRunner {

	@Autowired
	private QueryService queryService;
	
	@Autowired
	private InitDB initDbService;

	@Autowired
	private ScannerService scn;
	
	private int selection;

	@Override
	public void run(String... args) throws Exception {

//		SourceGenerator.getData("C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData/entity/Source/domain_list");
		PersonGenerator.getData(
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Person\\firstname_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Person\\midname_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Person\\lastname_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Person\\job_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Person\\des_element_list");
		OrganizationGenerator.getData(
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Organization\\organization_name_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Organization\\headquarters_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Organization\\firstname_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Organization\\midname_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Organization\\lastname_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Organization\\email_domain_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Organization\\des_element1_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Organization\\des_element2_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Organization\\country_list");
		CountryGenerator.getData(
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Country\\country_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Country\\capital_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Country\\des_element1_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Country\\des_element2_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Country\\des_element3_list");
		LocationGenerator.getData(
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Location\\location_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Location\\country_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Location\\des_element_list");
		EventGenerator.getData(
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Event\\venue_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Event\\country_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Event\\festival_name_list",
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Event\\product_name_list");
		TimeGenerator.getData(
				"C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\entity\\Time\\special_day_list");

		//
		System.out.println("read files done!");

		while (true) {
			System.out.println("------------------------MENU-------------------------");
			System.out.println("1.Sinh dữ liệu giả lập:");
			System.out.println("2.Truy vấn");
			System.out.println("3.Thoát");
			System.out.print("->Lựa chọn: ");
			selection = scn.getInputNum(3);
			switch (selection) {
			case 1:
				initDbService.addData();
				break;
			case 2:
				while (queryService.execQuery())
					;
				break;
			case 3:
				System.out.println("Chương trình kết thúc");
				System.exit(0);
			}
		}

//		List<Person> pL1 = new ArrayList<>();
//		List<Person> pL = new ArrayList<>();
//		long s = System.currentTimeMillis();
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				Person p = PersonGenerator.generatePerson();
//				pL.add(p);
//				pL1.add(p);
//
//			}
//			pr.saveAll(pL);
//			System.out.println("save" + i + " !");
//			pL.clear();
//		}
//		long e = System.currentTimeMillis();
//		System.out.println("time generate Person:" + (e - s));
//
//		long s1 = System.currentTimeMillis();
//		List<Organization> oL1 = new ArrayList<>();
//		List<Organization> oL = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				Organization o = OrganizationGenerator.generateOrganization();
//				oL.add(o);
//				oL1.add(o);
//			}
//			or.saveAll(oL);
//			System.out.println("save" + i + " !");
//			oL.clear();
//		}
//		long e1 = System.currentTimeMillis();
//		System.out.println("time generate Country:" + (e1 - s1));
//
//		List<Location> lL1 = new ArrayList<>();
//		List<Location> lL = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				Location l = LocationGenerator.generateLocation();
//				lL.add(l);
//				lL1.add(l);
//			}
//			lr.saveAll(lL);
//			System.out.println("save" + i + " !");
//			lL.clear();
//		}

//		List<Country> cL = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				Country c = CountryGenerator.generateCountry();
//				cL.add(c);
//			}
//			cr.saveAll(cL);
//			System.out.println("save" + i + " !");
//			cL.clear();
//		}
//
//		List<Event> eL = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				Event e11 = EventGenerator.generateEvent();
//				eL.add(e11);
//			}
//			er.saveAll(eL);
//			System.out.println("save" + i + " !");
//			eL.clear();
//		}
//
//		List<Time> tL = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				Time t = TimeGenerator.generateTime();
//				tL.add(t);
//			}
//			tr.saveAll(tL);
//			System.out.println("save" + i + " !");
//			tL.clear();
//		}

//		for (int i = 0; i <= 9; i++) {
//			por.save(P2OG.generateP2O(pL1.get(i), oL1.get(i), "relationNameO", "linkO", new Date()));
//			plr.save(P2LG.generateP2L(pL1.get(i), lL1.get(i), "relationNameL", "linkL", new Date()));
//		}

//		Page<Person> pList = w.pr.findAll(new PageRequest(0, 2));
//		System.out.println(pList.getContent());

//		P2P p2p = new P2P("love", "link", new Date(), PersonGenerator.generatePerson(), PersonGenerator.generatePerson());
//		w.ppr.save(p2p);
//		
//		Page<P2P> pplist = w.ppr.findAll(new PageRequest(0, 2));
//		System.out.println(pplist.getContent());
//		
//		List<P2P> myp2p = w.ppr.findByPerson_NameAndPerson2_Name("Balsam Bart Sharline", "Maurise Tomkin Seana");
//		System.out.println(myp2p.get(0).getType());
//		
//		List<P2P> myp2p2 = w.ppr.findByPerson_NameAndType("Balsam Bart Sharline", "love");
//		System.out.println(myp2p2.get(0).getPerson2().getName());

	}

}
