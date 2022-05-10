package ejemplopersona;


public class Alumno extends Persona{
	
	public Alumno(String nombre, String carrera) {
		super(nombre);
		this.carrera=carrera;
	}
	
	//SOBREESCRIBIR EL METODO getDescripcion()
	public String getDescripcion() {
		return "Este alumno esta estudiado la carrera: " + this.carrera;
	}
	
	
	//CAMPOS DE CLASE
	private String carrera;
}
