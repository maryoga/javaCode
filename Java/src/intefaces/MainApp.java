package intefaces;

public class MainApp {
	

	public static void main(String[] args) {
		Auto auto1 = new Auto("Honda");
		Televisor tv = new Televisor("Samsung");
		Computadora pc = new Computadora("Lenovo");
		
		
		System.out.println();
		auto1.encender();
		auto1.apagar();
		
		tv.encender();
		tv.apagar();
		
		pc.encender();
		pc.apagar();
		
		System.out.println("\nPOLIMORFISMO DURO Y PURO: \n");
		//Crear objeto de tipo interfaz: POLIMORFISMO
		IOnOF obj = new Computadora("HP");
		
		obj.encender();
		obj.apagar();
	}

}
