package basics;

/*
 * En este programa trabajaremos con la sentencia de control Switch
 * @author: Francisco Ramirez > @XXXKaos (GitHub)
 */

public class Switch {

	public static void main(String[] args) {

		int num = 1;
		String text = "numero desconocido";
		switch (num) {

		case 1:
			text = "numero uno";
			break;
		case 2:
			text = "numero dos";
			break;
		case 3:
			text = "numero tres";
			break;
		default:
			text = "numero desconocido";
			break;
		}
		
		System.out.println("texto: " + text);
	}

}
