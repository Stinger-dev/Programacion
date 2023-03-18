package Boletin_01;

import java.util.Scanner;

public class Ejercicio_11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float n = 1;
		while (n > 0) {
			System.out.print("Indique un numero:");
			n = Float.valueOf(teclado.nextLine());
			if (n > 0)
				System.out.printf("El cuadrado es %s \n", (n * n));
		}
		;
	}
}
