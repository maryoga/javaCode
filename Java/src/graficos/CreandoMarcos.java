package graficos;


import javax.swing.*;

public class CreandoMarcos {
	
	
	//METODO MAIN
	public static void main(String[] args) {
		miFrame frame = new miFrame();
		frame.setVisible(true); //hacer visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cuando la ventana se cierra, se acaba el programa
		

	}
}


//CLASE MI FRAME
@SuppressWarnings("serial")
class miFrame extends JFrame{
	
	//CONSTRUCTOR miFrame
	public miFrame() {
		
		//setSize(500,300);
		//setLocation(500,300);
		
		setBounds(500,300,850,550); //coordenadas:tamanho ventana
		
		setTitle("Mi primer App de Java Swing");
		//setExtendedState(Frame.MAXIMIZED_BOTH); //Maximizar
		
		
		
	}
	
}
