package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ejemplo_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frmRadio miMarco = new frmRadio();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
	}

}

class frmRadio extends JFrame{
	
	
	public frmRadio() {
		
		
		
		setBounds(550, 300, 500, 300);
		
		Lamina_radio miLamina = new Lamina_radio();
		
		add(miLamina);
		
		setVisible(true);
		
	}
}

class Lamina_radio extends JPanel{
	
	JLabel texto;
	
	JRadioButton rBtnPequeno, rBtnMedio, rBtnGrande, rBtnExtraGrande;
	
	public Lamina_radio() {
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("En algun lugar de la mancha... ");
		
		add(texto, BorderLayout.CENTER);
		
		ButtonGroup miGrupo = new ButtonGroup();
		
		rBtnPequeno = new JRadioButton("Pequeño", false);
		rBtnMedio = new JRadioButton("Mediano", true);
		rBtnGrande = new JRadioButton("Grande", false);
		rBtnExtraGrande = new JRadioButton("Extra grande", false);		
		
		JPanel lamina_radio = new JPanel();
		
		//instanciar la clase Evento_radio
		Evento_radio miEvento = new Evento_radio();
		
		//poner botones a la escucha
		rBtnPequeno.addActionListener(miEvento);
		rBtnMedio.addActionListener(miEvento);
		rBtnGrande.addActionListener(miEvento);
		rBtnExtraGrande.addActionListener(miEvento);
		
		//agrupar los botones
		miGrupo.add(rBtnPequeno);
		miGrupo.add(rBtnMedio);
		miGrupo.add(rBtnGrande);
		miGrupo.add(rBtnExtraGrande);
		
		//agregarlos a la lamina
		lamina_radio.add(rBtnPequeno);
		lamina_radio.add(rBtnMedio);
		lamina_radio.add(rBtnGrande);
		lamina_radio.add(rBtnExtraGrande);
		
		//agregar la lamina de botones a la zona SOUTH
		add(lamina_radio, BorderLayout.SOUTH);		
		
	}
	
	//Clase interna que maneje los eventos
	private class Evento_radio implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource() == rBtnPequeno) {
				//System.out.println("Has seleccionado letra pequeña");
				texto.setFont(new Font("Serif", Font.PLAIN, 10));
			}else if(e.getSource() == rBtnMedio) {
				texto.setFont(new Font("Serif", Font.PLAIN, 12));
			}else if(e.getSource() == rBtnGrande) {
				texto.setFont(new Font("Serif", Font.PLAIN, 18));
			}else if(e.getSource() == rBtnExtraGrande) {
				texto.setFont(new Font("Serif", Font.PLAIN, 24));
			}
			
		}
		
	}
	
}
