package Boletin_10.Geo.Primitivos;

import java.util.List;

import Boletin_10.Geo.ComparatorCantidadAlfabetico;

public class Country {
	private List<City> ciudades;
	private String nombrePais;
	private int id_pais;
	
	public Country(List<City> ciudades, String nombrePais, int id_pais) {
		super();
		ciudades.sort(new ComparatorCantidadAlfabetico());
		this.ciudades = ciudades;
		this.nombrePais = nombrePais;
		this.id_pais = id_pais;
		
	}
	
	private String generarStringCiudades() {
		StringBuilder resultado = new StringBuilder();
		
		for (City tmp : this.ciudades) {
			resultado.append(tmp.toString());
		}
		return resultado.toString();
	}

	@Override
	public String toString() {
		int sumaDireciones = 0;
		
		for (City tmp : this.ciudades) {
			sumaDireciones+=tmp.getDirecciones().size();
		}
		return String.format("%s con id %s y %s direcciones:\n %s", this.nombrePais, this.id_pais, sumaDireciones ,generarStringCiudades());
	}
	
	

	
	
	

}
