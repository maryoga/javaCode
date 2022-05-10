package polimorfismo;

public class MainApp {
	
	public static void main(String[] args) {
		
		Animal animal;
		//Polimorfismo animal = perro
		animal=new Perro("Layka", "Pimienta");
		animal.comer();
		animal.sonido();
		System.out.println();
		
		//Polimorfismo animal = vaca
		animal= new Vaca("Tonta","Maribel");
		animal.comer();
		animal.sonido();
		System.out.println();
		
		/*
		System.out.println("### PERRO ###");
		Perro perro = new Perro("Max", "Cafe");
		perro.comer();
		perro.sonido();
		System.out.println("### VACA ###");
		Vaca vaca = new Vaca("Lola", "Pinta");
		vaca.comer();
		vaca.sonido();
		*/
		
	}

}
