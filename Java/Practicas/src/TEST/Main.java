package TEST;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Persona[] personas = new Persona[20];
		for (int i = 0; i < personas.length; i++) {
			personas[i] = new Persona(i);

		}
		LocalDateTime tmp1 = LocalDateTime.parse("2007-12-03T10:15:30");

		Arrays.sort(personas, new PersonasComparatorEdad());

		for (Persona perso : personas) {
			System.out.println(perso.getEdad());
		}

	}

}
