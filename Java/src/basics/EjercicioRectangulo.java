package basics;

import java.util.Scanner;

/*
 * En este programa calculamos el area de un triangulo
 * @author: Francisco Ramirez > @XXXKaos (GitHub)
 */

public class EjercicioRectangulo {

	@SuppressWarnings("resource")
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // Escribe tu solucion aqui
	        System.out.println("Proporciona el alto:");
	        int alto = Integer.parseInt(scanner.nextLine());
	        System.out.println("Proporciona el ancho:");
	        int ancho = Integer.parseInt(scanner.nextLine());
	        int area = alto * ancho;
	        int perimetro = (alto + ancho) * 2;
	        System.out.println("Area: " + area);
	        System.out.println("Perimetro: " + perimetro);
	    }
}
