package ejemplostatic;


public class AppEstatico1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Persona p1 = new Persona("Enrique Valdez", 33);
	
		Persona p3 = new Persona("Julio Andrade",44);
		
		System.out.println("Se han creado: " + Persona.getContadorPersonas() +" personas.");
		

	}

}
