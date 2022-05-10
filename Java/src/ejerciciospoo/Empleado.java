package ejerciciospoo;

public class Empleado {

	//DEFAULT CONSTRUCTOR
	public Empleado() {
		
	}
	
	//CONSTRUCTOR CON UN PARAMETRO
	public Empleado(String nif) {
		this.nif=nif;
	}
	
	// **SETTERS AND GETTERS**
	
	//SET CASADO
	public void setCasado(char casado) {
		this.casado=casado;
	}
	
	//GET CASADO
	public char getCasado() {
		return this.casado;
	}
	
	//SET HORAS EXTRA
	public void setHorasExtra(int horasExtra) {
		this.horasExtra=horasExtra;
	}
	
	//GET HORAS EXTRA
	public int getHorasExtra() {
		return this.horasExtra;
	}
	
	//SET NIF
	public void setNIF(String nif) {
		this.nif=nif;
	}
	
	//GET NIF
	public String getNIF() {
		return this.nif;
	}
	
	//SET NOMBRE
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	//GET NOMBRE
	public String getNombre() {
		return this.nombre;
	}
	
	//SET SUELDO BASE
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase=sueldoBase;
	}
	
	//GET SUELDO BASE
	public double getSueldoBase() {
		return this.sueldoBase;
	}
	
	//SET TIPO IRPF
	public void setIRPF(double tipoIRPF) {
		this.tipoIRPF=tipoIRPF;
	}
	
	//GET TIPO IRPF
	public double getIRPF() {
		return this.tipoIRPF;
	}
	
	//SET NUMERO DE HIJOS
	public void setNumHijos(int numHijos) {
		this.numHijos=numHijos;
	}
	
	//GER NUMERO DE HIJOS
	public int getNumHijos() {
		return this.numHijos;
	}
	
	
	//CAMPOS DE CLASE
	@SuppressWarnings("unused")
	private static double pagoPorHora; //atributo de la clase empleado
	private String nif;
	private String nombre;
	private double sueldoBase;
	private int horasExtra;
	private double tipoIRPF;
	private char casado; //S-N
	private int numHijos;
	
	
	
}
