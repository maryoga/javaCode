package usoabstract;

//La clase perro hereda de la clase Mascota
public class Perro extends Mascota {
	
	//Implementacion del metodo abstracto hablar, heredado de la clase padre
	public void hablar() {
		System.out.println("Woof!");
	}

}
