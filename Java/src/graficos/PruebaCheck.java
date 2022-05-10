package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frmCheck miMarco = new frmCheck();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class frmCheck extends JFrame{
	
	public frmCheck() {
		
		setTitle("Probando JCheckBox");		
		setBounds(500, 300, 550, 350);			
		
		LaminaCheck miLamina = new LaminaCheck();		
		add(miLamina);
		
		//esta insruccion debe ir de ultimo, la tenia antes de def la lamina y no habia una salida correcta del frame
		setVisible(true);
	}
}

class LaminaCheck extends JPanel{
	
	//texto que aparecerá en la parte superior de la lamina
	private JLabel texto;
	
	private JCheckBox chkBold, chkCursive;
	
	private JPanel laminaTexto;
	
	private JPanel laminaChecks;
	
	
	public LaminaCheck() {
		
		//Definir la disposición de la lamina a BorderLayout()
		setLayout(new BorderLayout());
		
		//crear tipo de letra con sus caracteristicas, texto es plano porque no tiene ni negrita ni cursiva
		Font miLetra = new Font("Serif", Font.PLAIN, 24);
		
		texto = new JLabel("En un lugar de la mancha cuyo nombre... ");
		
		//establecemos el tipo de letra para el texto
		texto.setFont(miLetra);
		
		laminaTexto = new JPanel();
		
		laminaTexto.add(texto);
		
		add(laminaTexto, BorderLayout.NORTH);
		
		//crear las casillas de verificacion; negrita y cursiva respectivamente
		chkBold = new JCheckBox("Negrita");
		chkCursive = new JCheckBox("Cursiva");
		
		//poner los botones a la escucha de un evento del tipo ActionListener, para ponerlos a la escucha hay 
		//que instanciar la clase ManejaChecks
		chkBold.addActionListener(new ManejaChecks());
		chkCursive.addActionListener(new ManejaChecks());
		
		//ya los elem estan a la escucha, hay que crear la lamina donde iran esos elementos, que irá en la zona SOUTH
		laminaChecks = new JPanel();
		
		//agregar los check box a la lamina
		laminaChecks.add(chkBold);
		laminaChecks.add(chkCursive);
		
		//colocar la laminaChecks en la zona SOUTH
		add(laminaChecks, BorderLayout.SOUTH);
		
		//falt programa el manejo de los eventos, el metodo actionPerformed
		
	}
	
	//Crear una clase interna, se hace privada porque es una clase interna hay que encapsularla
	private class ManejaChecks implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int tipo = 0;
			
			//si Font.Bold = 1, Font.Cursive = 2. Si ambos checkbox estan seleccionados tipo = 3
			if(chkBold.isSelected()) tipo += Font.BOLD;
			
			if(chkCursive.isSelected()) tipo += Font.ITALIC;
			
			texto.setFont(new Font("Serif", tipo, 24));
			
		}		
	}
	
	
}