package graficos;

import javax.swing.*;

import java.awt.event.*;

public class Eventos_Ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoVentana miMarco = new MarcoVentana();
				
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentana miMarco2 = new MarcoVentana();
		
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		miMarco.setTitle("Ventana 1");
		
		miMarco2.setTitle("Ventana 2");
		
		miMarco.setBounds(300, 300, 500, 350);
		
		miMarco2.setBounds(900, 300, 500, 350);

	}

}

class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		//setTitle("Respondiendo");				
		setVisible(true);
		
		/*
		M_Ventana oyente_ventana = new M_Ventana();		
		addWindowListener(oyente_ventana);
		*/
		
		addWindowListener(new M_Ventana());
	}
	
}

class M_Ventana extends WindowAdapter{
	
	
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}
	

	

	
}
