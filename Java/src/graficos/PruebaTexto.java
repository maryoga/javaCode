package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PruebaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		frmTexto miMarco = new frmTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//miMarco.setVisible(true);

	}

}


class frmTexto extends JFrame{
	
	public frmTexto() {
		
		setBounds(500, 300, 600, 350);
		LaminaTexto miLamina = new LaminaTexto();
		add(miLamina);
		setVisible(true);
		
	}
}

class LaminaTexto extends JPanel{	
	
	//agregamos la clausula private para encapsular el campo1 para que no se pueda acceder fuera de la clase LaminaTexto
	private JTextField campo1;
	private JLabel resultado;
	
	public LaminaTexto() {
		
		//Establecemos el layout de la lamina principal en BorderLayout()
		setLayout(new BorderLayout());
		
		//a continuación construyo una 2da lamina
		JPanel lamina2 = new  JPanel();
		
		//a continuacion establecer el Layout de esta 2da lamina2, luego tomar en cta que elem apareceran en esta lamina2
		//apareceran la etiqueta lblEmail, agregamos el campo de texto campo1, y por ultimo el boton miBtn, se pone el nombre
		//de la instancia con un punto lamina2.add(lblEmail)
		lamina2.setLayout(new FlowLayout());	
		
		
		JLabel lblEmail = new JLabel("Email: ");
		lamina2.add(lblEmail);
		
		resultado = new JLabel("", JLabel.CENTER);		
		
		campo1 = new JTextField(20);
		//agregamos a la lamina el campo1
		lamina2.add(campo1);
		
		//A lal etiqueta resultado lo pondria en la zona CENTRAL de la lamina principal
		add(resultado, BorderLayout.CENTER);
		
		//Si queremos recuperar el contenido de lo que hay en el campo de texto
		//System.out.println(campo1.getText().trim());
		JButton miBtn = new JButton("Comprobar");
		
		DameTexto miEvento = new DameTexto();
		
		miBtn.addActionListener(miEvento);
		
		lamina2.add(miBtn);
		
		//Ahora agregaremos la lamina2 en la zona norte de la 1er lamina (lamina principal)
		add(lamina2, BorderLayout.NORTH);
		
	}
	
	//clase interna
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//la variable "ok" evaluará cuantas @ hay, si no hay ninguna, el correo no está bien escrito
			int ok = 0;
			
			String email = campo1.getText().trim();
			
			for(int i=0; i < email.length(); i++) {
				
				if(email.charAt(i) == '@') {
					ok++;
				}
			}			
			//System.out.println(campo1.getText().trim());
			
			if(ok != 1) {
				//System.out.println("eMail incorrecto");
				resultado.setText("eMail incorrecto");
			} else {
				//System.out.println("eMail correcto");
				resultado.setText("eMail correcto");
			}
		}
		
	}
}
