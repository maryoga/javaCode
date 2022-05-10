package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCalculadora miMarco = new MarcoCalculadora();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}

class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora() {
		
		setTitle("Calculadora");
		setBounds(500, 300, 450, 300);
		
		LaminaCalculadora miLamina = new LaminaCalculadora();
		add(miLamina);
		
	}
}

class LaminaCalculadora extends JPanel{
	
	private JPanel miLamina2 = new JPanel();
	
	JButton pantalla;
	private boolean principio;	
	private double resultado;	
	private String ultOperacion;
	
	public LaminaCalculadora() {
		
		//iniciamos la variable en el programa constructor
		principio = true;
		
		setLayout(new BorderLayout());
		
		pantalla = new JButton("0");
		pantalla.setEnabled(false);
		
		add(pantalla, BorderLayout.NORTH);
		
		miLamina2 = new JPanel();
		
		miLamina2.setLayout(new GridLayout(4, 4));
		
		ActionListener insertar = new InsertarNumero();
		
		ActionListener orden = new AccionOrden();
		
		
		ponerBoton("7", insertar);
		ponerBoton("8", insertar);
		ponerBoton("9", insertar);
		ponerBoton("/", orden);
		
		ponerBoton("4", insertar);
		ponerBoton("5", insertar);
		ponerBoton("6", insertar);
		ponerBoton("*", orden);
		
		ponerBoton("1", insertar);
		ponerBoton("2", insertar);
		ponerBoton("3", insertar);
		ponerBoton("-", orden);
		
		ponerBoton("0", insertar);
		ponerBoton(".", insertar);
		ponerBoton("=", orden);
		ponerBoton("+", orden);
		

		add(miLamina2, BorderLayout.CENTER);
		
		ultOperacion = "=";
		
	}
	
	//pondremos los botones, pero también los pondremos a la escucha, para ello agregamos un 2do argumento de tipo ActionListener oyente
	private void ponerBoton(String rotulo, ActionListener oyente) {
		
		JButton boton = new JButton(rotulo);
		
		boton.addActionListener(oyente);
		
		miLamina2.add(boton);
	}
	

	//Clase interna que gestionará los eventos
	private class InsertarNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//Caturamos el texto del boton pulsado para luego hacer lo aparecer en pantalla de calculadora
			String entrada = e.getActionCommand();
			
			if (principio) {
				pantalla.setText("");				
				principio = false;
			}
			
			//agregar a pantalla lo que haya anteriormente pantalla.getText() mas lo que hayamos ingresado en el momento pulsando el botón
			pantalla.setText(pantalla.getText()	+ entrada);
			
		}		
	}
	
	//clase interna que gestiona los eventos de las operaciones matematicas
	private class AccionOrden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//almacenamos un String que corresponde al texto del boton
			String operacion = e.getActionCommand();			
			//System.out.println(operacion);			
			
			//llamada a metodo que se encargará de ir realizando todas las operaciones matemáticas y le pasaremos lo que haya en el display pantalla		
			calcular(Double.parseDouble(pantalla.getText()));
			
			ultOperacion = operacion;
			
			principio = true;			
			
		}		
	}
	
	public void calcular(double x) {
		
		if(ultOperacion.equals("+")) {
			resultado += x;
			//System.out.println(resultado);
		}else if(ultOperacion.equals("-")){
			
			resultado -= x;
		}else if(ultOperacion.equals("*")){
			
			resultado *= x;
		}else if(ultOperacion.equals("/")){
			
			resultado /= x;
		
		}else if(ultOperacion.equals("=")){
			resultado = x;
		}
		
		pantalla.setText("" + resultado);
		
	}
	
}


