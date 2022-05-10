package voidsample;

public class Metodos {
	
	void saluda() {
		System.out.println("Hola!");
	}
	
	public static void main(String[] args) {
		// void indica que el metodo no regresa valor
		//ES DECIR QUE ESTE METODO SOLO EJECUTA UNA FUNCION.
		
		Metodos obj = new Metodos();
		obj.saluda();
	}

}
