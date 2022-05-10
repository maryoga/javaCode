package IOData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {

	public static void main(String[] args) throws IOException {

		// Stream Connectivity
		File f = new File("myNumbers.csv"); // the path of the file es root of the project
		FileWriter fw = new FileWriter(f, true); // true means you can append new text into the same file.
		BufferedWriter writer = new BufferedWriter(fw);

		// Writing inside the file
		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 3; j++) {
				int num = (int) (Math.random() * 100);
				writer.write(num + ",");
			}
			writer.newLine();
		}

		// Close stream : you need to close de Strem
		writer.close();
		System.out.println("<<File created!>>");

	}

	/*
	 * Other way to write in .txt files: writer.write("Anything"); writer.newLine();
	 * writer.write(Anything);
	 */

}
