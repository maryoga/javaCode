package ejerciciospoo;

public class EjercicioCuenta {
	
	/*CONSTRUCTOR POR DEFECTO
	LA RAZON DE ESTE METODO ES PORQUE PODEMOS ACCEDER A LOS CAMPOS DE LOS OBJETOS
	Y MODIFICARLOS A TRAVES DE GET AND SET 
	*/
	public EjercicioCuenta() {
		
	}
	
	//CONSTRUCTOR CON LOS CAMPOS DE CLASE
	public EjercicioCuenta(String nombreCliente, String numCuenta, double tipoInteres, double saldo) {
		this.nombreCliente=nombreCliente;
		this.numCuenta=numCuenta;
		this.tipoInteres=tipoInteres;
		this.saldo=saldo;
	}
	
	//CONTRUCTOR COPIA
	public EjercicioCuenta(final EjercicioCuenta c) {
		nombreCliente = c.nombreCliente;
		numCuenta = c.numCuenta;
		tipoInteres = c.tipoInteres;
		saldo = c.saldo;
	}
	
	
	//METODOS SETTERS & GETTERS
	
	//SET nombreCliente
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente=nombreCliente;
	}
	
	//GET nombreCliente
	public String getNombreCliente() {
		return this.nombreCliente;
	}
	
	//SET numCuenta
	public void setNumCuenta(String numCuenta) {
		this.numCuenta=numCuenta;
	}
	
	//GET numCuenta
	public String getNumCuenta() {
		return this.numCuenta;
	}
	
	//SET tipoInteres
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres=tipoInteres;
	}
	
	//GET tipoInteres
	public double getTipoInteres() {
		return this.tipoInteres;
	}
	
	//SET saldo
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	
	//GET saldo
	public double getSaldo() {
		return this.saldo;
	}
	
	//METODO INGRESO
	public boolean ingreso(double n) { //Donde n es el monto que se le indique
		 boolean ingresoCorrecto = true;
		 if(n<0)
		 {
			 ingresoCorrecto=false;
		 }else
		 {
			 saldo = saldo + n;
		 }
		 
		 return ingresoCorrecto;
	}
	
	
	//METODO REINTEGRO
	public boolean reintregro(double n) { //Donde n es le monto que se le indique
		boolean reintegroCorrecto = true;
		if(n<0) 
		{
			reintegroCorrecto=false;
		}else if (saldo >= n)
		{
			saldo-=n;
		}else 
		{
			reintegroCorrecto = false;
		}
		return reintegroCorrecto;
	}
	
	//METODO TRANSFERENCIA
	public boolean transferencia(EjercicioCuenta c, double n) {
		boolean correcto = true;
		if(n<0) 
		{
			correcto = false;
		}else if(saldo >= n)
		{
			reintregro(n);
			c.ingreso(n);
		}else 
		{
			correcto = false;
		}
		
		return correcto;
		
	}
	
	//CAMPOS DE CLASE
	private String nombreCliente;
	private String numCuenta;
	private double tipoInteres;
	private double saldo;
	
}
