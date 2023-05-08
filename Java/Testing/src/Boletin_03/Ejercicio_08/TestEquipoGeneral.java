package Boletin_03.Ejercicio_08;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class TestEquipoGeneral {
	
	static Equipo generarEquipo(boolean todoMujeres, int edadExtra, boolean todoHombre) {
		/**
		 * Se se pasa un boolean se calcula todo femenino, si no, aleatorio
		 * Si se le pone una edad extra muy baja, todos seran menores
		 * Si al ultimo boolean se le pasa un positivo y al primero negativo, entonces seran todos hombres en caso de los dos true, todo mujeres
		 */
		Equipo salida = new Equipo("betisWeno");
		Random aleatorio = new Random();
		for (int i = 0; i< aleatorio.nextInt(8, 15); i++) {
			try {
				salida.addAlumno(new Alumno(String.valueOf(i+2), String.valueOf(i^2+1), String.valueOf((i+aleatorio.nextInt(3,20))^aleatorio.nextInt(3,100)), i+edadExtra, (aleatorio.nextBoolean() && !todoHombre || todoMujeres)? 'M': 'H' , String.valueOf(i*1+1)));
			} catch (ExceptionEquipo | AlumnoException e) {
			}
		}
		
		return salida;
	}
	
	private static Stream<Equipo> streamDeEquiposFemeninos() {
		return Stream.of(
				generarEquipo(true, 20, false), //femenino mayores de edad
				generarEquipo(true, 1, false),	//Femnino menores de edad
				generarEquipo(true, 8, false)	//femenino con algunas mayores			
				);
	}
	
	private static Stream<Equipo> streamDeEquiposMasculinos() {
		return Stream.of(
				generarEquipo(false, 20, true), //masculino mayores de edad
				generarEquipo(false, 0, true),	//masculino menores de edad
				generarEquipo(false, 8, true)	//masculino con algunas mayores			
				);
	}
	private static Stream<Equipo> streamDeEquiposFemeninosHayMayorEdad() {
		return Stream.of(
				generarEquipo(true, 20, false), //femenino mayores de edad
				generarEquipo(true, 12, false)	//femenino con algunas mayores			
				);
	}
	private static Stream<Equipo> streamDeEquiposFemeninosNoHayMayorEdad() {
		return Stream.of(
				generarEquipo(true, 1, false), //femenino mayores de edad
				generarEquipo(true, 2, false)	//femenino con algunas mayores			
				);
	}
	
	

	@ParameterizedTest
	@MethodSource("streamDeEquiposFemeninos")
	void testExclusivoFemenino(Equipo equi) {		
		assert(equi.esExclusivamenteFemenino());
	}
	
	@ParameterizedTest
	@MethodSource("streamDeEquiposMasculinos")
	void testExclusivoFemenino2(Equipo equi) {	
		assert(!equi.esExclusivamenteFemenino());
	}
	
	@ParameterizedTest
	@MethodSource("streamDeEquiposFemeninosHayMayorEdad")
	void testHayChicaMayorEdad(Equipo equi) {	
		assert(equi.esHayChicaMayorEdad());
	} 


}
