package Boletin_07.Ejercicio_01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Baraja baraja = new Baraja();

		
		String opcion;
		double puntuacionJ = 0;
		
		do {
			System.out.println("1. Pedir carta. \n"
					+  "2. Plantarse. \n");
			opcion = teclado.nextLine();
			if (!opcion.equals("2")) {
				Carta tmp = baraja.getSiguiente();
				puntuacionJ+=tmp.getValor();
				System.out.println("Tu carta es un " + tmp.toString() + " con un valor de " + tmp.getValor() + ", llevas un acumulado de " + puntuacionJ);
			}
			
		}while (!opcion.equals("2"));
		
		double puntuacionB = 0;
		System.out.println("Turno de la banca");
		do {
			System.out.println("1. Pedir carta. \n"
					+  "2. Plantarse. \n");
			opcion = teclado.nextLine();
			if (!opcion.equals("2")) {
				Carta tmp = baraja.getSiguiente();
				puntuacionB+=tmp.getValor();
				System.out.println("Tu carta es un " + tmp.toString() + " con un valor de " + tmp.getValor() + ", llevas un acumulado de " + puntuacionB);
			}
			
		}while (!opcion.equals("2"));
		System.out.println((puntuacionJ > puntuacionB && puntuacionJ <= 7.5 && puntuacionB <= 7.5) || puntuacionB> 7.5 && puntuacionJ <=7.5? "Gano el jugador" : "Gano la banca" );


	}
	
	
	
	
}
