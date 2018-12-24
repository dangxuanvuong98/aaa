package oop.g8.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import oop.g8.model.entity.Time;

@Service
public class InitDB {

	@Autowired
	private Wrap w;

	@Autowired
	private ScannerService scn;

	public void addData() {
		System.out.println("---Sinh dữ liệu giả lập---");
		System.out.print("->Số lượng thực thể: ");
		int e = scn.getInputNum(100000000);

		System.out.print("->Số lượng quan hệ: ");
		int r = scn.getInputNum(100000000);
		System.out.println("    Sinh " + e + " thực thể và " + r + " quan hệ");

		int outterLoop1 = e / 6000;
		int outterLoop2 = r / 6000;

////////////////////////////////////////////////////////////////////////////
		List<Person> pL1 = new ArrayList<>();
		List<Person> pL = new ArrayList<>();
		long s = System.currentTimeMillis();
		for (int i = 0; i < outterLoop1; i++) {
			for (int j = 0; j < 1000; j++) {
				Person p = PersonGenerator.generatePerson();
				pL.add(p);
				pL1.add(p);
			}
			w.pr.saveAll(pL);
			System.out.println("save Person " + i + "x1000 !");
			pL.clear();
		}
		long f = System.currentTimeMillis();
		System.out.println("time generate Person:" + (f - s));

////////////////////////////////////////////////////////////////////////////
		s = System.currentTimeMillis();
		List<Organization> oL1 = new ArrayList<>();
		List<Organization> oL = new ArrayList<>();
		for (int i = 0; i < outterLoop1; i++) {
			for (int j = 0; j < 1000; j++) {
				Organization o = OrganizationGenerator.generateOrganization();
				oL.add(o);
				oL1.add(o);
			}
			w.or.saveAll(oL);
			System.out.println("save Organization " + i + "x1000 !");
			oL.clear();
		}
		f = System.currentTimeMillis();
		System.out.println("time generate Country:" + ( f - s));

////////////////////////////////////////////////////////////////////////////		
		s = System.currentTimeMillis();
		List<Location> lL1 = new ArrayList<>();
		List<Location> lL = new ArrayList<>();
		for (int i = 0; i < outterLoop1; i++) {
			for (int j = 0; j < 1000; j++) {
				Location l = LocationGenerator.generateLocation();
				lL.add(l);
				lL1.add(l);
			}
			w.lr.saveAll(lL);
			System.out.println("save Location " + i + "x1000 !");
			lL.clear();
		}
		f = System.currentTimeMillis();
		System.out.println("time generate Location:" + (f - s));

////////////////////////////////////////////////////////////////////////////
		s = System.currentTimeMillis();
		List<Country> cL1 = new ArrayList<>();
		List<Country> cL = new ArrayList<>();
		for (int i = 0; i < outterLoop1; i++) {
			for (int j = 0; j < 1000; j++) {
				Country c = CountryGenerator.generateCountry();
				cL1.add(c);
				cL.add(c);
			}
			w.cr.saveAll(cL);
			System.out.println("save Country " + i + "x1000 !");
			cL.clear();
		}
		f = System.currentTimeMillis();
		System.out.println("time generate Location:" + (f - s));

////////////////////////////////////////////////////////////////////////////	
		s = System.currentTimeMillis();
		List<Event> eL1 = new ArrayList<>();
		List<Event> eL = new ArrayList<>();
		for (int i = 0; i < outterLoop1; i++) {
			for (int j = 0; j < 1000; j++) {
				Event e11 = EventGenerator.generateEvent();
				eL.add(e11);
				eL1.add(e11);
			}
			w.er.saveAll(eL);
			System.out.println("save Event" + i + "x1000 !");
			eL.clear();
		}
		f = System.currentTimeMillis();
		System.out.println("time generate Event:" + (f - s));

////////////////////////////////////////////////////////////////////////////
		s = System.currentTimeMillis();
		List<Time> tL1 = new ArrayList<>();
		List<Time> tL = new ArrayList<>();
		for (int i = 0; i < outterLoop1; i++) {
			for (int j = 0; j < 1000; j++) {
				Time t = TimeGenerator.generateTime();
				tL.add(t);
				tL1.add(t);
			}
			w.tr.saveAll(tL);
			System.out.println("save Time" + i + "x1000 !");
			tL.clear();
		}
		f = System.currentTimeMillis();
		System.out.println("time generate Event:" + (f - s));

////////////////////////////////////////////////////////////////////////////
//		List<C2C> ccL = new ArrayList<>();
//		for (int i = 0; i < outterLoop2; i++) {
//			for (int j = 0; j < 1000; j++) {
//				C2C c2c = C2CG.generateC2C(cL1.get(index), cL1.get(index), relationName, link, date);
//				ccL.add(c2c);
//			}
//			w.ccr.saveAll(ccL);
//			System.out.println("save Time" + i + "x1000 !");
//			ccL.clear();
//		}
	}

}
