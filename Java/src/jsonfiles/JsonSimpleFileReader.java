package jsonfiles;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSimpleFileReader {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser parser = new JSONParser();
		
		try(Reader reader = new FileReader ("C:\\dev tools\\jsonsample.json"))
		{
			JSONObject jsonObject = (JSONObject) parser.parse(reader);
			System.out.println(jsonObject);
			
			System.out.println();
			
			String name = (String) jsonObject.get("name");
			System.out.println("name: " +name);
			
			long age = (Long) jsonObject.get("age");
			System.out.println("age: " + age);
			
			System.out.println();
			
			//LOOP ARRAY
			JSONArray cities =  (JSONArray) jsonObject.get("cities");
			Iterator<String> iterator = cities.iterator();
			
			while (iterator.hasNext()) 
			{
				System.out.println(iterator.next());
			}
			
		}
		
		catch (IOException e) {e.printStackTrace();}
		catch (ParseException e) {e.printStackTrace();}
	}

}
