package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class PruebaAcciones {

	public class PanelAccion {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoAccion marco = new MarcoAccion();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
}


class MarcoAccion extends JFrame {
	
	public MarcoAccion() {
		
		setTitle("Prueba Acciones");
		setBounds(450, 300, 600, 300);
		PanelAccion lamina = new PanelAccion();
		add(lamina);
	}
}

class PanelAccion extends JPanel{
	
	public PanelAccion() {
		/*
		JButton btnAmarillo = new JButton("Amarillo");
		JButton btnAzul = new JButton("Azul");
		JButton btnRojo = new JButton("Rojo");		
		add(btnAmarillo);
		add(btnAzul);
		add(btnRojo);
		*/
		
		//Hay que instanciar la clase oyente para despues decir quien es la fuente del evento y poner el objeto oyente a la escucha
		AccionColor accYellow = new AccionColor("Yellow", new ImageIcon("src/graficos/bulletYellow.gif"), Color.YELLOW);
		AccionColor accBlue = new AccionColor("Blue", new ImageIcon("src/graficos/bulletBlue.gif"), Color.BLUE);
		AccionColor accRed = new AccionColor("Red", new ImageIcon("src/graficos/bulletRed.gif"), Color.RED);
		
		//crearemos los botones de otra forma
		/*JButton btnYello = new JButton(accYellow);
		add(btnYellow); */
		
		add(new JButton(accYellow));
		add(new JButton(accBlue));
		add(new JButton(accRed));
		
		//el codigo no hace nada hasta aqui, porque aun no se ha completado el codigo de actionPerformed()	
		//Nuevo codigo que agrega combinaciones de tecla como otra fuente de eventos
		InputMap mapEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		//KeyStroke keyYellow = KeyStroke.getKeyStroke("ctrl A");
		
		mapEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_yellow");
		//también puedo agregar otra combinación de tecla, y no solo tener una para un mismo evento de cambiar el fondo a la lamina
		mapEntrada.put(KeyStroke.getKeyStroke("ctrl Y"), "fondo_yellow");
		
		mapEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_blue");
		mapEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_red");
		
		ActionMap mapaAccion = getActionMap();
		
		mapaAccion.put("fondo_yellow", accYellow);
		mapaAccion.put("fondo_blue", accBlue);
		mapaAccion.put("fondo_red", accRed);		
	}
	
	/**
	 * @author MG
	 * 
	 * Pondremos la lamina a la escucha para que pueda cambiar de color al hacer clic en los botones, como no usaremos toos los metodos de la clase
	 * Accion, usaremos la Clase AbstracAction para solo programar los métodos necesarios, si hubieramos querido implementar todos los métodos
	 * implementariamos la interfaz Accion
	 * AccionColor hereda (extends) de la clase AbstractAction para no tener que reprogramar todos los métodos de la interfaz Action
	 * Esta es la clase oyente
	 */
	private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre, Icon icono, Color color_btn) {
			
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
			//JPanel, por ello para que reconozca el método setBackground() hay que pasar esta clase AccionColor como interna de PanelAccion que hereda
			//de JPanel y la encapsulamos con private para que no se pueda acceder externamente a ella
			setBackground(c);
			
		}	
	}//termina la clase interna AccionColor

}


