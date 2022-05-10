package ejemplostatic;

public class Persona {
	
	//CONTRUCTOR PERSONA
	public Persona() {
		contadorPersonas++;
	}
	
	//CONTRUCTOR PERSONA #2
	public Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
		contadorPersonas++;
	}

	//CAMPOS DE CLASE
	private String nombre;
	private int edad;
	static int contadorPersonas; //campo global o de clase declarado como static
	
	
	//METODO SET NOMBRE
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	//METODO GET NOMBRE
	public String getNombre() {
		return this.nombre;
	}
	
	//METODO SET EDAD
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	//METODO GET EDAD
	public int getEdad() {
		return this.edad;
	}
	
	
	//METODO STATIC GET CONTADOR DE PERSONAS
	public static int getContadorPersonas() {
		return contadorPersonas;
	}
	
	//METODO ESTABLECE CONTADOR DE PERSONAS: ES ESTATICO PORQUE SE COMPARTE PARA TODOS LOS OBJETOS
	public static void setContadorPersonas(int contadorPersonas) {
		Persona.contadorPersonas = contadorPersonas;
		//Campo estatico de la clase persona = contador parametro
	}
	
}
