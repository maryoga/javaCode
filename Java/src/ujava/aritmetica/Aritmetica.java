package ujava.aritmetica;

public class Aritmetica {
	
	//CAMPOS DE CLASE
	private int a;
	private int b;
	
	public Aritmetica(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int sumar() {
		return (a + b);
	}
	
	public int restar() {
		return (a - b);
	}
	
	public int multiplicar() {
		return (a * b);
	}
	
	public int dividir() {
		return (a / b);
	}
}
