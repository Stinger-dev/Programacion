package Boletin_10.Euromillones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		File datos = new File("C:\\Users\\gonza\\Desktop\\Informatica\\Daw\\Primero\\Programacion\\Codigo\\Java\\Practicas\\src\\Boletin_10\\Euromillones\\Assets\\Euromillones_2004_2023.csv");
		try {
			Scanner lector = new Scanner(datos);
			lector.nextLine();
			while (lector.hasNext()) {
				System.out.println(lector.nextLine());
				//lector.nextLine().split(","); es lo que voy a usar para añadir los datos a la clase despues
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
