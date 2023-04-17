package Boletin_08.Ejercicio_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Diccionario {
	private List<Palabra> palabras ;
	private String nombreDiccion;
	
	public Diccionario(String nombre) {
		this.nombreDiccion = nombre;
		this.palabras= new ArrayList<>();
	}	
	
	public void addPalabra(String palabra, String significado) {
		if(!this.palabras.contains(new Palabra(palabra))) {
			this.palabras.add(new Palabra(palabra,significado));
		}else {
		}
	}
	public String getNombreDiccion() {
		return nombreDiccion;
	}
	
	public String buscarSignificadosPalabra(String palabra) {
		String resultado = "La palabra no esta en este diccionario";
		int pos = this.palabras.indexOf(new Palabra(palabra));
		if (pos != -1) {
			resultado = this.palabras.get(pos).toString();
		}
		return resultado;
	}
	public void rmPalabra(String palabra) {
		this.palabras.remove(new Palabra(palabra));
	}
	public void ordenar() {
		this.palabras.sort(new ComparatorAlfebeticamente());
	}
	private  List<Palabra> getListaEmpiezanPor(String cadena) {
		List<Palabra> resultado = new ArrayList<>();
		for(Palabra tmp : this.palabras) {
			if(tmp.getPalabra().startsWith(cadena)) {
				resultado.add(tmp);
			}
		}
		return resultado;
	}
	
	public String getEmpiezanPor(String cadena) {
		StringBuilder resultado = new StringBuilder("No hay ninguna palabra que empieze por " + cadena);
		for (Palabra tmp : this.getListaEmpiezanPor(cadena)) {
			resultado.append(tmp.toString()).append("\n------------\n");
		}
		return resultado.toString();
	}
	
	
}
