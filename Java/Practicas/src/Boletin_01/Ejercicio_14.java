package Boletin_01;

import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		float num, maxPares = Integer.MIN_VALUE, totalImpares = 0;
		int nImpares = 0, nTotal = 0;
		do {
			num = Float.valueOf(teclado.nextLine());
			if (num >= 0) {
				if (num % 2 != 0) {
					nImpares++;
					totalImpares += num;
				} else if (num > maxPares) {
					maxPares = num;
				}
				nTotal++;
			}
		} while (num > 0);

		System.out.printf(" La media de los impares es %s, el mayor de los pares es %s y el total de numeros es %s",
				totalImpares / nImpares, maxPares, nTotal);
	}

}
