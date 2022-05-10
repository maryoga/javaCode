package graficos;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class CampoPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		frmPassword miMarco = new frmPassword();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class frmPassword extends JFrame{
	
	public frmPassword() {
		
		setBounds(400, 300, 500, 400);
		
		LaminaPassword miLamina = new LaminaPassword();
		add(miLamina);
		setVisible(true);
	}
}

class LaminaPassword extends JPanel{
	
	JPasswordField txtPassword;
	
	public LaminaPassword() {		
		
		setLayout(new BorderLayout());
		
		JPanel lamina_superior = new JPanel();
		lamina_superior.setLayout(new GridLayout(2, 2));;
		//agregamos la lamina superior y le decimos que se ubique en la zona NORTH del BorderLayout()
		add(lamina_superior, BorderLayout.NORTH);
		
		//Crear etiquetas y campos
		JLabel lblUsuario = new JLabel("Usuario");
		JLabel lblPassword = new JLabel("Contraseña");
		
		JTextField txtUsuario = new JTextField(15);		
		txtPassword = new JPasswordField(15);
		
		//Instanciar el evento test_password
		test_password miEvento = new test_password();
		
		//luego de iniciar txtPassword lo pondremos a la escucha, pasamos una instancia miEvento pertenece a test_password
		txtPassword.getDocument().addDocumentListener(miEvento);
		
		//Agregar etiquetas y campos en la lamina superior que es un grid
		lamina_superior.add(lblUsuario);
		lamina_superior.add(txtUsuario);
		
		lamina_superior.add(lblPassword);
		lamina_superior.add(txtPassword);
		
		//Falta agregar el botón que queria agregar en la parte inferior de la lamina principal
		JButton btnEnviar = new JButton("Enviar");
		
		//Ahora lo agregamos a la lamina principal, recordar que estamos en el constructor de esta lamina, solo usar "add"
		add(btnEnviar, BorderLayout.SOUTH);
		
		//FALTA AGREGAR LA FUNCIONALIDAD, CREAR LA CLASE RECEPTORA DE LOS EVENTOS, luego instanciar la clase test_password
		//y poner al campo contraseña a la escucha
		
	}
	
	//CREAMOS UNA CLASE INTERNA QUE MANEJE ESOS EVENTOS
	private class test_password implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			char [] password;
			
			//Almacenamos en el array password cada uno de los caracteres que tiene la contraseña
			password = txtPassword.getPassword();
			
			if(password.length < 8 || password.length > 12) {
				txtPassword.setBackground(Color.GRAY);
			}else {
				txtPassword.setBackground(Color.WHITE);;
			}
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			char [] password;
			
			//Almacenamos en el array password cada uno de los caracteres que tiene la contraseña
			password = txtPassword.getPassword();
			
			if(password.length < 8 || password.length > 12) {
				txtPassword.setBackground(Color.GRAY);
			}else {
				txtPassword.setBackground(Color.WHITE);;
			}			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
}
