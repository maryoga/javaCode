package ejerciciosddr1;

/**
 * @author Francisco Ramirez
 *
 */
public class Libro {
	
	private int ISBN;
	private String titulo;
	private String autor;
	private int numPaginas;
	
	public Libro(int ISBN, String titulo, String autor, int numPaginas) {
		
		this.ISBN=ISBN;
		this.titulo=titulo;
		this.autor=autor;
		this.numPaginas=numPaginas;
	}
	
	// ##GETTERS AND SETTERS ##

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	//METODO PARA IMPRIMIR TODA LA INFORMACION EN UNA CADENA DE TIPO STRING
	@Override
	public String toString() {
		return"El Libro: " + this.titulo + " con ISBN: " + this.ISBN + " creado por el autor: " +
				this.autor + " tiene un numero de paginas: " + this.numPaginas;
	}
	
	//METODO PARA COMPARA EL NUMERO DE PAGINAS
	public static String compareNumPag(Libro libro1 , Libro libro2) {
		
		if(libro1.getNumPaginas() > libro2.getNumPaginas()) {
			return "El libro : " + libro1.getTitulo() +  ", tiene mas paginas.";
		}
		else {
			return "El libro: " + libro2.getTitulo() + ", tiene mas paginas";
		}
	}
}
