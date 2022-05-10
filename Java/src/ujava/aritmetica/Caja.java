package ujava.aritmetica;

public class Caja {
	
	//CONSTRUCTOR VACIO
	public Caja() {
		
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public Caja(int ancho, int alto, int profundo) {
		this.ancho=ancho;
		this.alto=alto;
		this.profundo=profundo;
	}
	
	//METODO CALCULAR VOLUMEN
	public int calcularVolumen() {
		int resultado = (this.alto*this.ancho*this.profundo);
		return resultado;
	}
	
	
	//CAMPOS DE CLASE
	protected int ancho, alto, profundo;

}
