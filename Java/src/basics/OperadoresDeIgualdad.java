package basics;

/*
 * En este programa trabajamos con los operadores de igualdad y desigualdad
 * @author: Francisco Ramirez > @XXXKaos (GitHub)
 */

public class OperadoresDeIgualdad {

	public static void main(String[] args) {
		
		//Comparacion de tipo numerico
		int a = 3, b = 3;
		boolean c = (a != 3); // false porque no es distinto
		System.out.println("El resultado es: " + c);
		
		//Comparacion de tipo objeto (String) o cadena
		String d = "Hola", e = "Adios";
		boolean f = d.equals(e);
		System.out.println("El resultado es: " + f);
		
		boolean g = (a <= b);
		System.out.println("El resultado es :" + g);
		
		//Comparacion con sentencias de control
		
		int edad=24;
		int adulto=18;
		
		if(edad >= adulto) 
		{
			System.out.println("Es un adulto");
		}else
		{
			System.out.println("Es menor de edad");
		}
	}
}
