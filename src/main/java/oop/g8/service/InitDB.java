package oop.g8.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import oop.g8.generator.entity.CountryGenerator;
import oop.g8.generator.entity.EventGenerator;
import oop.g8.generator.entity.LocationGenerator;
import oop.g8.generator.entity.OrganizationGenerator;
import oop.g8.generator.entity.PersonGenerator;
import oop.g8.generator.entity.TimeGenerator;
import oop.g8.generator.relation.RelationshipGenerator;
import oop.g8.model.entity.Entity;
import oop.g8.model.entity.Location;
import oop.g8.model.entity.Person;
import oop.g8.model.relation.Relationship;

@Service
public class InitDB {
	@Autowired
	private Wrap wrap;
	
	@Autowired
	private ScannerService scanner;

	@SuppressWarnings({ "unchecked" })
	private void randomAddData(long E, long R) {
		List<Entity> entity_list = new ArrayList<Entity>();
		for (int i = 0; i < E / 1000 + 1; i++) {
			for (int j = 0; j < 1000; j++) {
				if (i * 1000 + j == E) {
					break;
				}
				int random_num = (int) (Math.random() * 6);
				switch (random_num) {
				case 0:
					entity_list.add(PersonGenerator.generate());
					continue;
				case 1:
					entity_list.add(OrganizationGenerator.generate());
					continue;
				case 2:
					entity_list.add(EventGenerator.generate());
					continue;
				case 3:
					entity_list.add(LocationGenerator.generate());
					continue;
				case 4:
					entity_list.add(TimeGenerator.generate());
					continue;
				case 5:
					entity_list.add(CountryGenerator.generate());
					continue;
				default:
					continue;
				}
			}
			wrap.entity_repository.saveAll(entity_list);
			entity_list.clear();
		}
		List<Relationship<Entity, Entity>> rela_list;
		RelationshipGenerator rg = new RelationshipGenerator();
		for (int i = 0; i < R / 1000 + 1; i++) {
			rela_list = new ArrayList<Relationship<Entity, Entity>>();
			for (int j = 0; j < 1000; j++) {
				if (i * 1000 + j == R) {
					break;
				}
				Relationship<Entity, Entity> rela = rg.generate();
				rela_list.add(rela);
//				rela_list.add(new Relationship<Entity, Entity>("ahihi", "hihi", new Date(), new Person(), new Location()));
			}
			if (rela_list != null) {
				try {
					wrap.relationship_repository.saveAll(rela_list);
				} catch (NullPointerException e) {
					System.out.println(e);
				}
			}
		}
	}

	public void addData() {
		System.out.println("---Sinh dữ liệu giả lập---");
		System.out.print("->Số lượng thực thể: ");
		int E = scanner.getInputNum(100000000);
		System.out.print("->Số lượng quan hệ: ");
		int R = scanner.getInputNum(100000000);
		System.out.println("    Sinh " + E + " thực thể và " + R + " quan hệ");
		long timeStart = System.currentTimeMillis();
		this.randomAddData(E, R);
		long timeEnd = System.currentTimeMillis();
		System.out.println("Thời gian thực hiện: " + (Long) (timeEnd - timeStart));
	}
}
