package ejerciciospoo;

import java.util.Scanner;

public class AppLibro {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Variables
		String titulo, autor;
		int ejemplares;

		Libro lib1 = new Libro("El quijote", "Cervantes", 1, 0);
		Libro lib2 = new Libro();

		System.out.println("Introduce el nombre del libro: ");
		titulo = sc.nextLine();
		System.out.println("Introduce autor:");
		autor = sc.nextLine();
		System.out.println("Numero de ejemplares:");
		ejemplares = sc.nextInt();

		// Asigna valores a lib2
		lib2.setAutor(autor);
		lib2.setEjemplares(ejemplares);
		lib2.setTitulo(titulo);
		
		System.out.println();

		// MOSTRAR POR PANTALLA LOS DATOS DEL LIBRO 1
		System.out.println("Libro 1:");
		System.out.println("Titulo: " + lib1.getTitulo());
		System.out.println("Autor: " + lib1.getAutor());
		System.out.println("Ejemplares: " + lib1.getEjemplares());
		System.out.println("Prestados: " + lib1.getEjemplaresPrestados());

		// SE REALIZA UN PRESTAMO DE LIBRO 1. EL METODO DEVUELVE TRUE SI SE HA PODIDO
		if (lib1.Prestamo()) {
			System.out.println("Se ha prestado el libro: " + lib1.getTitulo());
		} else {
			System.out.println("No quedan ejemplares del libro: " + lib1.getTitulo());
		}
		
		System.out.println();
		
		//SE REALIZA OTRO PRESTAMO DE LIBRO 1. EN ESTE CASO NO SE PODRA REALIZAR 
		//YA QUE SOLO HAY UN EJEMPLAR DE ESTE LIBRO, Y YA ESTA PRESTADO. SE MUESTRA
		//EL MENSAJE NO QUEDAN LIBROS
		
		if(lib1.Prestamo()) {
			System.out.println("Se ha prestado el libro: " + lib1.getTitulo());
		}else
		{
			System.out.println("No quedan ejemplares del libro: " + lib1.getTitulo());
		}
		
		System.out.println();
		
		//MOSTRAR DATOS DEL LIBRO 1
		System.out.println("Libro 1:");
		System.out.println("Titulo: " + lib1.getTitulo());
		System.out.println("Autor: " + lib1.getAutor());
		System.out.println("Ejemplares: " + lib1.getEjemplares());
		System.out.println("Prestados: " + lib1.getEjemplaresPrestados());
		System.out.println();
		
		//MOSTRAR DATOS DEL LIBRO 2
		System.out.println("Libro 2:");
		System.out.println("Titulo: " + lib2.getTitulo());
		System.out.println("Autor: " + lib2.getAutor());
		System.out.println("Ejemplares: " + lib2.getEjemplares());
		System.out.println("Prestados: " + lib2.getEjemplaresPrestados());
		System.out.println();
	}
}
