package graficos;

import java.awt.*;
import javax.swing.*;

public class MarcoSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameSpinner miMarco = new FrameSpinner();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class FrameSpinner extends JFrame{	
	
	public FrameSpinner() {
		
		setBounds(550, 350, 550, 350);		
		
		add(new LaminaSpinner());
		
		setTitle("Sintaxis para crear Spinner");
		
		setVisible(true);
		
	}
	
}

class LaminaSpinner extends JPanel{
	
	public LaminaSpinner() {
		
		//constructor por defecto (numeros normales) con el parentecis vacio JSpinner(), si lo queremos con formato de fecha JSpinner(new SpinnerDateModel())
		//JSpinner control = new JSpinner(new SpinnerDateModel());
		
		//1ero hay que crear el array de elementos que queremos aparezcan en esta lista
		//String[] lista = {"Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};
		
		//Podriamos utilizar un JSpiner que tenga la lista de todas las fuentes que tenemos instaladas en la computadora, comentamos el array anterior y...
		//con la instruccion que nos permite estraer todas las fuentes que tenemos instaladas, usamos la clase GraphicsEnvironment y con esto almacena
		//la lista de todas las fuentes instaladas en la computadora local
		//String[] lista = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		//crear spinner con una lista que esta representada por el array creado anteriormente y pasarlo como argumento SpinnerListModel(lista)
		//JSpinner control = new JSpinner(new SpinnerListModel(lista));
		
		//Dejaremos el Spinner por defecto con valores numericos, por eso comente la instruccion de crear la lista y de asignarla al JSpinner
		//JSpinner control = new JSpinner();
		
		//podemos delimitar los valores del JSpinner para que en lugar de que comienze por 0, inicie por otro numero y termine en otro, y de cuanto en cuanto
		//esto lo podemos hacer con otro de los constructores que nos pide un modelo usando el SpinnerNumberModel
		JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1));
		
		
		//como estamos utilizando un layout por defecto que es el FlowLayout, tenemos que especificar el tamaño del control con Dimension
		//crear objeto de tipo dimension, hacer esto antes de agregar a la lamina el spiner, dimension de 70 pixeles de ancho por 20 de alto
		Dimension d = new Dimension(50, 20);
		
		//definimos el agurmento de tipo Dimension para el control Spinner
		control.setPreferredSize(d);
		
		//agregamos a la lamina el control spinner
		add(control);
		
	}
	
}
