package Boletin_03.Ejercicio_01;

import java.util.Arrays;

public class Ejercicio_01 {

	public static void main(String[] args) {
		String[] numeros = new String[20];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = String.valueOf(i);
		}
		System.out.println(Arrays.toString(numeros));

		System.out.println(Arrays.toString(reverse(numeros)));

		System.out.println(Arrays.toString(numeros));

	}

	protected static <T> T[] reverse(T[] arrayOriginal) {
		T[] tmp = arrayOriginal.clone();

		int k = tmp.length - 1;

		for (T tmp2 : arrayOriginal) {
			tmp[k--] = tmp2;
		}
		return tmp;

	}

}
