package Boletin_10.Geo;

import java.util.Arrays;
import java.util.List;

import Boletin_10.Geo.Primitivos.Country;

public class Main {
	public static void main(String[] args) {
		String urlBase = "C:\\Users\\gonza\\Desktop\\Informatica\\Daw\\Primero\\Programacion\\Codigo\\Java\\Practicas\\src\\Boletin_10\\Geo\\Assets\\";
		try {
			Geografia ob1 = new Geografia(urlBase+"address.txt", urlBase+"city.txt", urlBase+"country.txt");
			System.out.println(ob1.generarListaPaises());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
