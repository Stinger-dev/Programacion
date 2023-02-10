package Boletin_03;

public class Ejercicio_10 {

	public static void main(String[] args) {
		System.out.println(cifrarCha('z', 27));
		System.out.println(cifrarCadena("B", 2));
		System.out.println(codificacionPocaEficiencia("CASADO", "AAAABD"));
		System.out.println(codificacionPocaEficiencia("CASADO", "FDVDGR"));

	}

	public static char cifrarCha(Character ch, int desp) {
		String ABC = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		return ABC.charAt((ABC.indexOf((Character.toUpperCase(ch))) + desp) % 27);
	}

	public static String cifrarCadena(String cad, int desp) {
		StringBuilder cad_ = new StringBuilder();
		for (char i : cad.toCharArray()) {
			cad_.append(cifrarCha(i, desp));
		}
		return cad_.toString();
	}

	public static int codificacionPocaEficiencia(String palabra, String codigo) {

		boolean encontrado;

		int k = -1;
		do {
			k++;
			encontrado = (codigo.toUpperCase().equals(cifrarCadena(palabra, k))) ? true : false;

		} while (!encontrado && k < 27);

		return (k == 27) ? -1 : k;
	}

}
