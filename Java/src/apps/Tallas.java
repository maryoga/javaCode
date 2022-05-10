package apps;

import java.util.Scanner;

//Trabajando tipos enumerados, video #48
public class Tallas {

	/*
	 * /Declarando tipos enumerados, solo puede guardar estos valores (ejemplo):
	 * enum talla{mini,mediano,grande,muygrande}; talla s=talla.mini; talla
	 * m=talla.mediano; talla l=talla.grande; talla xl=talla.muygrande;
	 */

	enum Talla {
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUYGRANDE("XL");
		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}

		// Getter abreviatura
		public String getAbreviatura() {
			return this.abreviatura;
		}

		private String abreviatura;
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUYGRANDE:");
		String input = scanner.nextLine().toUpperCase();
		
		Talla talla = Enum.valueOf(Talla.class, input);
		
		System.out.println("Talla: " + talla);
		System.out.println("Abreviatura: "+ talla.getAbreviatura());
	}

}
