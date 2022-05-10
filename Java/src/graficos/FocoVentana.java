package graficos;

import java.awt.event.*;

import javax.swing.*;

public class FocoVentana extends JFrame implements WindowFocusListener{

	FocoVentana marco1;
	FocoVentana marco2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FocoVentana miVen = new FocoVentana();
		
		miVen.iniciar();

	}
	
	
	public void iniciar() {
		
		marco1 = new FocoVentana();
		marco2 = new FocoVentana();
		
		marco1.setVisible(true);
		marco2.setVisible(true);
		
		marco1.setBounds(200, 100, 600, 350);
		marco2.setBounds(800, 100, 600, 350);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//poner los marcos a la escucha del evento correspondiente
		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);
		
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		//con el getSource() podemos detectar quien es el origen del evento ocurrido
		if(e.getSource() == marco1) {
			marco1.setTitle("Marco 1 tiene el foco");
		}else {
			marco2.setTitle("Marco 2 tiene el foco");
		}
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == marco1) {
			marco1.setTitle("");
		}else {
			marco2.setTitle("");
		}
	}
	
	
	

}
