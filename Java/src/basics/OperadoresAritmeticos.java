package basics;

/*
 * En este programa trabajamos con operadores aritmeticos.
 * @author: Francisco Ramirez > @XXXKaos (GitHub)
 */

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int a = 3, b = 2;

		// SUMA
		int c = a + b;
		System.out.println("c = " + c);

		// Otro ejemplo de como cacatenar operaciones de dos variables
		System.out.println("resultado: " + (a + b));

		// RESTA
		int d = a - b;
		System.out.println("d = " + d);

		System.out.println("resultado resta: " + (a - b));
		
		int e = a*b;
		System.out.println("e = " + e);
		
		double f = 3D /b; // 3D es el valor de 3, pero indicando que es Double
		System.out.println("f = " + f);
		
		int g = a%b;
		System.out.println("g = " + g);
		
		//SABER SI UN NUMERO ES PAR
		int z = 7 % 2;
		if(z ==  0) 
		{
			System.out.println("El numero es par");
		}else 
		{
			System.out.println("El numero es impar");
		}
	}

}
