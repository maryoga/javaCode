package polimorfismo;

public abstract class Animal {
	
	@SuppressWarnings("unused")
	private String nombre, color;
	
	public Animal(String nombre, String color) {
		this.nombre=nombre;
		this.color=color;
	}
	
	public abstract void comer();
	public abstract void sonido();
	

}
