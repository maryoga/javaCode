package ejerciciosddr1;

/*
 * 	Author: @XXXKaos (GitHub)
 * 	Francisco Ramirez
 * 	Twitter: @DeNyJaviier
 */

public class Main {
	
	public static void main(String[] args) {
		Libro lib1 = new Libro(12445, "Quixote", "Miguel de Cervantes", 885);
		Libro lib2 = new Libro(123456789, "La Ciudad de las Bestias", "Isabel Allende", 342);
		
		System.out.println(lib1.toString());
		System.out.println(lib2.toString());
		System.out.println();
		
		System.out.println(Libro.compareNumPag(lib1, lib2));
	}

}
