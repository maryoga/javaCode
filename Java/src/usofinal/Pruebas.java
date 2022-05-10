package usofinal;

//Utilizacion de la palabra reservada final para las constantes
//Utilizacion de static el cual permite compartir los campos de una clase
//Los metodos static no actuan sobre los objetos, pertenecen a la clase

public class Pruebas {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Empleados emp1 = new Empleados("Francisco Ramirez");
		Empleados emp2 = new Empleados("Ana Vasquez");
		Empleados emp3 = new Empleados("Juan Valdez");
		
		emp1.setSeccion("Recursos Humanos");
		
		System.out.println(emp1.getDatos() + "\n"+ emp2.getDatos() + "\n" +
		emp3.getDatos());
		
		System.out.println(Empleados.getSiguienteId());
		
	}
}


class Empleados{
	
	//Constructor de Empleados
	public Empleados(String nombre) {
		this.nombre=nombre;
		seccion="Administracion";
		id=idSiguiente;
		idSiguiente++;
	}
	
	//Metodos setter y getter:
	
	//Metodo set seccion
	public void setSeccion(String seccion) {
		this.seccion=seccion;
	}
	
	//Metodo get Datos del empleado
	public String getDatos() {
		return "El nombre es: "+ this.nombre + 
				", y la seccion es: " + this.seccion
				+ ", y el ID es: "  + this.id;
	}
	
	//Metodo static
	public static String getSiguienteId() {
		return "el siguiente id es: " + idSiguiente;
	}
		
	//CAMPOS DE CLASE	
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente=1;
	
	
}