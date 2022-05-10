package arreglos;

public class Multidimencional {

	public static void main(String[] args) {
		
		//Declarando array multidimencional
		int [][] k = new int[3][5]; //filas:columnas
		
		k[1][3] = 28; //fila 1 : columna 3 = 28
		
		//Agregando valores a la primer fila
		k[0][0]=1;
		k[0][1]=2;
		k[0][2]=3;
		k[0][3]=4;
		k[0][4]=5;
		
		//Agregando valores a la segunda fila
		k[1][0]=25;
		k[1][1]=26;
		k[1][2]=27;
		
		k[1][4]=29;
		
		//Agregando valores a la tercer fila
		k[2][0]=1;
		k[2][1]=2;
		k[2][2]=3;
		k[2][3]=4;
		k[2][4]=5;
		
		//RECORRER UN ARRAY MULTIDIMENCIONAL
		for(int [] n:k) //recorre la primer dimension
			for(int p : n)
				System.out.println("Valor = " + p + " \n");
		
		
	}

}
