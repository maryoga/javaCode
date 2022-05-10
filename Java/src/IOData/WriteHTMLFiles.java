package IOData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteHTMLFiles {

	public static void main(String[] args) throws IOException{
		
		//Stream connectivity
		File f = new File("MyHTMLFile.html");
		FileWriter fw =  new FileWriter(f, false);
		BufferedWriter writer = new BufferedWriter(fw);
		
		//Writing inside the file
		writer.write("<html> <body>"
				+ "<title> WebPage made it in Java</title>"
				+ "<h1> Kaos Webpage </h1>"
				+ "<p> Esto es un parrafo para ver si funciona esto </p>"
				+ "</body> </html>");
		
		//Close stream
		writer.close();
		
		System.out.println("\t<<HTML File was created!>>");

	}

}
