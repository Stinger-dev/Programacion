package Boletin_10.Ficheros;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
	
		Fichero fiche = null;
		try {
			 fiche = new Fichero("C:\\Users\\gonza\\Desktop\\Informatica\\Daw\\Primero\\Programacion\\Codigo\\Java\\Practicas\\src\\Boletin_10\\Ficheros\\Assets\\Test.txt");
			 //No vale esta en tu pc
		} catch (IOException e) {
			e.printStackTrace();
		}																	

		System.out.println(fiche.toString());
		
		System.out.println(fiche.getTexto());
		

		
	}
}
