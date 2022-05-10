package empleado;

@SuppressWarnings("unused")
public class Jefatura extends Empleado implements Jefes  {

	// Constructor de Empleado
	// Super hace la llamada al constructor padre
	public Jefatura(String nombre, double sueldo, int agno, int mes, int dia) {
		super(nombre, sueldo, agno, mes, dia);

	}
	
	//METODO HEREDADO DE LA INTERFAZ JEFES
	@Override
	public String tomarDecisiones(String decision) {
		return "Un miembro de la direccion a tomado la decision de: " + decision;
	}
	
	//METODO DE INTERFAZ TRABAJADORES
		@Override
		public double setBonus(double gratificacion) {
			double prima=2000;
			return Trabajadores.bonus_base+gratificacion+prima;
		}

	private double incentivo;

	// Metodo setter Incentivo
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	public double getSueldo() {

		// super.getSueldo() toma el metodo de la clase padre no este

		double sueldoJefe = super.getSueldo();
		return sueldoJefe + incentivo;

	}

	

	

}
