package oop.g8.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oop.g8.model.entity.Country;
import oop.g8.model.entity.Event;
import oop.g8.model.entity.Location;
import oop.g8.model.entity.Organization;
import oop.g8.model.entity.Person;
import oop.g8.model.entity.Time;
import oop.g8.model.relation.Relationship;

@Service
public class QueryService {
	
	@Autowired
	private Wrap wrap;
	
	@Autowired
	private ScannerService scanner;
	
	private int selection;

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
		selection = scanner.getInputNum(21);
		switch (selection) {
		case 1: {
			// return:country(thuộc tính) của 1 location
			// param:location-tên của location đó
			String location;
			System.out.println("    #LOCATION thuộc đất nước nào?");
			System.out.print("    >_LOCATION: ");
			location = scanner.getInputStr();
			System.out.println("    #Kết quả:");
			List<Location> ll = wrap.location_repository.findByName(location);
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
			location = scanner.getInputStr();
			System.out.println("    #Kết quả:");
			List<Location> ll = wrap.location_repository.findByName(location);
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
			country = scanner.getInputStr();
			System.out.println("    #Kết quả:");
			List<Country> mylist = wrap.country_repository.findByName(country);
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
			person = scanner.getInputStr();
			System.out.println("    #Kết quả:");
			@SuppressWarnings("unchecked")
			List<Relationship<Person, Country>> mylist = wrap.relationship_repository.findByEntity1_NameAndType(person, "đến_từ");
			System.out.println("Has " + mylist.size() + " result!");
			for (Relationship<Person, Country> i : mylist) {
				System.out.println(i.getEntity1().getName());
			}
			break;
		}

		case 5: {
			// return:job(thuộc tính) của 1 person
			// param:person-tên của person đó
			String person;
			System.out.println("    #PERSON đang làm công việc gì?");
			System.out.print("    >_PERSON: ");
			person = scanner.getInputStr();
			System.out.println("    #Kết quả:");
			List<Person> mylist = wrap.person_repository.findByName(person);
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
			event = scanner.getInputStr();
			System.out.println("    #Kết quả:");
			@SuppressWarnings("unchecked")
			List<Relationship<Event, Location>> mylist = wrap.relationship_repository.findByEntity1_NameAndType(event, "diễn_ra_ở");
			System.out.println("Has " + mylist.size() + " Event with name is " + event
					+ " and has relation name 'diễn_ra_ở' with Location !");
			for (Relationship<Event, Location> i : mylist) {
				System.out.println(i.getEntity1().getName());
			}
			break;
		}

		case 7: {
			// return:timestart và timeend(đều là thuộc tính) của 1 event
			// param:event-tên sự kiện đó
			String event;
			System.out.println("    #EVENT diễn ra trong khoảng thời gian nào?");
			System.out.print("    >_EVENT: ");
			event = scanner.getInputStr();
			System.out.println("    #Kết quả:");
			List<Event> mylist = wrap.event_repository.findByName(event);
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
			organization = scanner.getInputStr();
			System.out.println("    #Kết quả:");
			List<Organization> mylist = wrap.organization_repository.findByName(organization);
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
			organization = scanner.getInputStr();
			System.out.println("    #Kết quả:");
			@SuppressWarnings("unchecked")
			List<Relationship<Person, Organization>> mylist = wrap.relationship_repository.findByTypeLikeAndEntity2_Name("*", organization);
			System.out.println("Has " + mylist.size() + " result !");
			for (Relationship<Person, Organization> i : mylist) {
				System.out.println(i.getEntity1().getName());
			}
			break;
		}

		case 10: {
			// return:danh sách các location có chung thuộc tính country được nhập vào
			// param:country-tên của country được nhập vào
			String country;
			System.out.println("    #Đưa ra danh sách các LOCATION thuộc 1 COUNTRY?");
			System.out.print("    >_COUNTRY: ");
			country = scanner.getInputStr();
			System.out.println("    #Kết quả:");
			List<Location> mylist = wrap.location_repository.findByCountry(country);
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
			time = scanner.getInputStr();
			System.out.println("    #Kết quả:");

			@SuppressWarnings("unchecked")
			List<Relationship<Person, Time>> mylist = wrap.relationship_repository.findByTypeAndEntity2_NameContaining("sinh ra vào", time);
			System.out.println("Has " + mylist.size() + " result!");
			for (Relationship<Person, Time> i : mylist) {
				System.out.println(i.getEntity1().getName());
			}
		}

		case 12: {
			// return:danh sách các organization [hợp_tác_với] ORGANIZATION
			// param:organization-tên tổ chức đó
			String organization;
			System.out.println("    #Những ORGANIZATION nào hợp tác với ORGANIZATION?");
			System.out.print("    >_ORGANIZATION: ");
			organization = scanner.getInputStr();
			System.out.println("    #Kết quả:");
			@SuppressWarnings("unchecked")
			List<Relationship<Organization, Organization>> mylist = wrap.relationship_repository.findByTypeAndEntity2_Name("hợp tác", organization);
			System.out.println("Has " + mylist.size() + "result!");
			for (Relationship<Organization, Organization> i : mylist) {
				System.out.println(i.getEntity1().getName());
			}
			break;
		}

		case 13: {
			// return:name của person [đến_thăm] (country)
			// param:country-tên của quốc gia đó
			String country;
			System.out.println("    #Những PERSON nào đã đến thăm COUNTRY?");
			System.out.print("    >_COUNTRY: ");
			country = scanner.getInputStr();
			System.out.println("    #Kết quả:");
			@SuppressWarnings("unchecked")
			List<Relationship<Person, Country>> mylist = wrap.relationship_repository.findByTypeAndEntity2_Name("tới thăm", country);
			System.out.println("Has " + mylist.size() + "result!");
			for (Relationship<Person, Country> i : mylist) {
				System.out.println(i.getEntity1().getName());
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
			country = scanner.getInputStr();
			System.out.print("    >_YEAR: ");
			year = scanner.getInputStr();
			System.out.println("    #Kết quả:");
			@SuppressWarnings("unchecked")
			List<Relationship<Event, Country>> mylist = wrap.relationship_repository.findByEntity1_NameAndType(country, "diễn ra tại");
			@SuppressWarnings("unchecked")
			List<Relationship<Event, Time>> mylist2 = wrap.relationship_repository.findByEntity2_Name_EndingWith("diễn ra vào", year);
			List<Event> el1 = new ArrayList<>();
			List<Event> el2 = new ArrayList<>();
			for (Relationship<Event, Country> j : mylist) {
				el1.add(j.getEntity1());
			}
			for (Relationship<Event, Time> k : mylist2) {
				el2.add(k.getEntity1());
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
			person = scanner.getInputStr();
			System.out.println("    #Kết quả:");
			@SuppressWarnings("unchecked")
			List<Relationship<Person, Person>> mylist = wrap.relationship_repository.findByEntity1_NameAndTypeLike(person, "*");
			System.out.println("Has " + mylist.size() + "result!");
			for (Relationship<Person, Person> i : mylist) {
				System.out.println(i.getEntity2().getName());
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
			person = scanner.getInputStr();
			System.out.print("    >_YEAR: ");
			year = scanner.getInputStr();
			System.out.println("    #Kết quả:");
			@SuppressWarnings("unchecked")
			List<Relationship<Person, Event>> mylist = wrap.relationship_repository.findByEntity1_NameAndType(person, "tham gia");
			@SuppressWarnings("unchecked")
			List<Relationship<Event, Time>> mylist2 = wrap.relationship_repository.findByEntity2_Name_EndingWith("diễn ra vào", year);
			List<Event> el1 = new ArrayList<>();
			List<Event> el2 = new ArrayList<>();
			for (Relationship<Person, Event> j : mylist) {
				el1.add(j.getEntity2());
			}
			for (Relationship<Event, Time> k : mylist2) {
				el2.add(k.getEntity1());
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
			location = scanner.getInputStr();
			System.out.print("    >_YEAR: ");
			year = scanner.getInputStr();
			System.out.println("    #Kết quả:");
			@SuppressWarnings("unchecked")
			List<Relationship<Event, Location>> mylist = wrap.relationship_repository.findByTypeAndEntity2_Name("được tổ chức bởi", location);
			@SuppressWarnings("unchecked")
			List<Relationship<Event, Time>> mylist2 = wrap.relationship_repository.findByEntity2_Name_EndingWith("diễn ra vào", year);

			List<Event> el1 = new ArrayList<>();
			List<Event> el2 = new ArrayList<>();
			for (Relationship<Event, Location> j : mylist) {
				el1.add(j.getEntity1());
			}
			for (Relationship<Event, Time> k : mylist2) {
				el2.add(k.getEntity1());
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
			event = scanner.getInputStr();
			System.out.println("    #Kết quả:");
			@SuppressWarnings("unchecked")
			List<Relationship<Person, Event>> mylist = wrap.relationship_repository.findByEntity1_NameAndType(event, "tham gia");
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
			relationship = scanner.getInputStr();
			System.out.print("    >_COUNTRY: ");
			country = scanner.getInputStr();
			System.out.println("    #Kết quả:");
			@SuppressWarnings("unchecked")
			List<Relationship<Country, Country>> mylist = wrap.relationship_repository.findByTypeAndEntity2_Name(relationship, country);
			System.out.println("Has " + mylist.size() + "result!");
			for (Relationship<Country, Country> i : mylist) {
				System.out.println(i.getEntity1().getName());
			}
			break;
		}

		case 21: {
			return false;
		}
		}
		return true;
	}
}
