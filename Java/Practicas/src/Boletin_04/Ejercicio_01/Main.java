package Boletin_04.Ejercicio_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double ancho, longitud;

		System.out.println(" Añadir ancho:");
		ancho = Double.valueOf(teclado.nextLine());
		System.out.println(" Añadir longitud:");
		longitud = Double.valueOf(teclado.nextLine());
		Rectangulo ob1 = new Rectangulo();

		ob1.setAncho(ancho);
		ob1.setLongitud(longitud);

		System.out.println(ob1.getArea());
		System.out.println(ob1.getPerimetro());

	}
}
