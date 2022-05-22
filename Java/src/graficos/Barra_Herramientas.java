package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Barra_Herramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Barra miMarco = new Marco_Barra();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class Marco_Barra extends JFrame {
	
	private JPanel lamina;
	
	public Marco_Barra() {
		
		setTitle("Test de Acciones y Toolbar V111");
		setBounds(450, 300, 600, 300);
		lamina = new JPanel();
		add(lamina);
		
		//Config. de acciones. Hay que instanciar la clase oyente para despues decir quien es la fuente del evento y poner el objeto oyente a la escucha
		AccionColor accBlue = new AccionColor("Blue", new ImageIcon("src/graficos/bulletBlue.gif"), Color.BLUE);
		AccionColor accYellow = new AccionColor("Yellow", new ImageIcon("src/graficos/bulletYellow.gif"), Color.YELLOW);		
		AccionColor accRed = new AccionColor("Red", new ImageIcon("src/graficos/bulletRed.gif"), Color.RED);
		Action accSalir =  new AbstractAction("Salir", new ImageIcon("src/graficos/btnSalir")) {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.exit(0);
				
			}
			
			
		};
		
		//crear e instancia menu
		JMenu menu = new JMenu("Color");
		
		//Agregar ahora al menu c/u de las acciones, con el metodo add de JMenu
		menu.add(accBlue);
		menu.add(accYellow);		
		menu.add(accRed);
		
		//crear la barra de menu de la que colgaran los elementos
		JMenuBar barraMenu = new JMenuBar();		
		barraMenu.add(menu);
		
		//decirle a nuestro marco princ que incluya esta barra de menus que acabamos de crear, si no no se mostrara
		setJMenuBar(barraMenu);
		
		//Construccion de Barra de Menus 
		JToolBar barra = new JToolBar();
		
		//agregar a la barra los botones de las acciones con la clase interna
		barra.add(accBlue);
		barra.add(accYellow);
		barra.add(accRed);
		//agregar un separador en la barra de herramientas
		barra.addSeparator();
		
		barra.add(accSalir);
		
		//decirle donde tiene que ir la barra de herramientas
		add(barra, BorderLayout.NORTH);
		
	}
	
	/**
	 * @author MG
	 * 
	 * Pondremos la lamina a la escucha para que pueda cambiar de color al hacer clic en los botones, como no usaremos todos los metodos de la clase
	 * Accion, usaremos la Clase AbstracAction para solo programar los métodos necesarios, si hubieramos querido implementar todos los métodos
	 * implementariamos la interfaz Accion
	 * AccionColor hereda (extends) de la clase AbstractAction para no tener que reprogramar todos los métodos de la interfaz Action
	 * Esta es la clase oyente
	 */
	private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre, Icon icono, Color color_btn) {
			
			//putValue(String key, Object newValue) Sets the Value associated with the specified key.
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Setup frame al color: " + nombre);
			putValue("color_de_fondo", color_btn);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			//getValue es un metodo que pertenece a la interfaz Action, permite rescatar del objeto del evento el valor correspondiente a una clave
			//se hace un Casting para que lo que devuelve el método getValue() pase a un objeto de tipo Color y lo almacenas en c
			Color c = (Color)getValue("color_de_fondo");
			
			System.out.println("Nombre: " + getValue(Action.NAME) + " Descripcion: " + getValue(Action.SHORT_DESCRIPTION));
			
			
			//ponemos la lamina (frame) al color de fondo que hemos guardado en c. El método setBackground() no corresponde a la clase
			//AbstractAction() ni corresponde a la interfaz Action, por ello marca error, ya que el método corresponde a la clase
			//JPanel, por ello para que reconozca el método setBackground() hay que pasar esta clase AccionColor como interna de SelectorAccion que hereda
			//de JPanel y la encapsulamos con private para que no se pueda acceder externamente a ella
			lamina.setBackground(c);
			
		}	
	}//termina la clase interna AccionColor
}

	



