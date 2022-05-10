package basics;

import java.util.Scanner;

/*
 * En este programa trabajamos con la comparacion de variables
 * usando el operador ternario para evaluar cual numero es mayor.
 * 
 * @author: Francisco Ramirez > @XXXKaos (GitHub)
 */

public class EjercicioNumeroMayor {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Proporciona el numero 1:");
		int numero1 = scanner.nextInt();
		System.out.println("Proporciona el numero 2:");
		int numero2 = scanner.nextInt();
		System.out.println("El numero mayor es:");
		System.out.println(numero1 > numero2 ? numero1 : numero2); //opeardor ternario
		
	}
}
