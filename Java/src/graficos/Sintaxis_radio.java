package graficos;

import javax.swing.*;

public class Sintaxis_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frmRadio_Sintaxis miMarco = new frmRadio_Sintaxis();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class frmRadio_Sintaxis extends JFrame{
	
	public frmRadio_Sintaxis(){
		
		setVisible(true);
		
		setBounds(550, 300, 500, 300);
		
		Lamina_radio_sintaxis miLamina = new Lamina_radio_sintaxis();
		
		add(miLamina);
		
		
	}
}

class Lamina_radio_sintaxis extends JPanel{
	
	public Lamina_radio_sintaxis() {
		
		ButtonGroup miGrupo = new ButtonGroup();
		
		ButtonGroup GrupoSexo = new ButtonGroup();
		
		//Crear los botonnes radio
		JRadioButton rBtnAzul = new JRadioButton("Azul", false);
		JRadioButton rBtnRojo = new JRadioButton("Rojo", true);
		JRadioButton rBtnVerde = new JRadioButton("Verde", false);
		
		//asignar los botones al grupo de botones miGrupo para que funcionen como una unica unidad
		miGrupo.add(rBtnAzul);
		miGrupo.add(rBtnRojo);
		miGrupo.add(rBtnVerde);
		
		//agregar los botones a la lamina, no el grupo. El grupo no se puede agregar nunca a la lamina
		add(rBtnAzul);
		add(rBtnRojo);
		add(rBtnVerde);
		
		JRadioButton rBtnMasc = new JRadioButton("Masculino", false);
		JRadioButton rBtnFem = new JRadioButton("Femenino", true);
		
		GrupoSexo.add(rBtnMasc);
		GrupoSexo.add(rBtnFem);
		
		add(rBtnMasc);
		add(rBtnFem);
		
	}
	
	
}

