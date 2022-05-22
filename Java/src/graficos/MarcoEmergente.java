package graficos;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;

public class MarcoEmergente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M_Emergente miMarco = new M_Emergente();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class M_Emergente extends JFrame{
	
	public M_Emergente() {
		
		setBounds(500, 300, 550, 400);
		
		LaminaEmergente miLamina = new LaminaEmergente();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaEmergente extends JPanel{
	
	JMenu fuente, estilo, tamano;
	
	Font letras; //almacena el tipo de letra que hay en nuestra area	
	JTextPane miArea;
	
	public LaminaEmergente() {
		
		setLayout(new BorderLayout());
		JPanel laminaMenu = new JPanel();
		
		//creamos la barra de menu con la clase JMenuBar
		JMenuBar miBarra = new JMenuBar();
		
		//------------------------------------------------------------
		//Creando los elem de la barra de menu		
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamano = new JMenu("Tamaño");
		
		//------------------------------------------------------------		
		//hasta aqui ya están construidos los elem de menu
		//------------------------------------------------------------
		
		//agregar los elem de menu a la barra de menus
		miBarra.add(fuente);
		miBarra.add(estilo);
		miBarra.add(tamano);

		//agregamos la barra a la lamina que irá en la parte NORTH de la lamina princ
		laminaMenu.add(miBarra);

		//ahora agregar la lamina con su barra a la parte NORTH de la lamina princ
		add(laminaMenu, BorderLayout.NORTH);

		//------------------------------------------------------------
		
		//hacer uso de un JTextPane
		miArea = new JTextPane();
				
		//agregar el control miArea (JTextPane) a la lamina principal en la zona central
		add(miArea, BorderLayout.CENTER);
		
		//------------------------------------------------------------
		
		//creamos el menu emergente
		JPopupMenu emergente = new JPopupMenu();		
		
		//ahora agregar los elem que apareceran en el menu emergente
		JMenuItem opc1 = new JMenuItem("Opcion 1");
		JMenuItem opc2 = new JMenuItem("Opcion 2");
		JMenuItem opc3 = new JMenuItem("Opcion 3");
		
		//agregar el elem al menu emergente
		emergente.add(opc1);
		emergente.add(opc2);
		emergente.add(opc3);
		
		//Una vez hemos agregado en el area central el JTextPane y hacemos clic der la instruc sig ya no sirve setComponentPopupMenu(emergente);
		//ya no servira sobre la lamina, sera cuando se hace clic sobre el JTextPane() llamado miArea
		miArea.setComponentPopupMenu(emergente);	
		
	}
	
}
