package Boletin_04.Ejercicio_04;

import java.util.Scanner;

public class Main {
	public static Scanner teclado = new Scanner(System.in);

	public static void main (String[] args) {
		menu();
	}
	
	public static void menu() {
		System.out.println("1. Sumar complejos\n"
						 + "2. Restar complejos\n"
						 + "3. Multiplicar complejos\n"
						 + "4. Dividir complejos\n"
						 + "5. Salir");
		String opcion = teclado.nextLine();
		
		switch (opcion.toUpperCase()) {
		case "1":
			System.out.println(sumar().toString());
			
			menu();
			break;
		case "2":
			System.out.println(restar().toString());

			menu();
			break;
		case "3":
			System.out.println(multiplicar().toString());

			menu();
			break;
		case "4":
			System.out.println(dividir().toString());

			menu();
			break;
			
		case "5":
			System.out.println("Saliendo...");
			break;

		default:
			menu();
			break;
		}
	}
	
	public static Complejo multiplicar() {
		float a,b,c,d;
		Complejo ob1, ob2;
		System.out.println("Indique la parte reaal del primer complejo: ");
		a = Float.valueOf(teclado.nextLine());
		System.out.println("Indique la parte imaginaria del segundo complejo");
		b = Float.valueOf(teclado.nextLine());
		System.out.println("Indique la parte real del segundo complejo:");
		c = Float.valueOf(teclado.nextLine());
		System.out.println("Indique la parte imaginaria del segundo complejo");
		d = Float.valueOf(teclado.nextLine());
		ob1 = new Complejo (a,b);
		ob2 = new Complejo(c, d);
		return ob1.dividir(ob2);
	}
	public static Complejo dividir() {
		float a,b,c,d;
		Complejo ob1, ob2;
		System.out.println("Indique la parte real del primer complejo: ");
		a = Float.valueOf(teclado.nextLine());
		System.out.println("Indique la parte imaginaria del segundo complejo");
		b = Float.valueOf(teclado.nextLine());
		System.out.println("Indique la parte real del segundo complejo:");
		c = Float.valueOf(teclado.nextLine());
		System.out.println("Indique la parte imaginaria del segundo complejo");
		d = Float.valueOf(teclado.nextLine());
		ob1 = new Complejo (a,b);
		ob2 = new Complejo(c, d);
		return ob1.multiplicar(ob2);
	}
	
	public static Complejo sumar() {
		float a,b,c,d;
		Complejo ob1, ob2;
		System.out.println("Indique la parte reaal del primer complejo: ");
		a = Float.valueOf(teclado.nextLine());
		System.out.println("Indique la parte imaginaria del segundo complejo");
		b = Float.valueOf(teclado.nextLine());
		System.out.println("Indique la parte real del segundo complejo:");
		c = Float.valueOf(teclado.nextLine());
		System.out.println("Indique la parte imaginaria del segundo complejo");
		d = Float.valueOf(teclado.nextLine());
		ob1 = new Complejo (a,b);
		ob2 = new Complejo(c, d);
		return ob1.sumar(ob2);
	}
	public static Complejo restar() {
		float a,b,c,d;
		Complejo ob1, ob2;
		System.out.println("Indique la parte reaal del primer complejo: ");
		a = Float.valueOf(teclado.nextLine());
		System.out.println("Indique la parte imaginaria del segundo complejo");
		b = Float.valueOf(teclado.nextLine());
		System.out.println("Indique la parte real del segundo complejo:");
		c = Float.valueOf(teclado.nextLine());
		System.out.println("Indique la parte imaginaria del segundo complejo");
		d = Float.valueOf(teclado.nextLine());
		ob1 = new Complejo (a,b);
		ob2 = new Complejo(c, d);
		return ob1.restar(ob2);
	}
	
}