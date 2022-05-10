package graficos;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frmPrueba miMarco = new frmPrueba();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class frmPrueba extends JFrame{
	
	public frmPrueba() {
		setBounds(500, 300, 600, 350);
		LaminaPrueba miLamina = new LaminaPrueba();
		add(miLamina);
		setVisible(true);
	}
}

class LaminaPrueba extends JPanel{
	
	public LaminaPrueba() {
		
		JTextField miCampo = new JTextField(20);
		
		EscuchaTxt el_evento = new EscuchaTxt();
		
		Document miDoc = miCampo.getDocument();
		
		//poner miDoc a la escucha, y pasarle una instancia a la clase que maneja esos eventos
		miDoc.addDocumentListener(el_evento);
		
		add(miCampo);
	}
	
	private class EscuchaTxt implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("Has insertado texto");
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has borrado texto");
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub			
			
		}
		
		
	}
}
