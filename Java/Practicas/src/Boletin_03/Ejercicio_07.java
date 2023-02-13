package Boletin_03;

public class Ejercicio_07 {

	public static void main(String[] args) {

		System.out.println(estaEn("ashdfsdoflasdf", "hola"));
	}

	public static boolean estaEn(String cadena, String bus) {
		int k = 0;
		if (cadena != null && !cadena.isEmpty() && bus != null && !bus.isEmpty()) {
			
			for (int i = 0; i < cadena.length() && k < bus.length(); i++) {
				if (cadena.charAt(i) == bus.charAt(k)) {
					k++;
				}
			}
		}
		return bus!=null  && k == bus.length() && !bus.isEmpty() ;
	}
}
