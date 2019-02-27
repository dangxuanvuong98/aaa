package oop.g8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import oop.g8.generator.entity.CountryGenerator;
import oop.g8.generator.entity.EventGenerator;
import oop.g8.generator.entity.LocationGenerator;
import oop.g8.generator.entity.OrganizationGenerator;
import oop.g8.generator.entity.PersonGenerator;
import oop.g8.generator.entity.SourceGenerator;
import oop.g8.generator.entity.TimeGenerator;
import oop.g8.generator.relation.RelationshipGenerator;
import oop.g8.service.InitDB;
import oop.g8.service.QueryService;
import oop.g8.service.ScannerService;

/*
 * Entrypoint của chương trình
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

	private void readData() {
		SourceGenerator.getData("src/main/resources/rawData/entity/Source/domain_list");
		PersonGenerator.getData("src/main/resources/rawData/entity/Person/firstname_list",
				"src/main/resources/rawData/entity/Person/midname_list",
				"src/main/resources/rawData/entity/Person/lastname_list",
				"src/main/resources/rawData/entity/Person/job_list",
				"src/main/resources/rawData/entity/Person/des_element_list");
		OrganizationGenerator.getData("src/main/resources/rawData/entity/Organization/organization_name_list",
				"src/main/resources/rawData/entity/Organization/headquarters_list",
				"src/main/resources/rawData/entity/Organization/firstname_list",
				"src/main/resources/rawData/entity/Organization/midname_list",
				"src/main/resources/rawData/entity/Organization/lastname_list",
				"src/main/resources/rawData/entity/Organization/email_domain_list",
				"src/main/resources/rawData/entity/Organization/des_element1_list",
				"src/main/resources/rawData/entity/Organization/des_element2_list",
				"src/main/resources/rawData/entity/Organization/country_list");
		CountryGenerator.getData("src/main/resources/rawData/entity/Country/country_list",
				"src/main/resources/rawData/entity/Country/capital_list",
				"src/main/resources/rawData/entity/Country/des_element1_list",
				"src/main/resources/rawData/entity/Country/des_element2_list",
				"src/main/resources/rawData/entity/Country/des_element3_list");
		LocationGenerator.getData("src/main/resources/rawData/entity/Location/location_list",
				"src/main/resources/rawData/entity/Location/country_list",
				"src/main/resources/rawData/entity/Location/des_element_list");
		EventGenerator.getData("src/main/resources/rawData/entity/Event/venue_list",
				"src/main/resources/rawData/entity/Event/country_list",
				"src/main/resources/rawData/entity/Event/festival_name_list",
				"src/main/resources/rawData/entity/Event/product_name_list");
		TimeGenerator.getData("src/main/resources/rawData/entity/Time/special_day_list");
		RelationshipGenerator.getData("src/main/resources/rawData/relation");
		System.out.println("Read files: Done!");
	}

	private void showUI() {
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
	}

	@Override
	public void run(String... args) throws Exception {
		this.readData();
		this.showUI();
	}
}
