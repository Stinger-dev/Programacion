package Boletin_10.Geo.Primitivos;

import java.util.List;

public class City {
	private List<Address> direcciones;
	private int id_ciudad;
	private String nombre_ciudad;
	public City(List<Address> direcciones, int id_ciudad, String nombre_ciudad) {
		super();
		this.direcciones = direcciones;
		this.id_ciudad = id_ciudad;
		this.nombre_ciudad = nombre_ciudad;
	}
	
	private String generarStringDirecciones() {
		StringBuilder resultado = new StringBuilder();
		
		for (Address tmp : this.direcciones) {
			resultado.append(tmp.toString());
		}
		return resultado.toString();
	}

	@Override
	public String toString() {
		return String.format("\t-%s con id %s y direcciones:\n %s", this.nombre_ciudad, this.id_ciudad, generarStringDirecciones());
	}

	public List<Address> getDirecciones() {
		return direcciones;
	}

	public int getId_ciudad() {
		return id_ciudad;
	}

	public String getNombre_ciudad() {
		return nombre_ciudad;
	}

	

}
