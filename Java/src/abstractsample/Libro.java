package abstractsample;

//Clase Libro hereda de la clase Producto
public class Libro extends Producto {

	//CONSTRUCTOR ABSTRACTO DE LA CLASE PRODUCTO
	
	public Libro(String titulo, double precio, double costo) 
	{
		super(titulo, precio, costo);

	}

	//METODO ABSTRACTO HEREDADO DE LA CLASE PADRE
	public String imprimirDatos() 
	{
		return "Libro: "+ nombreProducto + "\tPrecio : $" + precioVenta;
	}

}
