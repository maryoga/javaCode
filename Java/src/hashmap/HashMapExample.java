package hashmap;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<String, Integer> people = new HashMap<String,Integer>();
		
		
		// Add keys and values (Name, age)
		people.put("John", 23);
		people.put("Martha", 21);
		people.put("Katherine", 22);
		people.put("Christopher", 30);
		
		//LOOP people
		
		for(String s: people.keySet()) {
			System.out.println("name: " + s + ", age: " + people.get(s));
		}
	}

}
