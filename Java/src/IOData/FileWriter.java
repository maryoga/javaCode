package IOData;

import java.io.IOException;
import java.io.PrintWriter;


public class FileWriter {
	
	//Metodo para escrirbir cadenas en un archivo
	
	public void stringBufferWritter(){
		
		try {
			@SuppressWarnings("resource") //suppress warnings
			PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
			writer.println("This is the first line of code");
			writer.println("the second line of data");
			writer.close(); //close writer
			
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}

		
	}

}
