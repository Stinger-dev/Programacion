package Boletin_01;

public class Ejercicio_18 {

	public static void main(String[] args) {

		System.out.println(calcularLongitudCirculo(5));

		System.out.println(calcularAreaCirculo(5));

	}

	public static double calcularAreaCirculo(float i) {
		return (3.14 * i * i);
	}

	public static double calcularLongitudCirculo(float i) {
		return (2 * 3.14 * i);
	}

}
