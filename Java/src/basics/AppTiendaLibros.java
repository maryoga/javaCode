package basics;
import java.util.Scanner;

/*
 * En esta aplicacion creamos una tienda de Libros, donde trabajamos
 * con escaneres, y concatenacion de valores.
 * 
 * @uthor: Francisco Ramirez > @XXXKaos (GitHub)
 */

public class AppTiendaLibros {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el simbolo:");
        char simbolo = scanner.nextLine().charAt(0);
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
 
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
		
	}

}
