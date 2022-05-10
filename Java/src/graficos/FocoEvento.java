package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FocoEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFoco miMarco = new MarcoFoco();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoFoco extends JFrame{
	
	public MarcoFoco() {
		setVisible(true);
		setBounds(700, 300, 600, 450);
		add(new LaminaFoco());
	}
	
}

class LaminaFoco extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//hay que invalidar el layout, invalidar el valor que le da java a los objetos que posicionamos dentro de un marco (frame)
		setLayout(null);
		
		//usalmos el constructor por default y con esto ya tenemos instanciados los 2 cuadros de texto
		cuadro1 = new JTextField();
		cuadro2 = new JTextField();
		
		//a continuación le daremos posición y dimensión a los cuadros de texto, ya que hemos invalidado antes con setLayout(null) su tamaño y posic
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);
		
		//agregar los textbox a la lamina
		add(cuadro1);
		add(cuadro2);
		
		//crear una instancia de la clase LanzaFocos
		LanzaFocos elFoco = new LanzaFocos();
		
		//cuadro1 estará a la escucha de los eventos, usamos como argumento la instancia de la clase oyente "elFoco"
		cuadro1.addFocusListener(elFoco);
		
	}
	
	//para acceder a los cuadros necesitamos tener la clase oyente como una clase interna LanzarFocos, para ello la encapsulamos usando
	//la clausula private
	private class LanzaFocos implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			//System.out.println("El objeto ha perdido el foco");
			String email = cuadro1.getText();
			
			boolean comprobacion = false;
			
			for(int i=0; i < email.length(); i++) {
				//evaluar caracter a caracter si lo que escribimos es una @
				if(email.charAt(i) == '@') {
					comprobacion = true;
				}
			}
			
			if(comprobacion) {
				System.out.println("email correcto");
			}else{
				System.out.println("email incorrecto");
			}
		}
		
	}
	
	
	//2 variables objeto de tipo JTextField, están declaradas a nivel de clase
	JTextField cuadro1;
	JTextField cuadro2;

	
}


