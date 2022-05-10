package intefaces;

public class Auto implements IOnOF{

	@SuppressWarnings("unused")
	private String modelo;
	
	public Auto(String modelo) {
		this.modelo=modelo;
	}

	@Override
	public void encender() {
		System.out.println("El auto se enciende");
		
	}

	@Override
	public void apagar() {
		
		System.out.println("El auto se apaga");
	}
	
	

}
