package Boletin_08.Ejercicio_02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class EquipoTest {
	
	@Test
	void testEquipoVacioAlPrincipio() {
		Equipo equipoA = new Equipo("betis");
		
		assertEquals(equipoA.getAlumnos().size(), 0);
 	}

	@Test
	void testAddAlumnoAtributosAumentaTamanio() {
		
		Equipo equipoA = new Equipo("betis");
		try {
			equipoA.addAlumno("JM", "Sevillano", "56565689M");
		} catch (Exception e) {
			System.out.println("salto exepcion");
		}
		
		assertEquals(1, equipoA.getAlumnos().size());
		
	}

	@Test
	void testAddAlumnoClaseAumentaTamanio() {
		Equipo equipoA = new Equipo("betis");
		Alumno alumno = new Alumno("JM", "Sevillano", "56565689M");
		try {
			equipoA.addAlumno(alumno);
			
		} catch (Exception e) {
			System.out.println("salto exepcion");
			
		}
		
		System.out.println(equipoA.toString());
		assertEquals(1, equipoA.getAlumnos().size());
		
	}

	
}
