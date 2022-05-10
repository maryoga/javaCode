package temporizador;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DameLaHora implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Date time = new Date();
		System.out.println("Te doy la hora cada 5 segundos: " + time);
		Toolkit.getDefaultToolkit().beep();
	}

}
