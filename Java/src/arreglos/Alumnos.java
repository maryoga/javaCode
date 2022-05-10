package arreglos;

import java.util.Scanner;

public class Alumnos {

	int arreglo[] = new int[4];

	// METODO IMPRIMIR EL TAMANO DEL ARREGLO
	public void imprimirTamanhoArreglo() {
		System.out.println("el tamaño del arreglo es: " + arreglo.length);
	}

	// METODO LEER EL ARREGLO
	@SuppressWarnings("resource")
	public void leerArreglo() {
		Scanner lector = new Scanner(System.in);
		for (int i : arreglo) {
			System.out.println("Ingrese la " + (i + 1) + " nota:");
			arreglo[i] = lector.nextInt();
		}
		
		imprimirArreglo();
	}

	// METODO IMPRIMIR EL ARREGLO
	public void imprimirArreglo() {
		System.out.println("Las notas del alumno son:");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
	}
}
