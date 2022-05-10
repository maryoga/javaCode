package javaothers;

import java.util.HashSet;
import java.util.Set;

public class AppPersona {
	
	public static void main(String[] args) {
		
		//Creating Persona Hastable of type HastSet
		Set <Persona> personas = new HashSet <Persona>();
		
		//Creating Persona objects/instances
		Persona persona1 = new Persona("Adrian", 23);
		Persona persona2 = new Persona("Pablo", 22);
		Persona persona3 = new Persona("Juan", 30);
		Persona persona4 = new Persona("Martha", 21);
		Persona persona5 = new Persona("Adrian", 23); //Set no permite duplicados
		
		//Add Persona objects into HashSet personas
		personas.add(persona1);
		personas.add(persona2);
		personas.add(persona3);
		personas.add(persona4);
		personas.add(persona5);
		
		System.out.println("El tamaño del HashSet es: " + personas.size()+ "\n");
		
		//NOTA: ES NECESARIO EL METODO toString();
		System.out.println(personas);
		
		
		personas.remove(persona5);//Aqui borramos todos los Adrianes, aunque no se repitan
		System.out.println();
		
		//FOR-EACH Elementos de Personas
		for(Persona p: personas) {
			System.out.println(p);
		}
		
	}

}
