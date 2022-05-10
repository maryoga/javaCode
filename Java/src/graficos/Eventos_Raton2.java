package graficos;

import java.awt.event.*;

import javax.swing.*;

public class Eventos_Raton2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRaton2 miMarco = new MarcoRaton2();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}


//Objeto fuente
@SuppressWarnings("serial")
class MarcoRaton2 extends JFrame{
	
	//constructor
	public MarcoRaton2(){
		
		setVisible(true);
		setBounds(700, 300, 600, 450);
		
		EventDeRaton EventoRaton2 = new EventDeRaton();
		
		//poner a la escucha al oyente, se usa addMouseListeneer cuando implementamos MouseAdapter, pero ahora vamos a implemenar
		//addMotionListener
		//addMouseListener(EventoRaton);
		addMouseMotionListener(EventoRaton2);
		
	}
}

class EventDeRaton implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estás arrastrado el mouse");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estás moviendo el mouse");
	}
	
}
