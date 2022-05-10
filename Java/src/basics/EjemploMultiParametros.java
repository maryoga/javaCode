package basics;

/*
 * @author: Francisco Ramirez > @XXXKaos (GitHub)
 * En este programa podemos ver como funciona el
 * concepto de multiples parametros para una funcion.
 */

public class EjemploMultiParametros {

	public static void main(String[] args) {

	}
	
	// Metodo sumador
	public int sumador(int ... varios) {
		int s=0;
		
		for (int i : varios) {
			s+=i;
		}
		
		return s;
		
	}

}
