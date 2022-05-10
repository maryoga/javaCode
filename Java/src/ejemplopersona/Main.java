package ejemplopersona;

public class Main {
	
	public static void main(String[] args) {
		
		Persona [] personas = new Persona[2];
		personas[0] = new Empleado("Francisco", 18000, 1996, 13, 03);
		personas[1] = new Alumno("Lazaro Jardon", "Ingenieria Electronica");
		
		//Imprime valores de los objetos
		for(Persona p: personas) {
			System.out.println(p.getNombre() + ", " + p.getDescripcion());
			
		}
	}

}
