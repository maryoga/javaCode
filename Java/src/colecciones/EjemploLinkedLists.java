package colecciones;
import java.util.LinkedList;

public class EjemploLinkedLists {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		//List list2 = new LinkedList();
		//Collection list3 = new LinkedList();
		
		list.add("Jorge");//1
		list.add("Martha");//2
		list.add("Valeria");//3
		System.out.println(list);
		System.out.println(list.size());
		list.addFirst("Francisco"); //0
		list.addLast("Javier");//4
		System.out.println();
		System.out.println(list);
		System.out.println("El ultimo valor es: " + list.getLast()); //getLAST
		System.out.println();
		
		//Eliminar elemento list.remove(indice);
		
		list.clear(); //Limpiar toda la lista
		System.out.println("La lista contiene: " +list);
	}

}
