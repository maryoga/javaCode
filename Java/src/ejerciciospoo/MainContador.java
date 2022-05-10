package ejerciciospoo;

import java.util.Scanner;

public class MainContador {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Utilizar el controlador por defecto
		Contador contador1 = new Contador();
		
		int n;
		System.out.println("Introduce el valor para inicializar el contador: ");
		n=sc.nextInt();
		
		//Asignar valor al contador
		contador1.setCont(n);
		
		//Incrementar el valor actual
		contador1.incrementar();
		
		//Mostrar el valor actual del contador 1
		System.out.println(contador1.getCont());
		
		contador1.incrementar();
		contador1.incrementar();
		
		//Mostrar el valor actual del contador 1
		System.out.println(contador1.getCont());
		
		//Decrementar el valor actual del contador 1
		contador1.decrementar();
		
		//Mostrar el valor actual del contador 1
		System.out.println(contador1.getCont());
		
        //crear un nuevo objeto Contador con valor inicial 10
        Contador contador2 = new Contador(10);
       
        //incrementar y decrementar el contador2 y mostrar su valor
        contador2.incrementar();
        System.out.println(contador2.getCont());
        contador2.decrementar();
        System.out.println(contador2.getCont());

        //crear un objeto Contador utilizando el constructor copia
        //se crea el objeto contador3 como copia de contador2
        Contador contador3 = new Contador(contador2);

        //mostrar el valor de contador3
        System.out.println(contador3.getCont());
		
	}
}
