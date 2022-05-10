package poo;

public class UsoVehiculo {
	
	public static void main(String[] args) {
	
	Coche coche1 = new Coche();
	coche1.setColor("Rojo");
	
	Furgoneta furgoneta1 = new Furgoneta(7, 580);
	furgoneta1.setColor("blanco");
	furgoneta1.setAsientosCuero("si");
	furgoneta1.setClimatizador("si");
	
	System.out.println(coche1.getDatosGenerales());
	System.out.println(furgoneta1.getDatosGenerales()
			+ furgoneta1.getDatosFurgoneta());
	}

}
