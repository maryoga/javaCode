 package empleado;

import java.util.Arrays;

//CODIGO ALTERNATIVO PARA EL EJERCICIO DE MAIN
public class Uso_Empleado_Mejorado {

	public static void main(String[] args) {
		// Creando un arreglo de empleados
		Empleado[] misEmpleados = new Empleado[5];
		
		//Instancia de objeto Jefatura
		Jefatura jefe_RRHH = new Jefatura("Antonio Banderas", 35000, 2007, 4, 23);
		jefe_RRHH.setIncentivo(2500);
		
		
		// Inicializacion de los objetos del arreglo misEmpleados
		misEmpleados[0] = new Empleado("Francisco Ramirez", 15000, 2019, 06, 17);
		misEmpleados[1] = new Empleado("Martha Gonzalez", 25000, 2016, 12, 10);
		misEmpleados[2] = new Empleado("Hugo Lopez",2000, 2012, 03, 20);
		//USANDO LA SOBRECARGA DE CONSTRUCTORES
		misEmpleados[3] = new Empleado("Kath Lozano");
		misEmpleados[4] = jefe_RRHH; //polimorfismo:principio de sustitucion
				
		//TOMAR DECISIONES
		System.out.println(jefe_RRHH.tomarDecisiones("Aumentar dias de vacaciones"));
		
		//Set bonus
		System.out.println("El Jefe: "+ jefe_RRHH.getNombre() + " tiene un bonus de: " +jefe_RRHH.setBonus(500));
		System.out.println(misEmpleados[3].getNombre() + " tiene un bono de: " + misEmpleados[3].setBonus(200));
		
		//usar el principio de sustitución
		Empleado director_comercial = new Jefatura("Sandra", 85000, 2012, 05, 05);
		
		//validar si la instancia director_comercial pertenece a la clase Empleado
		if(director_comercial instanceof Empleado) {
			System.out.println("Es de tipo Jefatura");
		}
		
		Comparable ejemplo = new Empleado("Elizabeth", 95000, 2011, 06, 07);
		
		if(ejemplo instanceof Comparable) {
			System.out.println("Implementa la inferfaz Comparable");
		}
		
		//Modificado: Domingo 10-ABR-2022
		Arrays.sort(misEmpleados);
		
		
		// subirles el 5% a su sueldo utilizando un bucle for
		for (Empleado e : misEmpleados) {
			e.setAumento(5);
		}

		// imprime informacion de los empleados
		for (Empleado e : misEmpleados) {
			System.out.println("Nombre: " + e.getNombre() +
					", sueldo: " + e.getSueldo() + ", con fecha de alta: "
					+ e.getFechaAlta());
		}
	}

}
