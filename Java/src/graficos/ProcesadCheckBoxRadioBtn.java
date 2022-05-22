package graficos;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.text.*;
import javax.swing.text.StyledEditorKit.BoldAction;
import javax.swing.text.StyledEditorKit.UnderlineAction;

public class ProcesadCheckBoxRadioBtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu_Proc miMarco = new Menu_Proc();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Menu_Proc extends JFrame{
	
	public Menu_Proc() {
		
		setBounds(500, 300, 550, 400);		
		PanelProc miLamina = new PanelProc();		
		add(miLamina);		
		setVisible(true);		
	}	
}

class PanelProc extends JPanel{
	
	JMenu fuente, estilo, tamano;
	
	Font letras; //almacena el tipo de letra que hay en nuestra area
	
	JTextPane miArea;
	
	public PanelProc() {
		
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
		configMenu("Arial", "fuente", "Arial", 9, 10, "");
		configMenu("Courier", "fuente", "Courier", 9, 10, "");
		configMenu("Verdana", "fuente", "Verdana", 9, 10, "");
		
		//------------------------------------------------------------
		
		//construimos los item del menu Estilo llamando al proc configura_menu
		configMenu("Negrita", "estilo", "", Font.BOLD, 1, "bin/graficos/Negrita.jpg");
		configMenu("Cursiva", "estilo", "", Font.ITALIC, 1, "bin/graficos/cursiva.jpg");
		
		/*
		JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("bin/graficos/Negrita.jpg"));
		JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("bin/graficos/cursiva.jpg"));
		
		//antes de agregarlos al menu principal estilo, debemos decirle que responden a eventos
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		
		//Ahora agregamos los elem de menu a al menu estilo
		estilo.add(negrita);
		estilo.add(cursiva);
		
		*/
		
		//------------------------------------------------------------

		//Para que los botones radio funcionen adecuadamente deben estar incluidos en un GRUPO usando la clase ButtonGroup
		ButtonGroup tamLetra = new ButtonGroup();
		
		//hay que crear las instancias para c/u de los elem de menu
		JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
		JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem veinticuatro = new JRadioButtonMenuItem("24");
		
		//crear atajos de teclado con el METODO setAccelerator(KeyStroke keyStroke) de la clase JMenuItem, lo haremos con la instancia
		//del JRadioButtonMenuItem veiticuatro estableciendo la tecla D en combinacion con la tecla CTRL
		//veinticuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
		
		//agregar cada elem al grupo creado "tamLetra"
		tamLetra.add(doce);
		tamLetra.add(dieciseis);
		tamLetra.add(veinte);
		tamLetra.add(veinticuatro);
		
		//poner estos elem a la escucha del evento correspondiente
		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tam", 12));
		dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tam", 16));
		veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tam", 20));
		veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tam", 24));
		
		//para finalizar hay que agregar cada elem al menu tam
		tamano.add(doce);
		tamano.add(dieciseis);
		tamano.add(veinte);
		tamano.add(veinticuatro);		
		
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
		
		//------------------------------------------------------------
		
		//creamos el menu emergente para la las opciones: Negrita y Cursiva
		JPopupMenu emergente = new JPopupMenu();
		
		//ahora agregar los elem que apareceran en el menu emergente
		JMenuItem negritaE = new JMenuItem("Negrita");
		JMenuItem cursivaE = new JMenuItem("Cursiva");
		JMenuItem subrayaE = new JMenuItem("Subrayar");
		
		//antes de agregarlos al menu EMERGENTE, debemos decirle que responden a eventos
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		subrayaE.addActionListener(new StyledEditorKit.UnderlineAction());		
		
		//agregar el elem al menu emergente
		emergente.add(negritaE);
		emergente.add(cursivaE);
		emergente.add(subrayaE);
		
		//Una vez hemos agregado en el area central el JTextPane y hacemos clic der la instruc sig ya no sirve setComponentPopupMenu(emergente);
		//ya no servira sobre la lamina, sera cuando se hace clic sobre el JTextPane() llamado miArea
		miArea.setComponentPopupMenu(emergente);
		
		//------------------------------------------------------------
		
		//construir Barra de Herramientas
		JToolBar barra = new JToolBar();
		
		JButton negritaBarra = new JButton(new ImageIcon("bin/graficos/Negrita.jpg"));
		JButton cursivaBarra = new JButton(new ImageIcon("bin/graficos/cursiva.jpg"));
		JButton subrayaBarra = new JButton(new ImageIcon("bin/graficos/subrayado.jpg"));
		JButton azulBarra = new JButton(new ImageIcon("bin/graficos/bulletBlue.gif"));
		JButton amarilloBarra = new JButton(new ImageIcon("bin/graficos/bulletYellow.gif"));
		JButton rojoBarra = new JButton(new ImageIcon("bin/graficos/bulletRed.gif"));
		
		//botones de alineacion
		JButton a_izquierda = new JButton(new ImageIcon("bin/graficos/izquierda.jpg"));
		JButton a_centrado = new JButton(new ImageIcon("bin/graficos/centrado.jpg"));
		JButton a_derecha = new JButton(new ImageIcon("bin/graficos/derecha.jpg"));
		JButton a_justificado = new JButton(new ImageIcon("bin/graficos/justificado.jpg"));
		
		
		//luego de instanciar los botones, y antes de agregarlos a la barra de herramientas, poner los botones a la escucha
		negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
		cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
		subrayaBarra.addActionListener(new StyledEditorKit.UnderlineAction());
		azulBarra.addActionListener(new StyledEditorKit.ForegroundAction("pone_azul", Color.BLUE));
		amarilloBarra.addActionListener(new StyledEditorKit.ForegroundAction("pone_amarillo", Color.YELLOW));
		rojoBarra.addActionListener(new StyledEditorKit.ForegroundAction("pone_rojo", Color.RED));
		
		a_izquierda.addActionListener((new StyledEditorKit.AlignmentAction("Izquierda", 0)));
		a_centrado.addActionListener((new StyledEditorKit.AlignmentAction("Centrado", 1)));
		a_derecha.addActionListener((new StyledEditorKit.AlignmentAction("Derecha", 2)));
		a_justificado.addActionListener((new StyledEditorKit.AlignmentAction("Justificado", 3)));
		
		
		//Agregar botones a la Barra de Herramientas
		barra.add(negritaBarra);
		barra.add(cursivaBarra);
		barra.add(subrayaBarra);
		barra.add(azulBarra);
		barra.add(amarilloBarra);
		barra.add(rojoBarra);
		
		barra.add(a_izquierda);
		barra.add(a_centrado);
		barra.add(a_derecha);
		barra.add(a_justificado);
		
		//cambiamos la disposicion de los botones en la barra de herramientas de horizontal (0) a Vertical (1)
		barra.setOrientation(1);
		
		//agregar el ToolKit en la zona OESTE del BorderLayout()
		add(barra, BorderLayout.WEST);
		
		
		
	}
	//Metodo configMenu
	//creando los elementos del menu fuente, Falta agregar los elem que cuelgan de c/u de los elem de menu
	
	/**
	 * METODO QUE CREA ELEMENTOS DE MENU
	 * @param rotulo texto que debe llevar ese elem de menu
	 * @param menu hace referencia al menu donde va colocado el elem de menu
	 * @param tipo_letra
	 * @param estilos almacena el estilo de letra si es Negrita o Italica (cursiva)
	 * @param tam
	 */
	public void configMenu(String rotulo, String menu, String tipo_letra, int estilos, int tam, String ruta_icono) {
		
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
			
		} else if(menu == "estilo") {
			
			//agregamos el elem al menu estilo
			estilo.add(elem_menu);
			
			//como saber si es negrita o cursiva el estilo de letra a aplicar?
			if (estilos == Font.BOLD) {
				//interceptar combinacion de teclas CTRL + N para activar negrita
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));				
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
				
			}else if(estilos == Font.ITALIC) {
				////interceptar combinacion de teclas CTRL + K para activar Cursiva
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			}			
		}
		
	}
}
