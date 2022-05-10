package polimorfismo;

public class Vaca extends Animal{

	public Vaca(String nombre, String color) {
		super(nombre, color);
	}
	
	@Override
	public void comer() {
		System.out.println("La vaca come");
	}
	
	@Override
	public void sonido() {
		System.out.println("La vaca muje");
	}

}
