package oop.g8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import oop.g8.generator.entity.CountryGenerator;
import oop.g8.generator.entity.EventGenerator;
import oop.g8.generator.entity.LocationGenerator;
import oop.g8.generator.entity.OrganizationGenerator;
import oop.g8.generator.entity.PersonGenerator;
import oop.g8.generator.entity.TimeGenerator;
import oop.g8.model.entity.Country;
import oop.g8.model.entity.Event;
import oop.g8.model.entity.Location;
import oop.g8.model.entity.Organization;
import oop.g8.model.entity.Person;
import oop.g8.model.relation.country.C2C;
import oop.g8.model.relation.event.E2C;
import oop.g8.model.relation.event.E2L;
import oop.g8.model.relation.event.E2T;
import oop.g8.model.relation.organization.O2O;
import oop.g8.model.relation.person.P2C;
import oop.g8.model.relation.person.P2E;
import oop.g8.model.relation.person.P2O;
import oop.g8.model.relation.person.P2P;
import oop.g8.model.relation.person.P2T;
import oop.g8.service.Wrap;

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
	private Wrap w;

	private Scanner scn;
	private int selection;

	public int getInputNum(int max) {
		int num;
		while (true) {
			try {
				num = scn.nextInt();
				if (num <= 0 || num > max)
					throw new Exception();
			} catch (Exception e) {
				System.out.print("Không hợp lệ, mời nhập lại: ");
				scn.nextLine();
				continue;
			}
			return num;
		}
	}

	public String getInputStr() {
		String str;
		while (true) {
			try {
				str = scn.next();
			} catch (Exception e) {
				System.out.print("Không hợp lệ, mời nhập lại: ");
				scn.nextLine();
				continue;
			}
			return str;
		}
	}

	public void addData() {
		System.out.println("---Sinh dữ liệu giả lập---");
		System.out.print("->Số lượng thực thể: ");
		int e = getInputNum(100000000);
		System.out.print("->Số lượng quan hệ: ");
		int r = getInputNum(100000000);
		System.out.println("    Sinh " + e + " thực thể và " + r + " quan hệ");
		// insert code here

	}

	public boolean execQuery() {
		System.out.println("---TRUY VẤN---");
		System.out.println("    1.LOCATION thuộc đất nước nào?");
		System.out.println("    2.Lấy thông tin mô tả của 1 LOCATION?");
		System.out.println("    3.COUNTRY có thủ đô là gì?");
		System.out.println("    4.PERSON đến từ đâu?");
		System.out.println("    5.PERSON đang làm công việc gì?");
		System.out.println("    6.EVENT diễn ra ở đâu?");
		System.out.println("    7.EVENT diễn ra trong khoảng thời gian nào?");
		System.out.println("    8.Thông tin liên hệ của ORGANIZATION");
		System.out.println("    9.PERSON nào làm việc cho một ORGANIZATION?");
		System.out.println("    10.Đưa ra danh sách các LOCATION thuộc 1 COUNTRY?");
		System.out.println("    11.Những PERSON nào sinh ra vào TIME?");
		System.out.println("    12.Những ORGANIZATION nào hợp tác với ORGANIZATION?");
		System.out.println("    13.Những PERSON nào đã đến thăm COUNTRY?");
		System.out.println("    14.Những EVENT diễn ra tại một COUNTRY trong YEAR?");
		System.out.println("    15.Những PERSON nào có quan hệ với 1 PERSON?");
		System.out.println("    16.PERSON đã tham gia những EVENT nào trong năm YEAR?");
		System.out.println("    17.LOCATION nào diễn ra nhiều event nhất?");
		System.out.println("    18.LOCATION đã tổ chức những sự kiện gì trong năm YEAR?");
		System.out.println("    19.Có bao nhiều người tham dự EVENT?");
		System.out.println("    20.COUNTRY nào có RELATIONSHIP với COUNTRY?");
		System.out.println("    21.Quay lại");
		System.out.print("->Lựa chọn: ");
		selection = getInputNum(21);
		switch (selection) {
		case 1: {
			// return:country(thuộc tính) của 1 location
			// param:location-tên của location đó
			String location;
			System.out.println("    #LOCATION thuộc đất nước nào?");
			System.out.print("    >_LOCATION: ");
			location = getInputStr();
			System.out.println("    #Kết quả:");
			List<Location> ll = w.lr.findByName(location);
			System.out.println("Has " + ll.size() + " Location with name is " + location + " !");
			for (Location l : ll) {
				System.out.println(l.getCountry());
			}
			break;
		}
		case 2: {
			// return:description(thuộc tính) của 1 location
			// param:location-tên của địa danh đó
			String location;
			System.out.println("    #Lấy thông tin mô tả của 1 LOCATION?");
			System.out.print("    >_LOCATION: ");
			location = getInputStr();
			System.out.println("    #Kết quả:");
			List<Location> ll = w.lr.findByName(location);
			System.out.println("Has " + ll.size() + " Location with name is " + location + " !");
			for (Location l : ll) {
				System.out.println(l.getDescription());
			}
			break;
		}

		case 3: {
			// return:capital(thuộc tính) của 1 country
			// param:country-tên của country đó
			String country;
			System.out.println("    #COUNTRY có thủ đô là gì?");
			System.out.print("    >_COUNTRY: ");
			country = getInputStr();
			System.out.println("    #Kết quả:");
			List<Country> mylist = w.cr.findByName(country);
			System.out.println("Has " + mylist.size() + " result!");
			for (Country i : mylist) {
				System.out.println(i.getCapital());
			}
			break;
		}

		case 4: {
			String person;
			System.out.println("    #PERSON đến từ đâu?");
			System.out.print("    >_PERSON: ");
			person = getInputStr();
			System.out.println("    #Kết quả:");
			List<P2C> mylist = w.pcr.findByPerson_NameAndType(person, "đến_từ");
			System.out.println("Has " + mylist.size() + " result!");
			for (P2C i : mylist) {
				System.out.println(i.getPerson().getName());
			}
			break;
		}

		case 5: {
			// return:job(thuộc tính) của 1 person
			// param:person-tên của person đó
			String person;
			System.out.println("    #PERSON đang làm công việc gì?");
			System.out.print("    >_PERSON: ");
			person = getInputStr();
			System.out.println("    #Kết quả:");
			List<Person> mylist = w.pr.findByName(person);
			System.out.println("Has " + mylist.size() + " Person with name is " + person + " !");
			for (Person i : mylist) {
				System.out.println(i.getJob());
			}

			break;
		}

		case 6: {
			// return:name của 1 thực thể,có thể là location,có thể là country,chỉ cần thỏa
			// mãn (event)-[:diễn_ra_ở]->(?)
			// param:event-tên của event đó
			String event;
			System.out.println("    #EVENT diễn ra ở đâu?");
			System.out.print("    >_EVENT: ");
			event = getInputStr();
			System.out.println("    #Kết quả:");
			List<E2L> mylist = w.elr.findByEvent_NameAndType(event, "diễn_ra_ở");
			System.out.println("Has " + mylist.size() + " Event with name is " + event
					+ " and has relation name 'diễn_ra_ở' with Location !");
			for (E2L i : mylist) {
				System.out.println(i.getLocation().getName());
			}
			break;
		}

		case 7: {
			// return:timestart và timeend(đều là thuộc tính) của 1 event
			// param:event-tên sự kiện đó
			String event;
			System.out.println("    #EVENT diễn ra trong khoảng thời gian nào?");
			System.out.print("    >_EVENT: ");
			event = getInputStr();
			System.out.println("    #Kết quả:");
			List<Event> mylist = w.er.findByName(event);
			System.out.println("Has " + mylist.size() + " Event with name is " + event + " !");
			for (Event i : mylist) {
				System.out.println(i.getTimeStart() + "  -->  " + i.getTimeEnd());
			}
			break;
		}

		case 8: {
			// return:email,phone(thuộc tính) của 1 organization
			String organization;
			System.out.println("    #Thông tin liên hệ của ORGANIZATION");
			System.out.print("    >_ORGANIZATION: ");
			organization = getInputStr();
			System.out.println("    #Kết quả:");
			List<Organization> mylist = w.or.findByName(organization);
			System.out.println("Has " + mylist.size() + " Organization with name is " + organization + " !");
			for (Organization i : mylist) {
				System.out.println(i.getEmail() + " +  " + i.getPhone());
			}
			break;
		}

		case 9: {
			// return:name của những người làm việc cho một organization
			// param:organization-tên của organization đó
			String organization;
			System.out.println("    #PERSON nào làm việc cho một ORGANIZATION?");
			System.out.print("    >_PERSON: ");
			organization = getInputStr();
			System.out.println("    #Kết quả:");
			List<P2O> mylist = w.por.findByTypeLikeAndOrganization_Name("*", organization);
			System.out.println("Has " + mylist.size() + " result !");
			for (P2O i : mylist) {
				System.out.println(i.getPerson().getName());
			}
			break;
		}

		case 10: {
			// return:danh sách các location có chung thuộc tính country được nhập vào
			// param:country-tên của country được nhập vào
			String country;
			System.out.println("    #Đưa ra danh sách các LOCATION thuộc 1 COUNTRY?");
			System.out.print("    >_COUNTRY: ");
			country = getInputStr();
			System.out.println("    #Kết quả:");
			List<Location> mylist = w.lr.findByCountry(country);
			System.out.println("Has " + mylist.size() + " Location with country's name is " + country + " !");
			for (Location i : mylist) {
				System.out.println(i.getName());
			}
			break;
		}

		case 11: {
			// return:name của person [sinh_ra_vào] TIME
			// param:time-thời gian nhập vào
			String time;
			System.out.println("    #Những PERSON nào sinh ra vào TIME?");
			System.out.print("    >_TIME: ");
			time = getInputStr();
			System.out.println("    #Kết quả:");

			List<P2T> mylist = w.ptr.findByTypeAndTime_NameContaining("sinh ra vào", time);
			System.out.println("Has " + mylist.size() + " result!");
			for (P2T i : mylist) {
				System.out.println(i.getPerson().getName());
			}
		}

		case 12: {
			// return:danh sách các organization [hợp_tác_với] ORGANIZATION
			// param:organization-tên tổ chức đó
			String organization;
			System.out.println("    #Những ORGANIZATION nào hợp tác với ORGANIZATION?");
			System.out.print("    >_ORGANIZATION: ");
			organization = getInputStr();
			System.out.println("    #Kết quả:");
			List<O2O> mylist = w.oor.findByTypeAndOrganization2_Name("hợp tác", organization);
			System.out.println("Has " + mylist.size() + "result!");
			for (O2O i : mylist) {
				System.out.println(i.getOrganization().getName());
			}
			break;
		}

		case 13: {
			// return:name của person [đến_thăm] (country)
			// param:country-tên của quốc gia đó
			String country;
			System.out.println("    #Những PERSON nào đã đến thăm COUNTRY?");
			System.out.print("    >_COUNTRY: ");
			country = getInputStr();
			System.out.println("    #Kết quả:");
			List<P2C> mylist = w.pcr.findByTypeAndCountry_Name("tới thăm", country);
			System.out.println("Has " + mylist.size() + "result!");
			for (P2C i : mylist) {
				System.out.println(i.getPerson().getName());
			}
			break;
		}

		case 14: {
			// return:những event [diễn_ra_tại] 1 country,vừa diễn ra trong 1 thực thể
			// time(name của thực thể time này endwith YEAR)
			// param:country-tên của quốc gia
			// param:year-số năm
			// Chú thích:do hàm sinh,thực thể time lúc nào cũng endWith 1 số năm
			String country;
			String year;
			System.out.println("    #Những EVENT diễn ra tại một COUNTRY trong YEAR?");
			System.out.print("    >_COUNTRY: ");
			country = getInputStr();
			System.out.print("    >_YEAR: ");
			year = getInputStr();
			System.out.println("    #Kết quả:");
			List<E2C> mylist = w.ecr.findByCountry_NameAndType(country, "diễn ra tại");
			List<E2T> mylist2 = w.etr.findByTypeAndTime_Name_EndingWith("diễn ra vào", year);
			List<Event> el1 = new ArrayList<>();
			List<Event> el2 = new ArrayList<>();
			for (E2C j : mylist) {
				el1.add(j.getEvent());
			}
			for (E2T k : mylist2) {
				el2.add(k.getEvent());
			}
			el1.retainAll(el2);
			System.out.println("Has " + el1.size() + "result!");
			for (Event i : el1) {
				System.out.println(i.getName());
			}
			break;
		}

		case 15: {
			// return:name của những person --(1 person khác có tên nhập vào)
			// param:tên của person đó
			String person;
			System.out.println("    #Những PERSON nào có quan hệ với 1 PERSON?");
			System.out.print("    >_PERSON: ");
			person = getInputStr();
			System.out.println("    #Kết quả:");
			List<P2P> mylist = w.ppr.findByPerson2_NameAndTypeLike(person, "*");
			System.out.println("Has " + mylist.size() + "result!");
			for (P2P i : mylist) {
				System.out.println(i.getPerson().getName());
			}
			break;
		}

		case 16: {
			// return:những person [tham_gia] 1 EVENT,mà EVENT đó [diễn_ra_vào] 1 thực thể
			// Time có name endWith YEAR
			// param:country-tên của quốc gia
			// param:year-số năm
			// Chú thích:do hàm sinh,thực thể time lúc nào cũng endWith 1 số năm
			String person;
			String year;
			System.out.println("    #PERSON đã tham gia những EVENT nào trong năm YEAR?");
			System.out.print("    >_PERSON: ");
			person = getInputStr();
			System.out.print("    >_YEAR: ");
			year = getInputStr();
			System.out.println("    #Kết quả:");
			List<P2E> mylist = w.per.findByPerson_NameAndType(person, "tham gia");
			List<E2T> mylist2 = w.etr.findByTypeAndTime_Name_EndingWith("diễn ra vào", year);
			List<Event> el1 = new ArrayList<>();
			List<Event> el2 = new ArrayList<>();
			for (P2E j : mylist) {
				el1.add(j.getEvent());
			}
			for (E2T k : mylist2) {
				el2.add(k.getEvent());
			}
			el1.retainAll(el2);
			System.out.println("Has " + el1.size() + "result!");
			for (Event i : el1) {
				System.out.println(i.getName());
			}
			break;
		}

//		case 17: {
//			// return:name của location diễn ra nhiều event nhất
//			// param:null
//			System.out.println("    #LOCATION nào diễn ra nhiều event nhất?");
//			System.out.print("    >_YEAR: ");
//			System.out.println("    #Kết quả:");
//
//			
//			break;
//		}

		case 18: {
			// return:name của các sự kiện [diễn ra vào] 1 thực thể Time có name endWith
			// YEAR,vừa được toorr chức bởi LOCATION
			// param:location-tên location
			// param:year-năm
			String location;
			String year;
			System.out.println("    #LOCATION đã tổ chức những sự kiện gì trong năm YEAR?");
			System.out.print("    >_LOCATION: ");
			location = getInputStr();
			System.out.print("    >_YEAR: ");
			year = getInputStr();
			System.out.println("    #Kết quả:");
			List<E2L> mylist = w.elr.findByTypeAndLocation_Name("được tổ chức bởi", location);
			List<E2T> mylist2 = w.etr.findByTypeAndTime_Name_EndingWith("diễn ra vào", year);
			
			List<Event> el1 = new ArrayList<>();
			List<Event> el2 = new ArrayList<>();
			for (E2L j : mylist) {
				el1.add(j.getEvent());
			}
			for (E2T k : mylist2) {
				el2.add(k.getEvent());
			}
			el1.retainAll(el2);
			System.out.println("Has " + el1.size() + "result!");
			for (Event i : el1) {
				System.out.println(i.getName());
			}
			break;
		}
//
		case 19: {
			// return:số người tham dự event
			// param:event-tên event
			String event;
			System.out.println("    #Có bao nhiều người tham dự EVENT?");
			System.out.print("    >_EVENT: ");
			event = getInputStr();
			System.out.println("    #Kết quả:");
			List<P2E> mylist = w.per.findByEvent_NameAndType(event, "tham gia");
			System.out.println("Has " + mylist.size() + " person 'tham gia' sự kiện " + event);
//			for(P2E i : mylist) {
//				System.out.println(i.getPerson().getName());
//			}
			break;
		}

		case 20: {
			// return:(country nào?)-[:relationship]->(COUNTRY)
			// param:relationship:tên quan hệ
			// param: country tên đất nước
			String relationship;
			String country;
			System.out.println("    #COUNTRY nào có RELATIONSHIP với COUNTRY?");
			System.out.print("    >_RELATIONSHIP: ");
			relationship = getInputStr();
			System.out.print("    >_COUNTRY: ");
			country = getInputStr();
			System.out.println("    #Kết quả:");
			List<C2C> mylist = w.ccr.findByTypeAndCountry2_Name(relationship, country);
			System.out.println("Has " + mylist.size() + "result!");
			for (C2C i : mylist) {
				System.out.println(i.getCountry().getName());
			}
			break;
		}

		case 21: {
			return false;
		}
		}
		return true;
	}

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

		scn = new Scanner(System.in);
		while (true) {
			System.out.println("------------------------MENU-------------------------");
			System.out.println("1.Sinh dữ liệu giả lập:");
			System.out.println("2.Truy vấn");
			System.out.println("3.Thoát");
			System.out.print("->Lựa chọn: ");
			selection = getInputNum(3);
			switch (selection) {
			case 1:
				addData();
				break;
			case 2:
				while (execQuery())
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
