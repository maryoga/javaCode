package basics;

import java.util.Scanner;

/*
 * En este programa se muestra la conversion de datos primitivos.
 * @author: Francisco Ramirez > @XXXKaos (GitHub)
 */

public class ConversionDatosPrimitivos {

	@SuppressWarnings({ "resource", "unused" }) //suprimir los warnings
	public static void main(String[] args) {

		double valorPI = Double.parseDouble("3.14");
		System.out.println("valorPI = " + valorPI);

		// Donde 0 es el valor del indice
		char c = "hola".charAt(0);
		System.out.println("c =" + c);

		Scanner scanner = new Scanner(System.in);
		char caracter = scanner.nextLine().charAt(0);
		System.out.println("caracter = " + caracter);
		
		String valorPiTexto = String.valueOf(valorPI);
		System.out.println("Valor de pi en Texto = " + valorPiTexto);
		
		byte b = 10;
		short s = b;
		
		short s2 = 15;
		short b2 = (byte) s2;
		
	}

}
