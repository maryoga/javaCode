package graficos;

import javax.swing.*;

public class MarcoSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame_Sliders miMarco = new Frame_Sliders();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class Frame_Sliders extends JFrame{
	
	public Frame_Sliders(){
		
		setBounds(550, 300, 550, 350);
		
		LaminaSliders miLamina = new LaminaSliders();
		
		add(miLamina);
		
		setVisible(true);
		
	}
}


class LaminaSliders extends JPanel{
	
	public LaminaSliders() {
		
		
		
	}
}
