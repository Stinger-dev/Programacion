package Boletin_07.Ejercicio_00;

import java.time.LocalDate;
import java.util.Scanner;


public class Main {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		

		
		Persona ob1 = new Persona("Gozalo", "callejas", "rojas", LocalDate.parse("2002-09-07") );
		
		cambiarPeso(ob1);
		
		cambiarNacion(ob1);
		
		cambiarSexo(ob1);
		
		

		
	}
	
	public static void cambiarPeso(Persona ob1) {
		System.out.println("Introduce el peso: ");
		try {
			Double peso = Double.valueOf(teclado.nextLine());

			ob1.setPeso(peso);
			System.out.println("exito");

		} catch (Exception e) {
			System.out.println("Erro al introducir peso");
			cambiarPeso(ob1);
		}
	}
	
	public static void cambiarSexo(Persona ob1) {
		System.out.println("Introduce el sexo: ");
		String tmp = teclado.nextLine();
		try {
			ob1.setSexo(tmp);
			System.out.println("exito");

		} catch (Exception e) {
			System.out.println("Erro al introducir sexo");
			cambiarSexo(ob1);
		}
	}
	
	public static void cambiarNacion(Persona ob1) {
		System.out.println("Introduce la nacion: ");
		String tmp = teclado.nextLine();
		try {
			ob1.setNacion(tmp);
			System.out.println("exito");

		} catch (Exception e) {
			System.out.println("Error al introducir la nacion");
			cambiarNacion(ob1);
		}
	}

}
