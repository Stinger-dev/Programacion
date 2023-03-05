package Boletin_06.Ejercicio_03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		double [] contadores = generarArrayContador();
 		System.out.println(Arrays.toString(contadores));
 		
 		System.out.println(getMedia(contadores)); //Media
 		System.out.println(getDigitoComun(contadores)); //Digito en el que mas numeros termi
 		System.out.println(getnoUsados(contadores));//Numeros en los que no termina ningun
		
 	}
	public static double[] generarArrayContador() {

		double[] contadores = new double[11]; //es de 11 pq ahi estara la media
		double numero, total = 0, nNumeros = 0;
		String num;
		
		do {
			System.out.print(" Indique un numero entre 1 y 1000:");
			num = teclado.nextLine();
			numero = Double.valueOf(num);
			
			if (numero >= 1 && numero <= 1000) {
				contadores[Character.getNumericValue(num.charAt(num.length()-1))]++;
				total += numero;
				nNumeros++;
			}	
		}while (numero >= 1 && numero <= 1000);
		contadores[10] = total/nNumeros;
		
		
		
		return contadores;
	}
	
	private static double getMedia(double[] vector) {
		/*la media esta en la ultima posicion en el caso de este vectro*/
		return vector[10];
	}
	private static double getDigitoComun(double[] vector) {
		/* se que el valor mas grande va a estar entre 0 y 9*/
		double max = -1, numMax = -1;
		for (int i = 0; i < vector.length-1; i++) {
			if (vector[i] >= max) {
				numMax = i;
				max = vector[i];
			}
		}
		return numMax;
		
	}
	private static String getnoUsados(double[] vector) {
		StringBuilder noUsados = new StringBuilder("Los numeros en los que no termina ninguna son: ");
		
		for (int i = 0; i < vector.length-1; i++ ) {
			if (vector[i] == 0) {
				noUsados.append(i);
				if (i != vector.length -2)
					noUsados.append(", ");
			}
		}
		
		return noUsados.toString();
	}
	

	}
	
	

