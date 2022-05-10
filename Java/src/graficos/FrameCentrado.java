package graficos;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

//@author: Francisco Ramirez : @XXXKaos (GitHub)

public class FrameCentrado {
	
	public static void main(String[] args) {
		
		MarcoCentrado frame = new MarcoCentrado(); //creating frame : window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //End program when windows is closed
		frame.setVisible(true); //set frame visible
		
		
	}

}

//	CREAMOS OTRA CLASE PARA CENTRAR EL FRAME
@SuppressWarnings("serial")
class MarcoCentrado extends JFrame{
	
	//CONSTRUCTOR
	public MarcoCentrado() {
		Toolkit screen = Toolkit.getDefaultToolkit();
		Dimension dimension = screen.getScreenSize();
		int screenheight = dimension.height;
		int screenwidth = dimension.width;
		
		setSize(screenwidth/2, screenheight/2);
		
		setLocation(screenwidth/4, screenheight/4); // set window location
		setTitle("Javier first Java Application"); //Set window title
		
		setIconImage(screen.getImage("icono.jpg"));
		
	}
	
}
