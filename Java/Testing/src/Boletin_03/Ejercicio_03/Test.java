package Boletin_03.Ejercicio_03;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void testEquipoRepetido() {
		Equipo<Integer> eq1 = new Equipo<>("erBetisNumeros");
		Equipo<Integer> eq2 = new Equipo<>("er silla numeros");
		Integer num = 10;
		try {
			eq1.addAlumno(num);
			eq2.addAlumno(num);
		} catch (ExceptionEquipo e) {
			fail();
		}

		assert (eq1.getAlumnos().equals(eq1.equipoRepetidos(eq2).getAlumnos()));

	}

	@org.junit.jupiter.api.Test
	void testFusionarEquipos() {
		Equipo<Integer> eq1 = new Equipo<>("erBetisNumeros");
		Equipo<Integer> eq2 = new Equipo<>("er silla numeros");
		Equipo<Integer> resultado = new Equipo<>("Lo que deberia dar");
		Integer num = 10;
		Integer num2 = 20;
		try {
			eq1.addAlumno(num);
			eq2.addAlumno(num2);

			resultado.addAlumno(num);
			resultado.addAlumno(num2);
		} catch (ExceptionEquipo e) {
			fail();
		}

		assert (resultado.getAlumnos().equals(eq1.fusionarEquipo(eq2).getAlumnos()));

	}

}
