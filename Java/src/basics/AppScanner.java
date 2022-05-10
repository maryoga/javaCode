package basics;

/*
 * En esta clase trabajamos con el uso del objeto de la clase Scanner
 * para poder leer valores a traves del teclaso (input).
 * 
 * @author: Francisco Ramirez > @XXXKaos (GitHub)
 */

import java.util.Scanner;

public class AppScanner {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String usuario = sc.nextLine();
		String saludar ="Saludos!";
		System.out.println(saludar + " " + usuario);
		
	}

}
