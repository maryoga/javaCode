package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Ej_btnRadio_optimizado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoRadio miMarco = new marcoRadio();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class marcoRadio extends JFrame{
	
	
	public marcoRadio() {		
		
		setBounds(550, 300, 500, 300);		
		LaminaRadio miLamina = new LaminaRadio();		
		add(miLamina);		
		setVisible(true);
		
	}
}

class LaminaRadio extends JPanel{
	
	private JLabel texto;		
	private ButtonGroup miGrupo;	
	private JPanel lamina_botones;
	
	public LaminaRadio() {
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("En algun lugar de la mancha... ");
		
		//añadir caracteristicas al texto
		texto.setFont(new Font("Serif", Font.PLAIN, 12));		
		
		add(texto, BorderLayout.CENTER);
		
		//se deben instancias estas variables para poder utilizarlas
		lamina_botones = new JPanel();
		miGrupo = new ButtonGroup();
		
		//pasar los parametros necesarios para crear cada boton
		colocarBotones("Pequeño", false, 10);
		colocarBotones("Mediano", true, 12);
		colocarBotones("Grande", false, 18);
		colocarBotones("Muy Grande", false, 24);
		
		//agregar lamina_botones a la lamina principal "lamina_radio"
		add(lamina_botones, BorderLayout.SOUTH);
		
	}
	

	public void colocarBotones(String nombre, boolean seleccionado, final int tamano) {
		
		//poner nombre y estado del boton
		JRadioButton boton = new JRadioButton(nombre, seleccionado);
		
		//todo boton que construya este metodo lo agrega al grupo
		miGrupo.add(boton);
		
		//agregarlo a la lamina
		lamina_botones.add(boton);
		
		//poner boton a la escucha, tiene que reponder a una serie de eventos, como el evento clic
		ActionListener miEvento = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				texto.setFont(new Font("Serif", Font.PLAIN, tamano));
			}			
		};
		
		//poner el boton a la escucha
		boton.addActionListener(miEvento);
	}
}