package Boletin_03.Ejercicio_02;

import static org.junit.jupiter.api.Assertions.*;

class Test {
	

	@org.junit.jupiter.api.Test
	void testRmAlumno() {
		Equipo resultado = new Equipo("erBeti");
		Alumno alu  =  new Alumno("a", "a", "asñjdg");
		try {
			resultado.addAlumno( alu);
		} catch (ExceptionEquipo e) {
			fail();
		}
		
		assert(resultado.getAlumnos().size()==1);
		try {
			resultado.rmAlumno(alu);
		} catch (ExceptionEquipo e) {
			fail();
		}
		assert(resultado.getAlumnos().isEmpty());
		
		try {
			resultado.rmAlumno(alu);
		} catch (ExceptionEquipo e) {
			assert(true);
		}
	}
	
	
	@org.junit.jupiter.api.Test
	void testEquipoRepetido()  {
		Equipo eq1 = new Equipo("erBeti");
		Alumno alu = new Alumno("a", "a", "asñjdg");
		Equipo eq2 = new Equipo("erSevilla");

		try {
			eq1.addAlumno( alu);
			eq2.addAlumno( alu);
			
		} catch (ExceptionEquipo e) {
			fail();
		}
		assert(eq1.getAlumnos().equals(Equipo.equipoRepetidos(eq1, eq2).getAlumnos()));
	}

}
