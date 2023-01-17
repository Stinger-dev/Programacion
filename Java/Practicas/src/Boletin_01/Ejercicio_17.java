package Boletin_01;

import java.util.Scanner;

public class Ejercicio_17 {

	public static void main(String[] args) {
		int n = 10;
		int[] ini = { 1, 1 };

		System.out.println("Cuantos numeros quieres:");
		n = Integer.valueOf(new Scanner(System.in).nextLine());
		System.err.println("Imprimiendolos");
		for (int i = 0; i < n; i++) {
			int a = ini[0], b = ini[1], c = a + b;

			System.out.println(ini[0]);
			ini[0] = b;
			ini[1] = c;

		}
	}

}
