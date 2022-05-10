package abstractsample;

//Clase controladora para los objetos de DVD y Libros
public class PruebaProducto {

	public static void main(String[] args) {
		Libro miLibro = new Libro("La Ciudad de las bestias.", 350, 150);
		DVD miDVD = new DVD("I Robot", 200, 135.50);
		
		System.out.println("Los datos de mis productos son:");
		System.out.println(miDVD.imprimirDatos());
		System.out.println(miLibro.imprimirDatos());
	}
}
