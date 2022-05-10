package ejerciciospoo;

public class Libro {
	
	//CONSTRUCTOR CON PARAMETROS
	public Libro(String titulo, String autor, int ejemplares, int ePrestamos) {
		this.titulo=titulo;
		this.autor=autor;
		this.ejemplares=ejemplares;
		this.ePrestados=ePrestamos;
	}
	
	//DEFAULT CONSTRUCTOR
	public Libro() {
		
	}
	
	// METODOS SETTERS AND GETTERS
	
	//SET Titulo
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	//GET Titulo
	public String getTitulo() {
		return this.titulo;
	}
	
	//SET Autor
	public void setAutor(String autor) {
		this.autor=autor;
	}
	
	//GET Autor
	public String getAutor(){
		return this.autor;
	}
	
	//SET Ejemplares
	public void setEjemplares(int ejemplares) {
		this.ejemplares=ejemplares;
	}
	
	//GET Ejemplares
	public int getEjemplares() {
		return this.ejemplares;
	}
	
	//SET Ejemplares Prestados
	public void setEjemplaresPrestados(int ePrestados) {
		this.ePrestados=ePrestados;
	}
	
	//GET Ejemplares Prestados
	public int getEjemplaresPrestados() {
		return this.ePrestados;
	}
	
	
	//METODO PRESTAMO
	public boolean Prestamo() {
		
		boolean prestado=true;
		
		if(ePrestados<ejemplares)
		{
			ePrestados++;
		}else
		{
			prestado=false;
		}
		
		return prestado;
	}
	
	
	//METODO DEVOLUCION
	public boolean Devolucion() {
		
		boolean devuelto = true;
		
		if(ePrestados == 0)
		{
			devuelto = false;
		}else
		{
			ePrestados--;
		}
		
		return devuelto;
	}
	
	//METODO toString sobre-escrito para mostrar los datos de la clase Libro
	@Override
	public String toString() {
		return"titulo: " + this.titulo+ "\nautor: " + this.autor + 
				"\nejemplares: " + this.ejemplares + "\nprestados: " + this.ePrestados;
	}
	
	//CAMPOS DE CLASE
	private String titulo;
	private String autor;
	private int ejemplares;
	private int ePrestados;

}
