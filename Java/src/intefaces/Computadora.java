package intefaces;

public class Computadora implements IOnOF {

	@SuppressWarnings("unused")
	private String modelo;
	
	public Computadora(String modelo) {
		this.modelo=modelo;
	}
	
	@Override
	public void encender() {
		System.out.println("La computadora se enciende");
	}

	@Override
	public void apagar() {
		System.out.println("La computadora se apaga");
		
	}

}
