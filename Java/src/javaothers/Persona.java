package javaothers;

import java.util.Objects;

public class Persona {

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	// GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// CAMPOS DE CLASE
	private String nombre;
	private int edad;

	// METODO TO STRING
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	// METODO DE INTEFAZ EQUALS <E>
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}
		
		final Persona other = (Persona) obj;
		if (!Objects.equals(this.nombre, other.nombre)) {
			return false;
		}
		return true;
	}

	// METODO DE INTERFAZ HASHCODE
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 89 * hash + Objects.hashCode(this.nombre);
		return hash;
	}

}
