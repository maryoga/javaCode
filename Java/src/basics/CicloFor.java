package basics;

public class CicloFor {
	
	public static void main(String[] args) {
		
		//For
		String name = "Francisco";
		for (int i = 0; i < name.length(); i++) {
		    System.out.println(name.charAt(i));
		}
		
		
		System.out.println();
		
		//For-each
		String[] frutas = new String[] {"Manzana", "Pera", "Limon", "Guanabana"};
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
	}

}
