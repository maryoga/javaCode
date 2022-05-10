package ejerciciospoo;

import java.util.Scanner;

public class MainCuenta {

	@SuppressWarnings({ "unused", "resource" })
	public static void main (String[]args) {
		// CREAMOS SCANNER
		Scanner sc = new Scanner(System.in);

		// VARIABLES
		String nombreCliente, numCuenta;
		double tipoInteres, saldo;

		// CREAMOS OBJETO CUENTA #1 DE TIPO CUENTA: EJERCICIOCUENTA
		EjercicioCuenta cuenta1 = new EjercicioCuenta();

		// PEDIMOS VALORES
		System.out.println("Nombre: ");
		nombreCliente = sc.nextLine();
		System.out.println("Numero de cuenta: ");
		numCuenta = sc.nextLine();
		System.out.println("Tipo de Interes: ");
		tipoInteres = sc.nextDouble();
		System.out.println("Saldo: ");
		saldo = sc.nextDouble();
		System.out.println();

		cuenta1.setNombreCliente(nombreCliente);
		cuenta1.setNumCuenta(numCuenta);
		cuenta1.setTipoInteres(tipoInteres);
		cuenta1.setSaldo(saldo);

		// CREAMOS EL OBJETO DE TIPO CUENTA #2, CON EL CONSTRUCTOR CON PARAMETROS
		EjercicioCuenta cuenta2 = new EjercicioCuenta("Francisco Ramirez", "1234567890", 1.75, 500);

		// CREAMOS EL OBJECTO TIPO CUENTA #3, CON EL CONSTRUCTOR COPIA CUENTA #1
		EjercicioCuenta cuenta3 = new EjercicioCuenta(cuenta1);

		// MOSTRAR LOS DATOS DE LA CUENTA #1
		System.out.println("Datos de la cuenta #1:");
		System.out.println("Nombre del titular: " + cuenta1.getNombreCliente());
		System.out.println("Numero de cuenta: " + cuenta1.getNumCuenta());
		System.out.println("Tipo de Interes:" + cuenta1.getTipoInteres());
		System.out.println("Saldo: " + cuenta1.getSaldo());
		System.out.println();

		// REALIZA UN INGRESO EN LA CUENTA #1
		System.out.println("#### REALIZANDO INGRESO A LA CUENTA #1 ###\n");
		cuenta1.ingreso(4000);

		// MOSTRAR EL SALDO EN CUENTA #1 DESPUES DEL INGRESO
		System.out.println("Saldo Cuenta #1: " + cuenta1.getSaldo());
		System.out.println();

		// MOSTRAR LOS DATOS DE LA CUENTA #2
		System.out.println("Datos de la cuenta #2:");
		System.out.println("Nombre del titular: " + cuenta2.getNombreCliente());
		System.out.println("Numero de cuenta: " + cuenta2.getNumCuenta());
		System.out.println("Tipo de Interes:" + cuenta2.getTipoInteres());
		System.out.println("Saldo: " + cuenta2.getSaldo());
		System.out.println();

		// MOSTRAR LOS DATOS DE LA CUENTA #3
		System.out.println("Datos de la cuenta #3:");
		System.out.println("Nombre del titular: " + cuenta3.getNombreCliente());
		System.out.println("Numero de cuenta: " + cuenta3.getNumCuenta());
		System.out.println("Tipo de Interes:" + cuenta3.getTipoInteres());
		System.out.println("Saldo: " + cuenta3.getSaldo());
		System.out.println();
		
		//REALIZA UNA TRANSFERENCIA DE 100 DE LA CUENTA 3 A LA CUENTA 2
		cuenta3.transferencia(cuenta2, 100);
		
		// REALIZA UN INGRESO EN LA CUENTA #1
		System.out.println("#### REALIZANDO INGRESO A LA CUENTA #2 ###\n");
				
		//MOSTRAR EL SALDO DE LA CUENTA #2
		System.out.println("Saldo de la Cuenta 2:");
		System.out.println("Saldo: " + cuenta2.getSaldo());
		System.out.println();
		
		//MOSTRAR EL SALDO DE LA CUENTA #3
		System.out.println("Saldo de la cuenta 3:");
		System.out.println("Saldo:" + cuenta3.getSaldo());
		System.out.println();
	}
}
