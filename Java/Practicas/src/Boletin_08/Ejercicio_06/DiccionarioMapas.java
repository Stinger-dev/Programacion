package Boletin_08.Ejercicio_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DiccionarioMapas {
	HashMap<String, List<String>> palabras;

	public DiccionarioMapas(String nombre) {
		this.palabras = new HashMap<String, List<String>>();

	}

	public void addPalabra(String palabra, String significado) {
		if (!this.palabras.containsKey(palabra)) {
			List<String> tmp = new ArrayList<>();
			tmp.add(significado);
			this.palabras.put(significado, tmp);
		} else {
			this.palabras.get(significado).add(significado);
		}
	}

	public String getSignificadosPalabra(String palabra) {
		StringBuilder resultado = new StringBuilder();
		if (this.palabras.get(palabra) != null) {
			for (String tmp : this.palabras.get(palabra)) {
				resultado.append(tmp).append("\n");
			}
		} else {
			resultado.append("No existe");
		}
		return resultado.toString();
	}

	public void rmPalabra(String palabra) {
		this.palabras.remove(palabra);
	}

}
