package Boletin_10.Geo;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import Boletin_10.Geo.Primitivos.Country;

public class Main {
	public static void main(String[] args) {

		String urlBase =  ".\\src\\Boletin_10\\Geo\\Assets\\"; //Esto creo que se podria usar para agilizar el cambiar esto
		
		try {
			Geografia ob1 = new Geografia(urlBase+"address.txt", urlBase+"city.txt", urlBase+"country.txt");
			System.out.println(ob1.generarListaPaises());
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        
 

	}
}
