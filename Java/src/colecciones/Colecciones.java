package colecciones;

import java.util.ArrayList;


public class Colecciones {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		ArrayList c1 = new ArrayList();
		
		//Metodo para insertar elementos a la coleccion
		c1.add("Hola");//posicion 0
		c1.add("adios");
		c1.add(5);
		c1.add(3);
		
		//Cast de objeto a variable tipo Integer
		Integer a = (Integer) c1.get(2);
		System.out.println(a);
		
		//Cast de objeto a variable tipo Integer
		Integer b = (Integer) c1.get(3);
		System.out.println(b);
		
		System.out.println("\n");
		
		//Array de Numero entero, array de tipo String
		
		ArrayList <String> c2 = new ArrayList<String> ();
		
		c2.add("Javier");
		c2.add("Francisco");
		c2.add("Cadena");
		
		System.out.println("El tamano de la coleccion 2 es: " + c2.size());
		System.out.println();
		
		//Limpiar una coleccion
		c1.clear();
		System.out.println(c1);
		System.out.println();
		
		//Si una coleccion contiene un metodo
		System.out.println(c2.contains("Francisco"));
		System.out.println();
		
		//Iterar elementos de c2 con un loop
		
		for(String elemento: c2) {
		System.out.println(elemento);
		}
		
		
	}

}
