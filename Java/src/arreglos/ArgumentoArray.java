package arreglos;

public class ArgumentoArray {

	public static void main(String[] args) {

		int mayor, suma, menor;
		int[] nums = { 3, 4, 8, 2 }; // Array
		suma = sumar(nums);
		mayor=calcularMayor(nums);
		menor=calcularMenor(nums);
		System.out.println("El mayor es: " + mayor);
		System.out.println("El menor es: "+ menor);
		System.out.println("La suma es: " + suma);
	}

	// Metodo sumar los numeros
	static int sumar(int nums[]) {
		int s = 0;
		for (int i = 0; i < nums.length; i++) {
			s += nums[i];
		}
		return s;
	}

	// Metodo calcular el mayor
	static int calcularMayor(int nums[]) {
		int may = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > may) {
				may = nums[i];
			}
		}
		return may;
	}

	static int calcularMenor(int nums[]) {
		int men = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < nums.length) {
				men = nums[i];
			}
		}
		return men;
	}
	
	

}
