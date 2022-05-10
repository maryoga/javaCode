package polimorfismo;

public class Perro extends Animal {

	public Perro(String nombre, String color) {
		super(nombre, color);
	}
	
	@Override
	public void comer() {
		System.out.println("El perro esta comiendo");
	}
	
	@Override
	public void sonido() {
		System.out.println("El perro ladra");
	}
	

}
