package Boletin_10.Ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
/*
		Fichero fiche = null;
		try {
			fiche = new Fichero(
					"C:\\Users\\gonza\\Desktop\\Informatica\\Daw\\Primero\\Programacion\\Codigo\\Java\\Practicas\\src\\Boletin_10\\Ficheros\\Assets");
			// No vale esta en tu pc
			System.out.println(fiche.toString());

			System.out.println(fiche.getTexto());
		} catch (Exception e) {
			System.out.println("Ha salido mal");
		}

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		

		try {
			fiche = new Fichero(
					"C:\\Users\\gonza\\Desktop\\Informatica\\Daw\\Primero\\Programacion\\Codigo\\Java\\Practicas\\src\\Boletin_10\\Ficheros\\Assets\\Test.txt");
			// No vale esta en tu pc
			System.out.println(fiche.toString());

			System.out.println(fiche.getTexto());
		} catch (Exception e) {
			System.out.println("Ha salido mal");
		}
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		
		try {
			fiche = new Fichero(
					"C:\\Users\\gonza\\Desktop\\Informatica\\Daw\\Primero\\Programacion\\Codigo\\Java\\Practicas\\src\\Boletin_10\\Ficheros\\Assets\\Test.txt");
			// No vale esta en tu pc


			System.out.println(fiche.getTexto2());
		} catch (Exception e) {
			System.out.println("Ha salido mal");
		}

		*/
		
		try {
			File ficherito = new File("C:\\Users\\gonza\\Desktop\\Informatica\\Daw\\Primero\\Programacion\\Codigo\\Java\\Practicas\\src\\Boletin_10\\Ficheros\\Assets\\test2.txt");
			ficherito.createNewFile();
			FileWriter writer = new FileWriter(ficherito);
			PrintWriter printer = new PrintWriter(writer);
			printer.println("akjdfasd,f");
			printer.println("asdfbzxfcvzxcvzxcv");
			
			printer.println("asdfbzxfcvzxcvzxcv");
			
			
			printer.close();
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}
}
