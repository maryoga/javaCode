package basics;

/*
 * En este programa vamos a trabajar con el operador ternario
 * @author: Francisco Ramirez > @XXXKaos (GitHub)
 */


public class OperadorTernario {

	public static void main(String[] args) {
		
		int numero = 10;
		
		//Variable con operador ternario - ? opcion : opcion
		String resultado = (numero % 2 ==0) ? "es numero par" : "es numero impar";
		System.out.println(resultado);
		
		System.out.println();
		
		//ahora con valor boolean
		boolean par = (numero % 2 == 0 ) ? true : false;
		
		if(par) // <-- es  lo mismo que decir: par==true 
			System.out.println("numero par");
		else
			System.out.println("numero impar");
		
	}

}
