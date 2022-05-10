package usoabstract;

//Clase main para los objetos Pato, Gato, Perro

public class Granja {
	
	public static void main(String[] args) {
		Mascota [] misMascotas = new Mascota[4];
		misMascotas[0] = new Pato();
		misMascotas[1] = new Gato();
		misMascotas[2] = new Perro();
		misMascotas[3] = new Pato();
		
		for(Mascota m: misMascotas) {
			m.hablar();
		}
	}

}
