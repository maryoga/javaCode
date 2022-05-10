package graficos;


import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;


public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotones miMarco = new MarcoBotones();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
		setTitle("Botones y Eventos");
		
		setBounds(700, 300, 500, 300);
		
		LaminaBotones miLamina = new LaminaBotones();
		
		add(miLamina);
	}
}

//Como la clase LaminaBotones dejará de ser el Oyente (Listener) quitaremos que implenente la interfaz ActionListener
//class LaminaBotones extends JPanel implements ActionListener{
class LaminaBotones extends JPanel{
	
	JButton btnAzul = new JButton("Azull");
	JButton btnAmarillo = new JButton("Amarillo");
	JButton btnRojo = new JButton("Rojo");
	
	public LaminaBotones() {
		add(btnAzul);
		add(btnAmarillo);
		add(btnRojo);
		
		ColorFondo Azul = new ColorFondo(Color.BLUE);
		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo Rojo = new ColorFondo(Color.RED);
		
		
		//Acción al hacer Clic, el Objeto fuente es el botón Azul, y el listener es el que recibe el evento, es LaminaBotones (this)
		btnAzul.addActionListener(Azul);
		btnAmarillo.addActionListener(Amarillo);
		btnRojo.addActionListener(Rojo);
	}
	
	
	//Clase interna de la clase LaminaBotones, para ello se agrega el modificador private
	private class ColorFondo implements ActionListener{

		public ColorFondo(Color c) {
			colorDeFondo = c;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			setBackground(colorDeFondo);
			
		}
		
		private Color colorDeFondo;	
	}
	
	
	/*
	public void actionPerformed(ActionEvent e) {
		
		//getSource nos permite saber quien es la fuente que origina el evento
		Object btnPulsado = e.getSource();
		
		if(btnPulsado == btnAzul)
			setBackground(Color.BLUE);
		else if(btnPulsado== btnAmarillo)
			setBackground(Color.YELLOW);
		else
			setBackground(Color.RED);
	}
	*/
}



