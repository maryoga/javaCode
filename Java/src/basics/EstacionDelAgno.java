package basics;

import java.util.Scanner;

/*
 * En este programa realizamos un ejercicio para calcular la
 * estacion del año segun el numero del mes, haciendo uso
 * de la sentencia de control if-else.
 * 
 * @author: Francisco Ramirez > @XXXKaos (GitHub)
 */

public class EstacionDelAgno {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero del mes: ");
		int mes = sc.nextInt();
		
		String estacion;
		
		if(mes == 1 || mes == 2 || mes == 12  )
			estacion="Invierno";
		else if (mes ==3 || mes == 4 || mes == 5)
			estacion="Primavera";
		else if (mes == 6 || mes == 7 || mes == 8)
			estacion="Verano";
		else if (mes == 9 || mes == 10 || mes == 11)
			estacion="Otoño";
		else
			estacion="Numero de mes fuera de rango";
		System.out.println("La estacion es: " + estacion);
	}

}
