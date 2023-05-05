package Boletin_10.Euromillones;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Historial histo1 = new Historial();
		Combinacion ob1 = null;
		try {
			ob1 = new Combinacion(1, 3, 8, 9, 9, 10, 6);
			System.out.println(ob1.getMayorConsecutivo());
		} catch (CombinacionExeption e1) {
			e1.printStackTrace();
		}
		

		try {
			histo1.agnadirArchivo("C:\\Users\\gonza\\Desktop\\Informatica\\Daw\\Primero\\Programacion\\Codigo\\Java\\Practicas\\src\\Boletin_10\\Euromillones\\Assets\\Euromillones_2004_2023.csv");
			System.out.println(histo1.getDatosCuriosos());
			System.out.println(histo1.getNumerosMayorConsecutivo());
			System.out.println(histo1.getMaximoAciertosHistorico(ob1));
		} catch (HistorialException e) {
			e.printStackTrace();
		}
		
	
		

		
		

		

	}
	
	
	
	
}
