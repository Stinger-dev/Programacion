package Boletin_06.Ejercicio_08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Refranes ob1 = new Refranes();
		System.out.println(ob1.guardarRefran(new Refran("1")));
		System.out.println(ob1.guardarRefran(new Refran("2")));
		System.out.println(ob1.guardarRefran(new Refran("3")));
		System.out.println(ob1.guardarRefran(new Refran("4")));
		System.out.println(ob1.guardarRefran(new Refran("5")));

		
		System.out.println(ob1.toString());
		
		menu(ob1);

	}
	public static void menu(Refranes refranes) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("1. Guardar refran\n"
							+ "2.Buscar por palabra\n"
							+ "3.Listar Refranes\n"
							+ "4.Salir\n"
							+ "Teclee la opcion:");
		String opcion = teclado.nextLine()	;
		switch (opcion) {
		case "1":
			System.out.println("Escriba el refran:");
			String text = teclado.nextLine();
			if (refranes.guardarRefran(new Refran(text))) {
				System.out.println("añadido");
			}else {
				System.out.println("no se pudo añadir");
			}
			
			menu(refranes);
			break;
		case "2":
			
			
			menu(refranes);
			break;
		case "3":
			System.out.println(refranes.toString());
			
			menu(refranes);
			break;
			
		case "4":
			System.out.println("saliendo");
			break;

		default:
			menu(refranes);
			break;
		}

		
	}
	//ToDO: buscar por palabra llamando al metodo de la clase refran y haciendo un bucle con un for con condicional

}
