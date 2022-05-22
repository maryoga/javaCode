/**
 * 
 */
package graficos;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.StyledEditorKit;


/**
 * @author Matthias
 * Codigo actualizado a una mejor version de codigo
 */
public class Procesador_Upgraded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuProcesador miMarco = new MenuProcesador();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MenuProcesador extends JFrame{
	
	public MenuProcesador() {
		
		setBounds(500, 300, 550, 400);		
		LamProc miLamina = new LamProc();		
		add(miLamina);		
		setVisible(true);		
	}	
}

class LamProc extends JPanel{
	
	JMenu fuente, estilo, tamano;
	
	Font letras; //almacena el tipo de letra que hay en nuestra area	
	
	JTextPane miArea;
	
	public LamProc() {
		
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
		
		//construimos los item del menu Fuente llamando al proc configura_menu, agregaremos un nuevo parametro que maneje los iconos de menu
		config_menu("Arial", "fuente", "Arial", 9, 10, "");
		config_menu("Courier", "fuente", "Courier", 9, 10, "");
		config_menu("Verdana", "fuente", "Verdana", 9, 10, "");
		
		//------------------------------------------------------------
		//construimos los item del menu Estilo llamando al proc configura_menu
		config_menu("Negrita", "estilo", "", Font.BOLD, 1, "bin/graficos/Negrita.jpg");
		config_menu("Cursiva", "estilo", "", Font.ITALIC, 1, "bin/graficos/cursiva.jpg");
		
		//------------------------------------------------------------
		//construimos los item del menu Tamaño llamando al proc configura_menu
		config_menu("12", "tamano", "", 9, 12, "");
		config_menu("16", "tamano", "", 9, 16, "");
		config_menu("20", "tamano", "", 9, 20, "");
		config_menu("24", "tamano", "", 9, 24, "");
		
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
	//Metodo configura_menu
	//creando los elementos del menu fuente, Falta agregar los elem que cuelgan de c/u de los elem de menu
	
	/**
	 * METODO QUE CREA ELEMENTOS DE MENU
	 * @param rotulo texto que debe llevar ese elem de menu
	 * @param menu hace referencia al menu donde va colocado el elem de menu
	 * @param tipo_letra
	 * @param estilos almacena el estilo de letra si es Negrita o Italica (cursiva)
	 * @param tam
	 */
	public void config_menu(String rotulo, String menu, String tipo_letra, int estilos, int tam, String ruta_icono) {
		
		JMenuItem elem_menu = new JMenuItem(rotulo, new ImageIcon(ruta_icono));
		
		//especificar donde iria cada elem de menu que construyamos
		
		if(menu == "fuente") {
			
			fuente.add(elem_menu);
			
			//validar cual es el tipo de letra seleccionado
			if(tipo_letra == "Arial") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Arial"));
			}else if(tipo_letra == "Courier") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Courier"));
			}else if(tipo_letra == "Verdana") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Verdana"));
			}
			
		}else if(menu == "estilo") {
			
			//agregamos el elem al menu estilo
			estilo.add(elem_menu);
			
			//como saber si es negrita o cursiva el estilo de letra a aplicar?
			if (estilos == Font.BOLD) {
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			}else if(estilos == Font.ITALIC) {
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			}			
			
		} else if(menu == "tamano") {
			tamano.add(elem_menu);
			//cambia solo el tamano del texto seleccionado
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tam", tam));
		}		
	}

}
