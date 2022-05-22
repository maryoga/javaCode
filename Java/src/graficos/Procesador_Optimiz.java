package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Procesador_Optimiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuProcesador miMarco = new MenuProcesador();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}

}

class Menu_ProcOptimiz extends JFrame{
	
	public Menu_ProcOptimiz() {
		
		setBounds(500, 300, 550, 400);		
		LamProcOptimiz miLamina = new LamProcOptimiz();		
		add(miLamina);		
		setVisible(true);		
	}	
}

class LamProcOptimiz extends JPanel{
	
	JMenu fuente;
	JMenu estilo;
	JMenu tamano;
	
	Font letras; //almacena el tipo de letra que hay en nuestra area
	
	JTextPane miArea;
	
	public LamProcOptimiz() {
		
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
		//crear los JMenuItem para cada JMenu
		
		//construimos los item del menu Fuente llamando al proc configura_menu
		configura_menu("Arial", "fuente", "Arial", 9, 10);
		configura_menu("Courier", "fuente", "Courier", 9, 10);
		configura_menu("Verdana", "fuente", "Verdana", 9, 10);
		
		//------------------------------------------------------------
		//construimos los item del menu Estilo llamando al proc configura_menu
		configura_menu("Negrita", "estilo", "", Font.BOLD, 1);
		configura_menu("Cursiva", "estilo", "", Font.ITALIC, 1);
		
		//------------------------------------------------------------
		//construimos los item del menu Estilo llamando al proc configura_menu
		configura_menu("12", "tamano", "", 9, 12);
		configura_menu("16", "tamano", "", 9, 16);
		configura_menu("20", "tamano", "", 9, 20);
		configura_menu("24", "tamano", "", 9, 24);
		
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

		//hacer uso de un JTextPane
		miArea = new JTextPane();
				
		//agregar el control miArea (JTextPane) a la lamina principal en la zona central
		add(miArea, BorderLayout.CENTER);
		
	}
	//Metodo configura_mmenu
	//creando los elementos del menu fuente, Falta agregar los elem que cuelgan de c/u de los elem de menu
	
	/**
	 * METODO QUE CREA ELEMENTOS DE MENU
	 * @param rotulo texto que debe llevar ese elem de menu
	 * @param menu hace referencia al menu donde va colocado el elem de menu
	 * @param tipo_letra
	 * @param estilos
	 * @param tam
	 */
	public void configura_menu(String rotulo, String menu, String tipo_letra, int estilos, int tam) {
		
		JMenuItem elem_menu = new JMenuItem(rotulo);
		
		//especificar donde iria cada elem de menu que construyamos
		
		if(menu == "fuente") {
			fuente.add(elem_menu);
		}else if(menu == "estilo") {
			estilo.add(elem_menu);
		} else if(menu == "tamano") {
			tamano.add(elem_menu);
		}
		
		//poner menu a la escucha con el metodo addActionListener
		elem_menu.addActionListener(new GestionaEventos(rotulo, tipo_letra, estilos, tam));
	}
	
	//crear clase interna
	//necesitamos pasar valores de la clase padre a la clase hijo (configura_menu a GestionaEventos)
	//lo hacemos utilizando el constructor de la clase GestionaEventos
	//menu para detectar cual es el elem pulsado
	private class GestionaEventos implements ActionListener{
		
		String tipoLetra, AuxMenu;
		int estiloLetra, tamLetra;
		
		//elem es el parametro que contiene cual es elem pulsado de menu
		//txtDescripcion def que rotulo asociado con el boton pulsado de menu
		//estilo2 estilo pulsado en cada momento (negrita o cursiva)
		GestionaEventos(String rotulo2, String tipoLet2, int estilo2, int tamLetra2) {
			tipoLetra = tipoLet2;
			estiloLetra = estilo2;
			tamLetra = tamLetra2;
			AuxMenu = rotulo2;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//dentro de Font extraer estilo, tamaño y letra, utilizando dif metodos pertenecientes a la clase Font
			letras = miArea.getFont();
			
			if (AuxMenu == "Arial" || AuxMenu == "Courier" || AuxMenu == "Verdana") {
				estiloLetra = letras.getStyle();
				tamLetra = letras.getSize();
				
			}else if(AuxMenu == "Negrita" || AuxMenu == "Cursiva") {
				
				if(letras.getStyle() == 1 || letras.getStyle() == 2) {
					
					estiloLetra = 3; //mantener los 2 estilos negrita y cursiva
					
				}
				
				tipoLetra = letras.getFontName();
				tamLetra = letras.getSize();
				
			}else if(AuxMenu == "12" || AuxMenu == "16" || AuxMenu == "20" || AuxMenu == "24") {
				tipoLetra = letras.getFontName();
				estiloLetra = letras.getStyle();
			}
			
			miArea.setFont(new Font(tipoLetra, estiloLetra, tamLetra));
			
			System.out.println("Tipo: " + tipoLetra + " Estilo: "+ estiloLetra + " Tamaño: " + tamLetra);
		}
	}
	
}