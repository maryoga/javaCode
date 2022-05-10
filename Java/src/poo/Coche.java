package poo;

//clase coche (curso poo pildoras) video 28, 29, 30, 31, 32
public class Coche {

	//Campos de clase
	
	private int ruedas;
	private int largo;
	private int ancho;
	@SuppressWarnings("unused") //para quitar el warning
	private int motor;
	private double pesoPlataforma;
	
	//variables dependiendo del coche
	
	private String color;
	private double pesoTotal;
	private boolean asientosCuero, climatizador;
	
	
	
	//Constructor
	public Coche() {
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		pesoPlataforma=500;
		
	}
	
	
	//metodo GETTER para los datos generales
	public String getDatosGenerales() {
		return "El coche tiene: " + ruedas + " ruedas"
				+", mide: " + largo/1000 +" metros con un ancho de "
				+ ancho + " cm  y un peso de plataforma de " 
				+ pesoPlataforma + " kilos" + ", y es color: " + this.color + ".";
	}
	
	//metodo SETTER para el valor color
	
	public void setColor(String color) { //parametro color
		this.color=color;
		
	}
	
	//metodo GETTER para el color del coche
	
	public String getColor() {
		return "El color del coche es: " +color;
	}
	
	
	//Getter Asientos Cuero
	
	public String getAsientosCuero() {
		//this.asientosCuero apunta a la variable de clase
		if(asientosCuero==true) {
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asientos de serie";
		}
	}
	
	//Setter Asientos Cuero
	
	public void setAsientosCuero(String asientosCuero) {
		if(asientosCuero.equalsIgnoreCase("si")) {//si pasamos un si como parametro
			this.asientosCuero=true;
		}else {
			this.asientosCuero=false;//si pasamos un no como parametro
		}
	}
	
	//Setter Climatizador
	
	public void setClimatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}else {
				this.climatizador=false;
		}
	}
	
	//Getter Climatizador
	
	public String getClimatizador() {
		if (climatizador==true) {
			return "El coche tiene climatizador";
		}else {
			return "El coche no tiene climatizador";
		}
	}
	
	//Metodo Setter + Getter pesoTotal
	
	public String setPesoCoche() {
		int pesoCarroceria=500;
		this.pesoTotal=pesoPlataforma+pesoCarroceria;
		
		if(asientosCuero==true) {
			this.pesoTotal=pesoTotal+50;
		}
		
		if(climatizador==true) {
			this.pesoTotal=pesoTotal+20;
		}
		
		return "El peso del coche es: " + pesoTotal +" kgs.";
	}
	
	
	//Metodo Getter para el precio del coche
	
	public double getPrecioCoche() {
		int precioTotal=10000;
		
		if(asientosCuero==true) {
			precioTotal+=2000;
		}
		
		if(climatizador==true) {
			precioTotal+=1500;
		}
		
		return precioTotal;
	}
	
	
}
