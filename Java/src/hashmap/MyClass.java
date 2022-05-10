package hashmap;

import java.util.HashMap;

/*
 * 	WORKING WITH HASHMPAS IN JAVA
 * 	@author: Francisco Ramirez
 */

public class MyClass {

	public static void main(String[] args) {
		
		//Creating a HashMap object called capitalCities
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		//Add Keys and values (Country, City)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		capitalCities.put("Argentina","Buenos Aires");
		
		System.out.println("HashMap Size: " + capitalCities.size());
		System.out.println(capitalCities + "\n");
		System.out.println(capitalCities.get("England"));
		
		capitalCities.remove("Argentina");
		
		//LOOP THROUGH A HASH MAP
		//keySet returns a set contained in this map
		for(String i: capitalCities.keySet()) {
			System.out.println(i);
		}
		
		System.out.println();
		
		//PRINT KEYS AND VALUES
		for(String s: capitalCities.keySet()) {
			System.out.println("key: " + s + " value: " + capitalCities.get(s));
		}
		
		
		
		
		
	}

}
