package MockExam;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;




class TestMockExam {


	
	@ParameterizedTest
	@CsvSource({"alskdjhf,aksjdhf,29549757R,true",
				"qwerrqwe,qwerqwer,3214234, false",
				"alskdjhf,aksjdhf,29549757x,false",
				",adsfasdf,29549757R, false",
				"asdhfgbs,,29549757r,false",
				"qwerrqwe,qwerqwer,null, false",
				"qwerrqwe,qwerqwer,, false",
				"qwerrqwe,qwerqwer,2959757R, false",
				"alskdjhf,aksjdhf,295497579,false",		
				})
	void testValidadDatos1(String nombre, String apellido, String dni, boolean esperado) {
		Persona testedPersona = new Persona();
		assertEquals(esperado, testedPersona.validarDatos(nombre, apellido, dni));
				
	}
	
	@ParameterizedTest
	@CsvSource({"alskdjhf,aksjdhf,29549757R,20/10/2002,HOMBRE,true",
				"qwerrqwe,qwerqwer,3214234,20/10/2002,HOMBRE, false",
				"alskdjhf,aksjdhf,29549757x,20/10/2002,HOMBRE,false",
				",adsfasdf,29549757R,20/10/2002,HOMBRE, false",
				"asdhfgbs,,29549757r,20/10/2002,HOMBRE,false",
				"qwerrqwe,qwerqwer,null,20/10/2002,HOMBRE, false",
				"qwerrqwe,qwerqwer,,20/10/2002,HOMBRE, false",
				
				"qwerrqwe,qwerqwer,2959757R,20/10/2002,cvzx, false",
				"alskdjhf,aksjdhf,295497579,20/10/2002,HOMBRE,false",	
				"alskdjhf,aksjdhf,29549757R,20/10/3002,HOMBRE,false",
				"qwerrqwe,qwerqwer,3214234,20/10/2002,asdf, false",
				"alskdjhf,aksjdhf,29549757R,20/10/3002,HOMBRE,false",
	
				})
	void testValidadDatos2(String nombre, String apellido, String dni,String fechaNacimiento, String genero, boolean esperado) {
		LocalDate tmpFecha = LocalDate.parse(fechaNacimiento,  DateTimeFormatter.ofPattern("d/MM/yyyy"));
		
		Persona testedPersona = new Persona();
		assertEquals(esperado, testedPersona.validarDatos(nombre, apellido, dni, tmpFecha, genero));		
	}
	
	
	@ParameterizedTest
	@CsvSource({"10,false",
				"18,false",
				"19,true",
				"25,true",
				"30,false",
				"50,false"
				})
	void testBonoJocen(int edad, boolean esperado) {
		Persona testedPersona = new Persona("jeronimo", "medina", "29549757R", LocalDate.now().minusYears(edad),"HOMBRE");
		assertEquals(esperado, testedPersona.bonoJovenDisponible());		
	}
	
	
	@ParameterizedTest
	@ValueSource(ints = { 10, 29, 40, 20, 100 })
	void testGetEdad(int edad) {
		Persona testedPersona = new Persona("jeronimo", "medina", "29549757R", LocalDate.now().minusYears(edad),"HOMBRE");
		assertEquals(edad, testedPersona.getEdad());

	}
	
	@ParameterizedTest
	@CsvSource({"2040,20",
				"2080,60",
				"2024,4",
				"2023,3",
				})
	void testEdadPara(int year, int edadEsperado) {
		Persona testedPersona = new Persona("jeronimo", "medina", "29549757R", LocalDate.now().minusYears(3),"HOMBRE");
		assertEquals(edadEsperado, testedPersona.obtenerEdadPara(year));		
	}
	
	@ParameterizedTest
	@CsvSource({"qwerrqwe,qwerqwer,3214234,20/10/2002,HOMBRE, false",
				"alskdjhf,aksjdhf,29549757x,20/10/2002,HOMBRE,false",
				",adsfasdf,29549757R,20/10/2002,HOMBRE, false",
				"asdhfgbs,,29549757r,20/10/2002,HOMBRE,false",	
				})
	void testLanzaExcepcion1(String nombre, String apellido, String dni,String fechaNacimiento, String genero) {
		LocalDate tmpFecha = LocalDate.parse(fechaNacimiento,  DateTimeFormatter.ofPattern("d/MM/yyyy"));

		try {
			Persona p = new Persona(nombre, apellido, dni, tmpFecha, genero);
			fail();
		} catch (Exception e) {
			assert(true);
		}
	}
	
	@ParameterizedTest
	@CsvSource({"qwerrqwe,qwerqwer,3214234",
				"alskdjhf,aksjdhf,29549757x",
				"alskdjhf,aksjdhf,295497579",		
				})
	void testLanzaExcepcion2(String nombre, String apellido, String dni) {

		try {
			Persona p = new Persona(nombre, apellido, dni);
			fail();
		} catch (Exception e) {
			assert(true);
		}
	}
	
	
	
	
	

}
