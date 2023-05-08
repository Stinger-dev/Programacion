package Boletin_10.Geo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Boletin_10.Geo.Primitivos.Address;
import Boletin_10.Geo.Primitivos.City;
import Boletin_10.Geo.Primitivos.Country;


public class Geografia {
	private File ficheroDirecciones;
	private File ficheroCiudades;
	private File ficheroPais;

	
	private String urlDirecciones;
	private String urlCiudades;
	private String urlPais;
	public Geografia(String urlDirecciones, String urlCiudades, String urlPais) throws Exception {
		super();
		this.urlDirecciones = urlDirecciones;
		this.urlCiudades = urlCiudades;
		this.urlPais = urlPais;
		
		this.ficheroCiudades = new File(urlCiudades);
		this.ficheroDirecciones = new File(urlDirecciones);
		this.ficheroPais = new File(urlPais);
		if(!this.ficheroCiudades.exists() || !this.ficheroDirecciones.exists() || !this.ficheroPais.exists()) {
			throw new Exception("No existen los archivos");
		}
		
	}
	
	public List<Address> generarListaDirecciones(int idCiudad){
		List<Address> resultado = new ArrayList<>();
		Scanner lector = null;
		try {
			lector = new Scanner(this.ficheroDirecciones);
		} catch (FileNotFoundException e) {
		}
		lector.nextLine();
		while (lector.hasNextLine()) {
			String[] tmp = lector.nextLine().split(",");
			if(tmp.length >= 5 && Integer.valueOf(tmp[4]) == idCiudad) {
				resultado.add(new Address(Integer.valueOf(tmp[0]), tmp[1], tmp [3]));
			}	
		}
		lector.close();
		return resultado;
		
	}	
	
	public List<City> generarListaCiudades(int idPais) {
		List<City> resultado = new ArrayList<>();
		Scanner lector = null;
		try {
			 lector = new Scanner(this.ficheroCiudades);
		} catch (FileNotFoundException e) {
		}
		lector.nextLine();
		while(lector.hasNext()) {
			String[] tmp = lector.nextLine().split(",");
			if(tmp.length >= 4 && Integer.valueOf(tmp[2]) == idPais) {
				resultado.add(new City(generarListaDirecciones(Integer.valueOf(tmp[0])), Integer.valueOf(tmp[0]), tmp[1]));		
			}
		}
		return resultado;
	}
	
	
	public List<Country> generarListaPaises() {
		List<Country> resultado = new ArrayList<>();
		Scanner lector = null;
		try {
			 lector = new Scanner(this.ficheroPais);
		} catch (FileNotFoundException e) {
		}
		lector.nextLine();
		
		while(lector.hasNext()) {
			String[] tmp = lector.nextLine().split(",");
			resultado.add(new Country(generarListaCiudades(Integer.valueOf(tmp [0])), tmp[1], Integer.valueOf(tmp [0])));	
		}
		
		return resultado;
		
	}
	
	
	
	
	
	

}
