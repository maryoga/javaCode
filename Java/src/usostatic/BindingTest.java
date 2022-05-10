package usostatic;

public class BindingTest {
	
	@SuppressWarnings({ "unused", "static-access" })
	public static void main(String[] args) {
		Padre p = new Padre();
		p.metodoEstatico();
		
		Hijo h = new Hijo();
		h.metodoEstatico();
	}

}
