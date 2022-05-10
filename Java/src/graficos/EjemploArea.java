package graficos;

import java.awt.event.*;

import javax.swing.*;

public class EjemploArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		frmArea miMarco = new frmArea();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class frmArea extends JFrame{
	
	public frmArea() {
		
		setBounds(500, 300, 600, 350);
		LaminaArea miLamina = new LaminaArea();
		add(miLamina);
		setVisible(true);
		
	}
}

class LaminaArea extends JPanel{
	
	private JTextArea miArea;
	
	public LaminaArea() {
		
		miArea = new JTextArea(8, 20);
		
		//Agregar una lamina que tiene barras de Scroll, incluir en los parentesis el elemento que deseas con barras
		JScrollPane laminaBarras = new JScrollPane(miArea);				
		
		//cuando vas escribiendo y llegas al final del objeto en el extremo derecho, este ya no se ensancha por ponerlo
		//con setLineWrap a true
		miArea.setLineWrap(true);
		
		//En lugar de agregar miArea, agregar la lamina con barras a la lamina principal
		add(laminaBarras);
		
		JButton miBoton = new JButton("Dale");
		
		//Poner el boton a la escucha del evento Clic, entre parentesis va una instancia de la clase que implementa
		//el ActionListener o instanciar directamente la clase que implemente la interfaz ActionListener
		miBoton.addActionListener(new GestionaArea());
		
		//Agregar el boton a la lamina
		add(miBoton);
		
	}
	
	//clase interna GestionaArea
	private class GestionaArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//Rescatar el texto e immprimirlo en consola
			System.out.println(miArea.getText());
		}
		
		
	}
}
