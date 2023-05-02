package Boletin_02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import Boletin_02.Persona;

class TestB02 {

	@ParameterizedTest
	@ValueSource(doubles = { 5, 10 })
	void testAprobado(double nota) {
		Persona ob1 = new Persona(nota);
		try {
			assert (ob1.estaAprobado());
		} catch (Exception e) {
			fail("no va");
		}
	}

	@ParameterizedTest
	@ValueSource(doubles = { 0, 4.9 })
	void testNoAprobado(double nota) {
		Persona ob1 = new Persona(nota);
		try {
			assertFalse(ob1.estaAprobado());
		} catch (Exception e) {
			fail("no va");
		}
	}

}
