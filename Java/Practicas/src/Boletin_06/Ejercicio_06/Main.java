package Boletin_06.Ejercicio_06;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static final String ABC = "abcdefghijklmnñopqrstuvwxyz";
	public static int[] contadores = new int[27];
	
	public static void main(String[] args) {
		System.out.println(" Indique la frase: ");
		Scanner teclado = new Scanner(System.in);
		String frase =  teclado.nextLine();
		frase = frase.replace(" ", "");
		
		for (char letra: frase.toLowerCase().toCharArray()) {
			contadores[ABC.indexOf(letra)]++;
		}
		
		for (int i = 0; i< ABC.length(); i++) {
			if (contadores[i] > 0)
				System.out.printf("%s, %s \n", ABC.charAt(i), contadores[i]);
		}
		
	}

}
