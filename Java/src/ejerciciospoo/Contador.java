package ejerciciospoo;

public class Contador {
	
	//CONSTRUCTOR DEFAULT
	public Contador() {
		
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public Contador(int cont) {
		if(cont < 0)
		{
			this.cont=0;
		}else
		{
			this.cont=cont;
		}
	}
	
	//CONSTRUCTOR COPIA
	public Contador (final Contador e) {
		this.cont=e.cont;
	}
	
	//SET cont
	public void setCont(int cont) {
		if(cont<0) 
		{
			this.cont=0;
		}else 
		{
			this.cont=cont;
		}
	}
	
	//GET cont
	public int getCont() {
		return this.cont;
	}
	
	//METODO INCREMENTAR CONTADOR
	public void incrementar() {
		cont++;
	}
	
	//METODO DECREMENTAR CONTADOR
	public void decrementar() {
		cont--;
		if(cont<0)
		{
			this.cont=0;
		}
	}
	
	
	//CAMPOS DE CLASE
	private int cont;
	
}
