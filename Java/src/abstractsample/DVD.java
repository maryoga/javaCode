package abstractsample;

//Clase DVD que hereda de la clase Producto

public class DVD extends Producto{

	//CONSTRUCTOR ABSTRACTO HEREDADO DE LA CLASE PRODUCTO
	public DVD(String titulo, double precio, double costo) {
		super(titulo, precio, costo);
	}
	
	//METODO ABSTRACTO HEREDADO DE LA CLASE PRODUCTO
	public String imprimirDatos(){
		return "DVD: " + nombreProducto + "\tPrecio: $" + precioVenta;
	}

}
