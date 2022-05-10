package ejemplopersona;
import java.util.Date;
import java.util.GregorianCalendar;

@SuppressWarnings("unused")
public class Empleado extends Persona{
	
	//CONSTRUCCION METODO ABSTRACTO HERADADO DE PERSONA
	public String getDescripcion() {
		return "este empleado tiene un sueldo de: " + sueldo;
	}
	

	//CONSTRUCTOR EMPLEADO
	public Empleado(String nombre, double sueldo, int agno, int mes, int dia) {
		super(nombre);
		this.sueldo=sueldo;
		
		//Construir fecha con las variables de locales del metodo constructor
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		
		//Asignamos y devolvemos la fecha en formato gregorian
		fechaAlta=calendario.getTime();
	}
	
	
		
	//Metodo get Sueldo
	public double getSueldo() {
		return sueldo;
	}
	
	//Metodo get fechaAlta
	public Date getFechaAlta() {
		return fechaAlta;
	}
	
	//Metodo Setter sueldo
	public void setAumento(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	
	//CAMPOS DE CLASE
	private double sueldo;
	private Date fechaAlta;

}
