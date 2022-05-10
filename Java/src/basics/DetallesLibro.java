package basics;

import java.util.Scanner;

/*
 * Este ejercicio es para crear un programa que lea por teclado
 * el autor y el titulo de un libro y despues lo imprima en consola
 * 
 * @author: Francisco Ramirez > @XXXKaos (GitHub)
 */

public class DetallesLibro {

	@SuppressWarnings("resource") //suprime los warnings de la clase
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// Escribe tu solucion aqui
		System.out.println("Proporciona el titulo:");
		String titulo = scanner.nextLine();
		System.out.println("Proporciona el autor:");
		String autor = scanner.nextLine();
		System.out.println(titulo + " fue escrito por " + autor);
	}

}
