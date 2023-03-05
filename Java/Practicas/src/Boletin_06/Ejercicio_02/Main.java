package Boletin_06.Ejercicio_02;

import java.util.Scanner;

public class Main {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		int [] vector = generarVector(4);
		
		mostrarVector(vector);
		mostrarVector(desplazarDerecha(vector));

	}
	
	
	
	
	public static void mostrarVector(int[] vector) {
		System.out.print("[");

		for (int a: vector ) {
			System.out.print(a);
			System.out.print(",");		
		}
		System.out.print("]");
	}
	
	public static int[] generarVector(int tamagno) {
		int[] vector = new int [tamagno] ;
		for (int i = 0; i<vector.length; i++) {
			System.out.printf("Introduce el número en la posición (%s/%s): ", i+1,vector.length );
			vector[i] = Integer.valueOf(teclado.nextLine());
		}
		return vector;
	}
	
	public static int[] desplazarDerecha(int[] vector) {
		int tmp1;
		tmp1=vector[vector.length-1];
		
		
        for(int i=vector.length-1; i>0; i--){
        	vector[i]=vector[i-1];
        }
        vector[0]=tmp1;
        return vector;
	}
}
