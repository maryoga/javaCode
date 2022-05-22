package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Procesador_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuProcesador_II miMarco = new MenuProcesador_II();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MenuProcesador_II extends JFrame{
	
	public MenuProcesador_II() {
		
		setBounds(500, 300, 550, 400);
		
		LaminaProcesador_II miLamina = new LaminaProcesador_II();
		
		add(miLamina);
		
		setVisible(true);
		
	}
}

class LaminaProcesador_II extends JPanel{
	
	JTextPane miArea;
	
	public LaminaProcesador_II() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu = new JPanel();
		
		//creamos la barra de menu con la clase JMenuBar
		JMenuBar miBarra = new JMenuBar();
		
		//------------------------------------------------------------
		//Creando los elem de la barra de menu
		
		JMenu fuente = new JMenu("Fuente");
		JMenu estilo = new JMenu("Estilo");
		JMenu tamano = new JMenu("Tamaño");
		
		//------------------------------------------------------------
		//creando los elementos del menu fuente
		
		JMenuItem arial = new JMenuItem("Arial");
		
		arial.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub			
				miArea.setFont(new Font("Arial", Font.PLAIN, 12));			
			}		
		});
				
		JMenuItem courier = new JMenuItem("Courier");
		JMenuItem verdana = new JMenuItem("Verdana");
		
		verdana.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub			
				miArea.setFont(new Font("Verdana", Font.PLAIN, 12));			
			}		
		});
		
		
		//1era forma. instanciamos la clase interna
		/*
		Gestiona_menus tipo_letra = new Gestiona_menus();		
		courier.addActionListener(tipo_letra);
		*/
		//2da forma. instanciar directamente la clase interna como argumento
		//courier.addActionListener(new Gestiona_menus());
		
		//3era forma. Hacer uso de una Clase Interna Anonima para simplificar codigo
		courier.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub			
				miArea.setFont(new Font("Courier", Font.PLAIN, 12));			
			}		
		});
		
		
		//agregarlos al menu fuente
		fuente.add(arial);
		fuente.add(courier);
		fuente.add(verdana);		
		
		//------------------------------------------------------------
		//ahora determinar o def que cuelga de estilo
		JMenuItem negrita  = new JMenuItem("Negrita");
		JMenuItem cursiva = new JMenuItem("Cursiva");
		
		//agregarlos al menu fuente
		estilo.add(negrita);
		estilo.add(cursiva);
		
		//------------------------------------------------------------
		//ahora determinar o def que cuelga de tamano
		JMenuItem tam_12 = new JMenuItem("12");
		JMenuItem tam_16 = new JMenuItem("16");
		JMenuItem tam_20 = new JMenuItem("20");
		JMenuItem tam_24 = new JMenuItem("24");
		
		//agregarlos al menu fuente
		tamano.add(tam_12);
		tamano.add(tam_16);
		tamano.add(tam_20);
		tamano.add(tam_24);		
		
		//------------------------------------------------------------
		
		//agregar los elem de menu a la barra de menus
		miBarra.add(fuente);
		miBarra.add(estilo);
		miBarra.add(tamano);
		
		//agregamos la barra a la lamina que irá en la parte NORTH de la lamina princ
		laminaMenu.add(miBarra);
		
		//ahora agregar la lamina con su barra a la parte NORTH de la lamina princ
		add(laminaMenu, BorderLayout.NORTH);
		
		//Falta agregar los elem que cuelgan de c/u de los elem de menu
		//hacer uso de un JTextPane
		miArea = new JTextPane();
		
		//agregar el control miArea (JTextPane) a la lamina principal en la zona central
		add(miArea, BorderLayout.CENTER);		
		
	}
	
	/*
	//clase interna
	private class Gestiona_menus implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub			
			miArea.setFont(new Font("Courier", Font.PLAIN, 12));			
		}		
	}
	*/
	
	
}