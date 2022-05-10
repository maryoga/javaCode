package graficos;

import java.awt.event.*;

import javax.swing.*;

public class Varios_Oyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Principal miMarco = new Marco_Principal();		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class Marco_Principal extends JFrame{
	
	public Marco_Principal() {
		setTitle("Prueba varios");
		setBounds(600, 300, 300, 200);
		Lamina_Principal lamina = new Lamina_Principal();
		add(lamina);
	}
}

class Lamina_Principal extends JPanel{
	
	public Lamina_Principal() {
		JButton btnNew = new JButton("Nuevo");
		add(btnNew);
		
		btnClose = new JButton("Cerrar");
		add(btnClose);
		
		OyenteNuevo miOyente = new OyenteNuevo();
		
		btnNew.addActionListener(miOyente);
		
	}
	
	//clase interna
	private class OyenteNuevo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			frmEmergente marco = new frmEmergente(btnClose);
			
			marco.setVisible(true);
		}
		
	}
	
	JButton btnClose;
}

class frmEmergente extends JFrame{
	
	public frmEmergente(JButton btnCierraTodo) {
		
		cont++;
		setTitle("Ventana " + cont);
		
		setBounds(40*cont, 40*cont, 300, 150);
		
		closeAll oyenteCerrar = new closeAll();
		
		btnCierraTodo.addActionListener(oyenteCerrar);
		
	}
	
	private class closeAll implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			dispose();
			cont = 0;
			
		}
		
		
	}
	
	private static int cont = 0;
	
}
