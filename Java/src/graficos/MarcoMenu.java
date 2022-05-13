package graficos;

import javax.swing.*;

public class MarcoMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuFrame miMarco = new MenuFrame();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MenuFrame extends JFrame{
	
	public MenuFrame() {
		
		setBounds(500, 300, 550, 400);
		
		MenuLamina miLamina = new MenuLamina();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class MenuLamina extends JPanel{
	
	public MenuLamina() {
		
		JMenuBar miBarra = new JMenuBar();
		
		JMenu archivo = new JMenu("Archivo");
		JMenu edicion = new JMenu("Edicion");
		JMenu herramientas = new JMenu("Herramientas");
		

		
		//agregar opciones a cada menu principal antes de agregar a la barra el menu
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardar_como = new JMenuItem("Guardar como");
		
		JMenuItem  cortar = new JMenuItem("Cortar");
		JMenuItem  copiar = new JMenuItem("Copiar");
		JMenuItem  pegar = new JMenuItem("Pegar");
		
		JMenuItem generales = new JMenuItem("Generales");
	
		//ahora decirle al prog en que Opcion de JMenu va cada JMenuItem creado usamos el metodo add que pertenece a la clase JMenu
		archivo.add(guardar);
		archivo.add(guardar_como);
		
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		//agregar un separador
		edicion.addSeparator();		
		
		//agregar el menu opciones
		JMenu opciones = new JMenu("Opciones");
		
		JMenuItem  opcion1 = new JMenuItem("Opcion1");
		JMenuItem  opcion2 = new JMenuItem("Opcion2");
		
		//agregamos las opciones del menu opciones
		opciones.add(opcion1);
		opciones.add(opcion2);	
		
		//agregar un menu que agrega otro menu, colgar de menu edicion el menu opciones
		edicion.add(opciones);
		
		herramientas.add(generales);
		
		miBarra.add(archivo);
		miBarra.add(edicion);
		miBarra.add(herramientas);
		
		add(miBarra);
		
		
		
		
	}
	
}
