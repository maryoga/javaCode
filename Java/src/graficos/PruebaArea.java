package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Matthias
 * En este ejemplo estableceré un Layout en el propio marco
 */
public class PruebaArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frmPruebaArea miMarco = new frmPruebaArea();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}


class frmPruebaArea extends JFrame{
	
	//Definir una lamina para los botones que estáran en la zona SOUTH
	private JPanel laminaBotones;
	
	//areaTexto definir aca que la ubicaremos en la zona CENTER del panel
	private JTextArea areaTexto;
	
	//definir el objeto de texto con barras de desplazamiento, definir pero no iniciada
	private JScrollPane laminaConBarras;
	
	//Definir los botones
	JButton btnInsertar, btnSaltoLinea;
	
	//constructor de la clase frmPruebaArea
	public frmPruebaArea() {
		
		setTitle("Probando Area de Texto");
		
		setBounds(500, 300, 600, 350);
		
		//Establecer la disposición del marco frmPruebaArea al tipo BorderLayout()
		setLayout(new BorderLayout());
		
		//A continuación crear 2 laminas, la 1era para la zona CENTER del marco y la 2da para la zona SOUTH del marco
		//Iniciamos la lamina para los botones
		laminaBotones = new JPanel();
		
		//iniciar los botones que estarán dentro de la lamina creada anteriormente
		btnInsertar = new JButton("Insertar");
		
		//Poner btnInsertar a la escucha del evento, como lo hacemos sin tener que crear otra clase, lo hacemos instanciando
		//dentro de los argumentos de addActionListener la INTERFAZ ActionListenr
		btnInsertar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				areaTexto.append("En un lugar de la mancha cuyo nombre no quiero recordarme... ");
				
			}			
		});
		//Agregamos el boton a la lamina de botones que estará en la parte SOUTH de la lamina
		laminaBotones.add(btnInsertar);		
		
		//Agregamos el segundo botton
		btnSaltoLinea = new JButton("Salto Linea");
		
		//poner el boton btnSaltoLinea a la escucha para que ejecute el evento clic
		btnSaltoLinea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//Determina si el objeto areaTexto tiene saltos de linea, por defecto esta a FALSE(no tiene saltos)
				boolean saltar = !areaTexto.getLineWrap();
				
				//establecer saltos de linea con el metodo setLineWrap(), si es TRUE pone saltos de linea al objeto
				areaTexto.setLineWrap(saltar);
				
				/*
				if(saltar) {					
					btnSaltoLinea.setText("Quitar Salto Linea");					
				} else {					
					btnSaltoLinea.setText("Salto Linea");					
				}
				*/
				
				//ocupare el operador ternario ahora en lugar del if else, es parecido
				btnSaltoLinea.setText(saltar ? "Quitar Salto" : "Salto Linea");
				
			}			
		});
		
		//agregaremos ahora el botón btnSaltoLinea a la lamina, ya agregamos el btnInsertar (insertar texto)
		laminaBotones.add(btnSaltoLinea);
		
		//agregar la laminaBotones a la parte SOUTH de la lamina principal
		add(laminaBotones, BorderLayout.SOUTH);
		
		//ahora agregar el area de texto en la parte superior, crear con 8 filas y 20 columnas el area de texto
		areaTexto = new JTextArea(8, 20);
		
		//ahora si queremos que el area de texto tenga barras de desplazamiento debemos agregarla a una lamina de tipo
		//JScrollPane, con esto ya tenemos el area de texto dentro de la lamina con barras
		laminaConBarras = new JScrollPane(areaTexto);
		
		//agregar esta lamina con barras a la zona CENTER
		add(laminaConBarras, BorderLayout.CENTER);
		
		
	}
	
}
