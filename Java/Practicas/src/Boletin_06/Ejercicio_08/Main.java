package Boletin_06.Ejercicio_08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Refranes ob1 = new Refranes();
		ob1.guardarRefran(new Refran("perro ladrador"));
		ob1.guardarRefran(new Refran("tres tristes"));
		ob1.guardarRefran(new Refran("mas vale pajaro"));
		ob1.guardarRefran(new Refran("en abril"));
		ob1.guardarRefran(new Refran("dos te"));

		
		menu(ob1);
		
	}
	public static void menu(Refranes refranes) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("1. Guardar refran\n"
							+ "2. Buscar por palabra\n"
							+ "3. Listar Refranes\n"
							+ "4. Salir\n"
							+ "Tecle la opcion: ");
		String opcion = teclado.nextLine()	;
		switch (opcion) {
		case "1":
			System.out.println("Escriba el refran:");
			String text = teclado.nextLine();
			if (refranes.guardarRefran(new Refran(text))) {
				System.out.println("Añadido");
			}else {
				System.out.println("No se pudo añadir");
			}
			
			menu(refranes);
			break;
		case "2":
			System.out.println("Indique que palabra quiere buscar:");
			String palabra = teclado.nextLine();
			System.out.println(buscarPorPalabra(refranes, palabra));
			
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
	public static String buscarPorPalabra(Refranes refranes, String palabra) {
		int pos = refranes.buscarPorPalabra(palabra);
		return (pos != -1)? refranes.getRefranParticular(pos).toString() : "No existe" ;
	}
	
	
	

}
