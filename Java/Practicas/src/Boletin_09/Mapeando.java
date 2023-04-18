package Boletin_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Mapeando {

	/**
	 * Recibe una colección de personas y las agrupa por género
	 * 
	 * @param personas
	 * @return Mapa con la colección de personas clasificadas por género
	 */
	public static Map mapearPersonasPorGenero(Collection<Persona> personas) {
		HashMap<Genero, Set<Persona>> tmp = new HashMap<>();

		for (Persona persona : personas) {
			if (!tmp.containsKey(persona.getGenero())) {
				Set<Persona> tmpSet = new HashSet<>();
				tmpSet.add(persona);
				tmp.put(persona.getGenero(), tmpSet);
			} else {
				tmp.get(persona.getGenero()).add(persona);

			}
		}

		return tmp;
	}

	/**
	 * Recibe una colección de números y cuenta cuantas ocurrencias hay de cada uno
	 * de ellos creando un mapa en el que aparece cada número junto a su frecuencia
	 * de aparición
	 * 
	 * @param numeros
	 * @return Tabla de frecuencias de los números facilitados
	 */
	public static Map<Integer, Integer> contarNumeros(Collection<Integer> numeros) {
		HashMap<Integer, Integer> tmp = new HashMap<>();

		for (int numero : numeros) {
			if (!tmp.containsKey(numero)) {
				tmp.put(numero, 1);
			} else {
				tmp.put(numero, tmp.get(numero) + 1);

			}
		}

		return tmp;
	}

	/**
	 * Genera una lista de números aleatorios entre 0 y 20 del tamaño indicado
	 * 
	 * @param size tamaño de la lista
	 * @return lista de size números aleatorios
	 */
	public static Collection<Integer> generarNumerosAleatoriosEntre0y20(int size) {
		Random tmpob = new Random();
		List<Integer> numeros = new ArrayList<>() {
			{
				for (int i = 0; i < size; i++) {
					add(tmpob.nextInt(0, 20));
				}
			}
		};

		return numeros;
	}
}
