package abstractsample;

public abstract class Producto {
	
	//Variables de instancia
	protected double precioVenta;
	protected double costoFabrica;
	protected String nombreProducto;
	
	
	//CONSTRUCTOR PRODUCTO
	
	public Producto(String nombreProducto, double precio, double costo) 
	{
		this.nombreProducto=nombreProducto;
		this.precioVenta=precio;
		this.costoFabrica=costo;
	}
	
	//METODO ABSTRACTO imprimirDatos();
	public abstract String imprimirDatos();
	
}
