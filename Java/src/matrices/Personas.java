package matrices;

import java.util.Scanner;

//@author: Francisco Ramirez > @XXXKaos (GitHub)

public class Personas {

	// [fila][columna]
	String personas[][] = new String[3][2];
	String nombre, edad;

	// METODO PARA LEER EDAD Y NOMBRES
	@SuppressWarnings({ "unused", "resource" })
	public void leerPersonas() {
		
		Scanner lector = new Scanner(System.in);
		for (int i = 0; i < personas.length; i++) {
			System.out.println("Ingrese el nombre de la " + (i + 1) + " persona");
			nombre = lector.nextLine();
			System.out.println("Ingrese la edad de la " + (i + 1) + " persona");
			edad = lector.nextLine();
			personas[i][0] = nombre; //almacenamos el nombre
			personas [i] [1] = edad; //almacenamos la edad
			
		}
	}
	
	public void listarPersonas() {
		System.out.println("NOMBRE:						EDAD:");
		for(int i=0; i < personas.length; i++) { // FILAS
			for(int j=0; j < 2; j++) { //COLUMNAS
				System.out.println(personas[i][j] +"                             ");
			}
			System.out.println("");
		}
		
	}

}
