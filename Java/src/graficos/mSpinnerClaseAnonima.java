package graficos;

import java.awt.Dimension;

import javax.swing.*;

public class mSpinnerClaseAnonima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JF_Spinner miMarco = new JF_Spinner();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class JF_Spinner extends JFrame{
	
	public JF_Spinner() {
		
		setBounds(550, 350, 550, 350);		
		
		add(new PanelSpinner());
		
		setTitle("Sintaxis para crear Spinner");
		
		setVisible(true);
		
	}	
}

class JP_Spinner extends JPanel{
	
	public JP_Spinner() {
		
		//creando clase anonima como argumento del constructor de JSpinner
		JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1) {
			
			public Object getNextValue() {
				//al poner la clase super llamamos al metodo getPreviousValue de la clase padre
				return super.getPreviousValue();
			}
			
			public Object getPreviousValue() {
				
				return super.getNextValue();
			}			
			
		});
		
		//dimension de 50 pixeles de ancho por 20 de alto
		Dimension d = new Dimension(50, 20);
		
		//definimos el agurmento de tipo Dimension para el control Spinner
		control.setPreferredSize(d);
		
		add(control);
	}	
	
	
}
