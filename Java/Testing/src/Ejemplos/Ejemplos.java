package Ejemplos;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;




class Ejemplos {
/*
 
 
  	@BeforeEach
	void setUp() {
		cosas que se hacen antes de cada cosa
	}
  
  
  
	@ParameterizedTest
	@CsvSource({"12,16,1,2,5",
				"40,4,1,3,3"
				})
	void testCalcularMaximoNumerosConsecutivos(int n1, int n2, int n3, int n4, int n5,
			int e1, int e2, int resultado) {
		try {
			Combinacion ob1 = new Combinacion(n1, n2, n3, n4, n5, e1, e2);

			assertEquals(resultado, ob1.getMayorConsecutivo());
		} catch (CombinacionExeption e) {
			assert(false);
		}
	}
	
	static Equipo generarEquipo(boolean todoMujeres, int edadExtra, boolean todoHombre) {
		Equipo salida = new Equipo("betisWeno");
		Random aleatorio = new Random();
		for (int i = 0; i< aleatorio.nextInt(8, 15); i++) {
			try {
				salida.addAlumno(new Alumno(String.valueOf(i+2), String.valueOf(i^2+1), String.valueOf((i+aleatorio.nextInt(3,20))^aleatorio.nextInt(3,100)),
				 i+edadExtra, (aleatorio.nextBoolean() && !todoHombre || todoMujeres)? 'M': 'H' , String.valueOf(i*1+1)));
			} catch (ExceptionEquipo | AlumnoException e) {
			}
		}
		
		return salida;
	}
java e
	
	private static Stream<Equipo> streamDeEquiposFemeninos() {
		return Stream.of(
				generarEquipo(true, 20, false), //femenino mayores de edad
				generarEquipo(true, 1, false),	//Femnino menores de edad
				generarEquipo(true, 8, false)	//femenino con algunas mayores			
				);
	}
	
	
		@ParameterizedTest
	@MethodSource("streamDeEquiposFemeninos")
	void testExclusivoFemenino(Equipo equi) {		
		assert(equi.esExclusivamenteFemenino());
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
	
	
	
	
	
	
	
*/
}
