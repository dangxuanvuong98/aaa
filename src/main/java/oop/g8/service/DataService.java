package oop.g8.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class DataService {
	/*
	7	P - P
	8	P - C
	9	P - O
	10	O - E
	11	O - L
	12	L - E
	13	L - P
	14	C - E
	15	C - O
	16	E - P
	17	E - O
	18	E - L
	19	T - P
	20	T - T*/
	    public  List<String> p2p;
	    public  List<String> p2c;
	    public  List<String> p2o;
	    public  List<String> o2e;
	    public  List<String> o2l;
	    public  List<String> l2e;
	    public  List<String> l2p;
	    public  List<String> c2e;
	    public  List<String> c2o;
	    public  List<String> e2p;
	    public  List<String> e2o;
	    public  List<String> e2l;
	    public  List<String> t2p;
	    public  List<String> t2t;
	    public  DataService(){
	        p2p = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\relation\\00"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					p2p.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }
	        

	        p2c = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\relation\\02"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					p2c.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }


	        p2o = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\relation\\01"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					p2o.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }

	        o2e = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\relation\\14"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					o2e.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }

	        o2l = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\relation\\13"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					o2l.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }

	        l2e = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\relation\\34"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					l2e.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }

	        l2p = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\relation\\30"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					l2p.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }

	        c2e = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\relation\\24"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					c2e.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }

	        c2o = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\relation\\21"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					c2o.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }

	        e2p = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\relation\\40"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					e2p.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }

	        e2o = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\relation\\41"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					e2o.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }

	        e2l = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\relation\\43"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					e2l.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }



	        t2p = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\relation\\50"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					t2p.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }


	        t2t = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("C:\\Users\\Hoang Nam\\Documents\\CODE-SOURCE\\STS3.9\\OopPro\\src\\main\\resources\\rawData\\relation\\55"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					t2t.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }
	    }
	    
	}

