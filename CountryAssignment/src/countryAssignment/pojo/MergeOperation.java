package countryAssignment.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class MergeOperation {
TreeMap<String, HashMap<String, ArrayList<Cities>>> addCities(){
	Cities c1= new Cities("Bhopal");
	Cities c2= new Cities("Indore");
	Cities c3= new Cities("Jabalpur");
	Cities c4= new Cities("Gwalior");
	Cities c5= new Cities("Gwalior");
	Cities c6= new Cities("Rewa");
	Cities c7= new Cities("Sagar");
	Cities c8= new Cities("Ratlam");
	Cities c9= new Cities("Chhindwara");
	Cities c10= new Cities("Dewas");
	//up
	Cities c11= new Cities("Lucknow");
	Cities c12= new Cities("Kanpur");
	Cities c13= new Cities("Ghaziabad");
	Cities c14= new Cities("Agra");
	Cities c15= new Cities("Meerut");
	Cities c16= new Cities("Varanasi");
	Cities c17= new Cities("Prayagraj");
	Cities c18= new Cities("Bareilly");
	Cities c19= new Cities("Moradabad");
	Cities c20= new Cities("Aligarh");
	//maharastra
	Cities c21= new Cities("mumbai");
	Cities c26= new Cities("PUNE");
	Cities c22= new Cities("NASHIK");
	Cities c23= new Cities("AURANGABAD");
	Cities c24= new Cities("NAGPUR");
	Cities c25= new Cities("DHULE");
	Cities c27= new Cities("JALGAON");
	Cities c28= new Cities("NANDED");
	Cities c29= new Cities("LATUR");
	Cities c30= new Cities("SOLAPUR");
	//odisa
	Cities c31= new Cities("Bhubaneshwar");
	Cities c32= new Cities("Cuttack");
	Cities c33= new Cities("Rourkela");
	Cities c34= new Cities("Angul");
	Cities c35= new Cities("Mayurbhanj");
	Cities c36= new Cities("Puri");
	Cities c37= new Cities("Sambalpur");
	Cities c38= new Cities("no name");

	Cities c39= new Cities("Brahmapur");
	
	Cities c40= new Cities("Vijayawada");
	//telangana
	Cities c41= new Cities("	Hyderabad");
	Cities c42= new Cities("	Warangal");
	Cities c43= new Cities("	Nizamabad");
	Cities c44= new Cities("	Khammam");
	Cities c45= new Cities("	Karimnagar");
	Cities c46= new Cities("	Ramagundam	");
	Cities c47= new Cities("	Miryalaguda");
	Cities c48= new Cities("	Jagtial");
	Cities c49= new Cities("	Mancherial");
	Cities c50= new Cities("	Adilabad");
	//add cities with state
	//mp
	ArrayList<Cities>CitiesMp = new ArrayList<>();
	CitiesMp.add(c1);
	CitiesMp.add(c2);
	CitiesMp.add(c3);
	CitiesMp.add(c4);
	CitiesMp.add(c5);
	CitiesMp.add(c6);
	CitiesMp.add(c7);
	CitiesMp.add(c8);
	CitiesMp.add(c9);
	CitiesMp.add(c10);
	//add cities of up
	ArrayList<Cities>citiesUp= new ArrayList<>();
	
	citiesUp.add(c11);
	citiesUp.add(c12);
	citiesUp.add(c13);
	citiesUp.add(c14);
	citiesUp.add(c15);
	citiesUp.add(c16);
	citiesUp.add(c17);
	citiesUp.add(c18);
	citiesUp.add(c19);
	citiesUp.add(c20);
	//maharashtra
	ArrayList<Cities>citiesMh= new ArrayList<>();
	citiesMh.add(c21);
	citiesMh.add(c22);
	citiesMh.add(c23);
	citiesMh.add(c24);
	citiesMh.add(c25);
	citiesMh.add(c26);
	citiesMh.add(c27);
	citiesMh.add(c28);
	citiesMh.add(c29);
	citiesMh.add(c30);
	//odisa
	ArrayList<Cities>citiesOr = new ArrayList<>();
	citiesOr.add(c31);
	citiesOr.add(c32);
	citiesOr.add(c33);
	citiesOr.add(c34);
	citiesOr.add(c35);
	citiesOr.add(c36);
	citiesOr.add(c37);
	citiesOr.add(c38);
	citiesOr.add(c39);
	citiesOr.add(c40);
	//telangana tg
	
	ArrayList<Cities>citiesTg= new ArrayList<>();
	
	citiesTg.add(c41);
	citiesTg.add(c42);
	citiesTg.add(c43);
	citiesTg.add(c44);
	citiesTg.add(c45);
	citiesTg.add(c46);
	citiesTg.add(c47);
	citiesTg.add(c48);
	citiesTg.add(c49);
	citiesTg.add(c50);
	//
	HashMap<String,ArrayList<Cities>> state= new HashMap<>();
	state.put("Madhya Pradesh", CitiesMp);
	state.put("Uttar Pradesh", citiesUp);
	state.put("Maharashtra", citiesMh);
	state.put("Odisha", citiesOr);
	state.put("Telangana ", citiesTg);
	//
	TreeMap<String,HashMap<String,ArrayList<Cities>>> country= new TreeMap<>();
	
	country.put("India", state);
	return country;
	
}
public static void main(String[] args) {
	MergeOperation mo=new MergeOperation();
	System.out.println(mo.addCities());}
}
