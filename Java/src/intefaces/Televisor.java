package intefaces;

public class Televisor implements IOnOF {

	@SuppressWarnings("unused")
	private String modelo;
	
	public Televisor(String modelo) {
		this.modelo=modelo;
	}

	@Override
	public void encender() {
		System.out.println("El televisor se enciende");
		
	}

	@Override
	public void apagar() {
		System.out.println("El televisor se apaga");
		
	}

}
