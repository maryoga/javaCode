package IOData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * @author: Francisco Ramirez > @XXXKaos (GitHub)
 * En esta aplicacion trabajamos con el sistema de
 * archivos del sistema operativo para poder crear,
 * y leer archivos a través de codigo Java
 */

public class MainApp {

	public static void main(String[] args) {

		// invoke writer method
		FileWriter fw = new FileWriter();
		fw.stringBufferWritter();

		// Read file txt
		try {

			String srcFile = "the-file-name.txt";
			BufferedReader br = new BufferedReader(new FileReader(srcFile));
			String text = null;

			// Iterator to read data from file .txt
			while ((text = br.readLine()) != null) {
				System.out.println(text);
			}
			br.close(); // closing BufferedReader object

		} catch (IOException e) {
			System.out.println("Error: " + e);
		}

	}

}
