package graficos;

import java.awt.event.*;

import javax.swing.*;

public class Eventos_Raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRaton miMarco = new MarcoRaton();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}


//Objeto fuente
@SuppressWarnings("serial")
class MarcoRaton extends JFrame{
	
	//constructor
	public MarcoRaton(){
		
		setVisible(true);
		setBounds(700, 300, 600, 450);
		
		EventosDeRaton EventoRaton = new EventosDeRaton();
		
		//poner a la escucha al oyente
		addMouseListener(EventoRaton);
	}
}


/**
 * @author MG
 * Clase Oyente
 */
class EventosDeRaton extends MouseAdapter{
	
	/*
	public void mouseClicked(MouseEvent e) {
		//System.out.println("Has hecho click");
		//System.out.println("Coordenada X: " + e.getX() + " Coordenada Y: " + e.getY());
		//cuenta el número de veces que hacemos clic con el ratón
		//System.out.println(e.getClickCount());
		System.out.println(e.getModifiersEx())
	}
	*/
	
	
	/**
	 * Voy a comentar el bloque de MousePressed para implementar una nueva interface en lugar de Mouse Adapter arriba
	 * implementaré ahora la interface
	 */
	public void mousePressed(MouseEvent e) {
		
		//System.out.println(e.getModifiersEx());
		//if(e.getModifiersEx() == 1024) {
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Haz pulsado el boton izquierdo");
		}else if(e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Haz pulsado la rueda del mouse");
		}else if(e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Haz pulsado el botón derecho del mouse");
		}
	}
	
}

//Oyente, voy a poner en comentario todo el bloque siguiente porque quiero implementar solo un método por ej y para eso utilizar
/*
class EventosDeRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Has hecho click");		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de presionar");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de levantar");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de entrar");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de salir");
	}	
}
*/