package graficos;

import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.*;

public class Layouts_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Layout marco = new Marco_Layout();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class Marco_Layout extends JFrame{
	
	public Marco_Layout() {
		setTitle("Prueba acciones");
		setBounds(500, 300, 600, 300);			
		
		Panel_Layout lamina = new Panel_Layout();
		//FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER);		
		//lamina.setLayout(disposicion);
		//tambien se puede anular la siguiente linea y trasladar a la definición de la lamina y de ese modo queda unificado  posicion y elementos
		//lamina.setLayout(new FlowLayout(FlowLayout.CENTER, 75, 100));		
		add(lamina, BorderLayout.NORTH);
		
		Panel_Layout2 lamina2 = new Panel_Layout2();
		add(lamina2, BorderLayout.SOUTH);
		
	}
}

class Panel_Layout extends JPanel{
	
	public Panel_Layout() {
		
		//definición unificada de posicionamiento y definición de elementos 
		//setLayout(new FlowLayout(FlowLayout.CENTER, 75, 100));
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JButton("Amarillo"));
		add(new JButton("Azul"));
	
	}
}

class Panel_Layout2 extends JPanel{
	
	public Panel_Layout2() {

		setLayout(new BorderLayout());
		
		add(new JButton("Rojo"), BorderLayout.WEST);
		add(new JButton("Verde"), BorderLayout.EAST);
		add(new JButton("Negro"), BorderLayout.CENTER);	
		
	}
}
