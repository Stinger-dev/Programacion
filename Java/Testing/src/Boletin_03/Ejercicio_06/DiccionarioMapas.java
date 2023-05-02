package Boletin_03.Ejercicio_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiccionarioMapas {
	HashMap<String, Set<String>> palabras;

	public DiccionarioMapas() {
		this.palabras = new HashMap<>();

	}

	public void addPalabra(String palabra, String significado) {
		if (!this.palabras.containsKey(palabra)) {
			this.palabras.put(significado, new HashSet<>());
		}
		this.palabras.get(significado).add(significado);
	}

	public String getSignificadosPalabra(String palabra) {
		StringBuilder resultado = new StringBuilder();
		if (palabra != null && this.palabras.containsKey(palabra)) {
			for (String tmp : this.palabras.get(palabra)) {
				resultado.append(tmp).append("%n");
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
