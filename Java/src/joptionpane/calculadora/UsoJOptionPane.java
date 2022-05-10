package joptionpane.calculadora;

import javax.swing.JOptionPane;

/*
 * @author: Francisco Ramirez > @XXXKaos (GitHub)
 */

public class UsoJOptionPane {

	@SuppressWarnings("unused")
	private String opc1 = "", num1 = "", num2 = "",opc2="1";
	private int suma = 0, resta = 0;

	// METODO LEER OPCION
	public void leerOpcion() {
		
		while(Integer.parseInt(opc2)==1) 
		{
			
		opc1 = JOptionPane.showInputDialog(null, "Ingrese una opcion: \n (1): SUMA \n (2): RESTA");
		leerNumeros();
		menu();
		opc2 = JOptionPane.showInputDialog(null, "¿Desea continuar? \n (1): SI \n (2): NO");
		
		}
	}

	// METODO LEER NUMEROS
	public void leerNumeros() {
		num1 = JOptionPane.showInputDialog(null, "Ingerese el primer número");
		num2 = JOptionPane.showInputDialog(null, "Ingerese el segundo número");
	}

	// METODO MENU DE OPERACIONES
	public void menu() {
		if (Integer.parseInt(opc1) == 1) {
			suma = Integer.parseInt(num1) + Integer.parseInt(num2);
			JOptionPane.showMessageDialog(null, "La suma es: " + suma);
		} else {
			resta = Integer.parseInt(num1) - Integer.parseInt(num2);
			JOptionPane.showMessageDialog(null, "La resta es: " + resta);
		}

	}

}
