package empleado;

//Video de pildoras 33, 34, 35

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Crear Instancias de clase Empleado

		// Paso de parametros/argumentos
		Empleado emp1 = new Empleado("Francisco Ramirez", 15000, 2019, 06, 17);
		Empleado emp2 = new Empleado("Martha Gonzalez", 25000, 2016, 12, 10);
		Empleado emp3 = new Empleado("Hugo Lopez", 2000, 2012, 03, 20);
		
		emp1.setAumento(5);
		emp2.setAumento(10);
		emp3.setAumento(7);
		
		System.out.println("Nombre: " + emp1.getNombre() + ", sueldo: " + 
		emp1.getSueldo() + ", fecha de alta: " + emp1.getFechaAlta());
		
		System.out.println("Nombre: " + emp2.getNombre() + ", sueldo: " + 
				emp2.getSueldo() + ", fecha de alta: " + emp2.getFechaAlta());
		
		System.out.println("Nombre: " + emp3.getNombre() + ", sueldo: " + 
				emp3.getSueldo() + ", fecha de alta: " + emp3.getFechaAlta());

	}

}
