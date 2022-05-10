package basics;

/*
 * En este programa trabajamos con operadores condicionales
 * @author: Francisco Ramirez > @XXXKaos (GitHub)
 */

public class OperadoresCondicionales {

	public static void main(String[] args) {

		int a = 10;
		int valorMinimo = 0, valorMaximo = 10;
		
		if( a >= valorMinimo && a <= valorMaximo) 
		{
			System.out.println("dentro de rango");
		}else
		{
			System.out.println("fuera de rango");
		}
		
		
		//Si un padre esta de vacaciones o tiene dia de descanso puede asistir a...
		boolean vacaciones = false;
		boolean diaDescanso = false;
		
		if(vacaciones || diaDescanso)
			System.out.println("Padre puede asistir al juego de su hijo");
		else
			System.out.println("El padre esta ocupado");
	}

}
