package Boletin_01;

import java.util.Scanner;

public class Ejercicio_08 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		float[] numeros = new float[15];

		for (int i = 0; i < 15; i++) {
			numeros[i] = Float.valueOf(teclado.nextLine());
		}

		float resultado = 0;

		for (float i : numeros) {
			resultado += i;
		}
		System.out.println(resultado);

	}
}
