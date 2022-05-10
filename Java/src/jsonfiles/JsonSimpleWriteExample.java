package jsonfiles;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonSimpleWriteExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//JSON write an Object
		
		JSONObject jobj = new JSONObject();
		jobj.put("name", "Francisco Ramirez");
		jobj.put("age", 22);
		
		
		//JSON write an ArrayList
		
		JSONArray cities = new JSONArray();
		cities.add("Mexico");
		cities.add("USA");
		cities.add("England");
		cities.add("Germany");
		cities.add("Canada");
		
		jobj.put("cities", cities);
		
		try (FileWriter file = new FileWriter ("c:\\dev tools\\jsonsample.json"))
		{
			file.write(jobj.toJSONString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
