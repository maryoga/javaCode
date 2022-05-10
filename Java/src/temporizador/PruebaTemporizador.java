package temporizador;
import javax.swing.JOptionPane;
import javax.swing.Timer;

//pildoras video 52

public class PruebaTemporizador{
	
	public static void main(String[] args) {
		
		DameLaHora listener = new DameLaHora();
		//ActionListener listener = new DameLaHora();
		
		Timer mitemporizador = new Timer(5000,listener);
		
		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null,"Pulsa aceptar para detener");
		System.exit(0);
	}

}
