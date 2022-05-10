package graficos;

import java.awt.Frame;
import java.awt.event.*;

import javax.swing.JFrame;

public class CambioEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEstado miMarco = new MarcoEstado();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoEstado extends JFrame{
	
	public MarcoEstado() {
		
		setVisible(true);
		setBounds(550, 250, 500, 350);
		
		CambiaEstado newEstado = new CambiaEstado();
		
		addWindowStateListener(newEstado);		

	}
	
}

class CambiaEstado implements WindowStateListener{
	
	public void windowStateChanged(WindowEvent e) {
		System.out.println("La ventana a cambiado de estado");
		
		//System.out.println(e.getNewState());
		
		if(e.getNewState() == 6) {
			System.out.println("La ventana esta maximizada");
		} else if(e.getNewState() == Frame.NORMAL) {
			System.out.println("La ventana esta en estado Normal");
		} else if(e.getNewState() == Frame.ICONIFIED) {
			System.out.println("La ventana esta en estado Minimizado");
		}
		
		
	}
}