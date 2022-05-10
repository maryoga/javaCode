package basics;

import basics.TiposEnumerados.Direcciones;

public class TiposEnumerados{
	
	//Declaracion de tipos enumerados
	enum Direcciones {NORTE, SUR, ESTE, OESTE}
	
	public static void main(String[] args) {
		
		Barco barco = new Barco();
		barco.setOrientacion(Direcciones.NORTE);
		System.out.println(barco.getOrientacion());
		System.out.println("");
		
		//ITERAR EL VALOR DE LAS DIRECCIONES
		System.out.println("El contenido de direcciones es: ");
		
		for(Direcciones dir : Direcciones.values()){
			System.out.println("> "+ dir);
		}
	}
}

	//CLASE BARCO

class Barco{
	
	 private Direcciones orientacion;
	
	 //Metodo set Orientacion
	public void setOrientacion(Direcciones s) {
		orientacion = s;
	}
	
	// Metodo get Orientacion
	public Direcciones getOrientacion() {
		return orientacion;
	}
}
 