package poo;
//Hereda de la clase Coche > super clase. Fugoneta > clase hijo

@SuppressWarnings("unused")
public class Furgoneta extends Coche{

	//CAMPOS DE CLASE
	private int capacidad_carga;
	private int plazas_extra;
	
	//CONSTRUCTOR
	public Furgoneta (int plazas_extra, int capacidad_carga) {
		
		super(); //Llamar al constructor de la clase padre (Coche)
		this.capacidad_carga=capacidad_carga;
		this.plazas_extra=plazas_extra;
	}
	
	//Metodo Getter DatosFurgoneta
	
	public String getDatosFurgoneta() {
		return " La capidad de carga es: " + this.capacidad_carga + " kg"+
				", y las plazas son : " + this.plazas_extra;
	}
}
 