package Boletin_03;

public class Ejercicio_10 {

	public static final String ABC = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

	public static void main(String[] args) {
		System.out.println(cifrarCesar('z', 27));
		System.out.println(cifrarCesar("B", 2));
		System.out.println(obtenerNivelCifradoPocoEficiente("CASADO", "AAAABD"));
		System.out.println(obtenerNivelCifradoPocoEficiente("CASADO", "FDVDGR"));

	}

	public static char cifrarCesar(Character ch, int desp) {
		return ABC.charAt((ABC.indexOf((Character.toUpperCase(ch))) + desp) % ABC.length());
	}

	public static String cifrarCesar(String cad, int desp) {
		StringBuilder cad_ = new StringBuilder();
		for (char i : cad.toCharArray()) {
			cad_.append(cifrarCesar(i, desp));
		}
		return cad_.toString();
	}

	public static int obtenerNivelCifradoPocoEficiente(String palabra, String codigo) { // casi seguro que existe una
																						// manera manera mas eficiente
		boolean encontrado;
		int k = -1;// Cuenta el desplazamiento por la cadena
		do {
			k++;
			encontrado = (codigo.equalsIgnoreCase(cifrarCesar(palabra, k))) ? true : false;
		} while (!encontrado && k < ABC.length());
		return (k == ABC.length()) ? -1 : k;
	}
	// ToDo Encontrar un metodo para encontrar el numero mas rapido
	// Podria hacer lo mismo para char a char para y en cuanto uno no coincida
	// tirarlo
	// Un mismo contador para ambas, y si coinciden 2 , esa misma se prueba con el
	// general, si no coincide es que no esta pero los dos primeros si que estan
	// cifrados
	// Si coinciden todos simplemente coinciden y no tiene mucho mas

}

/**
 * cambios añadidos vistor en el maestro: Cambiado nombre de los metodos para
 * hacer sobrecarga y estandarizacion de los nombres de las variables Cambiado
 * ABC y ahora es variable global El modulo y el contador ahora depende del
 * tamaño de abc Cambiada la comparacion en "obtenerNivelCifradoPocoEficiente"
 * por un equalsignorecase
 * 
 */
