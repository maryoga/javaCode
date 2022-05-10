package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



public class PruebaComboBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoCombo miMarco = new marcoCombo();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class marcoCombo extends JFrame{
	
	public marcoCombo() {
		
		setBounds(550, 300, 500, 300);
		
		LaminaCombo miLamina = new LaminaCombo();
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaCombo extends JPanel{
	
	private JLabel texto;
	private JComboBox miCombo;
	
	public LaminaCombo() {
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("En un lugar de la mancha... ");
		
		texto.setFont(new Font("Serif", Font.PLAIN, 18));
		
		add(texto, BorderLayout.CENTER);
		
		JPanel laminaNorte = new JPanel();
		
		//inicializamos el combobox con su constructor por defecto
		miCombo = new JComboBox();
		
		miCombo.setEditable(true);
		
		//agregar los elementos del combobox (4 elementos)
		miCombo.addItem("Serif");
		miCombo.addItem("SansSerif");
		miCombo.addItem("Monospaced");
		miCombo.addItem("Dialog");
		
		//antes de agregar el combobox a la lamina se debe instanciar la clase que maneja los eventos EventoCombo
		EventoCombo miEvento = new EventoCombo();
		
		//poner el menu contenido en el combo a la escucha
		miCombo.addActionListener(miEvento);
		
		//agregamos el combobox a la lamina norte
		laminaNorte.add(miCombo);
		
		//agregar laminaNorte a la disposición NORTH
		add(laminaNorte, BorderLayout.NORTH);	
		
	}
	
	//clase interna
	private class EventoCombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			texto.setFont(new Font( (String)miCombo.getSelectedItem(), Font.PLAIN, 18));
			
			
			
		}
		
		
		
	}
	
}
