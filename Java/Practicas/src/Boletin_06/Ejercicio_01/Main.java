package Boletin_06.Ejercicio_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int [] numeros = new int[5];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce un numero: ");

			numeros[i] = Integer.valueOf(teclado.nextLine());
		}
		
		for (int a : numeros) {
			System.out.print(a);
		}
		System.out.println(" ");
		
		for (int i = numeros.length -1; i >= 0; i--) {
			System.out.print(numeros[i]);

		}
	}

}
