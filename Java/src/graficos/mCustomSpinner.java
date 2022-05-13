package graficos;

import java.awt.*;

import javax.swing.*;

public class mCustomSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CanvaSpinner miMarco = new CanvaSpinner();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class CanvaSpinner extends JFrame{
	
	public CanvaSpinner() {
		
		setBounds(550, 350, 550, 350);		
		
		add(new PanelSpinner());
		
		setTitle("Sintaxis para crear Spinner");
		
		setVisible(true);
		
	}	
}

class PanelSpinner extends JPanel{
	
	public PanelSpinner() {
		
		//instanciamos la clase interna como argumento de JSpinner
		JSpinner control = new JSpinner(new MiModeloJSpinner());
		
		//dimension de 50 pixeles de ancho por 20 de alto
		Dimension d = new Dimension(50, 20);
		
		//definimos el agurmento de tipo Dimension para el control Spinner
		control.setPreferredSize(d);
		
		//agregamos a la lamina el control spinner
		add(control);
		
	}
	
	//crear clase interna a continuacion del constructor de la lamina
	private class MiModeloJSpinner extends SpinnerNumberModel{
		
		public MiModeloJSpinner() {
			//llamamos al constructor de la clase padre, buscar dentro de SpinnerNumberModel que
			//metodo permite invertir el comportamiento de los botones de subir o bajar los numeros
			super(5, 0, 10, 1);			
		}
		
		//a la izq se ven unos triangulos en verde que significa que estamos sobreescribiendo
		//metodos heredados
		//sobreescribir los metodos que estamos heredando de SpinnerNumberModel
		public Object getNextValue() {
			//al poner la clase super llamamos al metodo getPreviousValue de la clase padre
			return super.getPreviousValue();
		}
		
		public Object getPreviousValue() {
			
			return super.getNextValue();
		}
		
	}
	
}
