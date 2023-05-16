package Examen160523;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class TestAntivirus {
	
	@ParameterizedTest
	@CsvSource({
				"400, false",
				"365, false",
				"364, true",
				"2, true"		
	})
	void testEsActivo(int dias, boolean esperado) {
		SoftwareAntivirus ob1 = new SoftwareAntivirus(2, LocalDate.now().minusDays(dias));
		assertEquals(esperado, ob1.esActivo());
	}
	
	@ParameterizedTest
	@CsvSource({
				"400, false",
				"366, false",
				"365, true",
				"2, true"		
	})
	void testEsActivoEnFecha(int dias, boolean esperado) {
		SoftwareAntivirus ob1 = new SoftwareAntivirus(2, LocalDate.now());
		assertEquals(esperado, ob1.esActivoEnFecha(LocalDate.now().plusDays(dias)));
	}
	@ParameterizedTest
	@ValueSource(ints = {400,366,365})
	void testCalcularDiasRestantesNoValidos(int dias) {
		SoftwareAntivirus ob1 = new SoftwareAntivirus(2, LocalDate.now().minusDays(dias));
		assertEquals(0, ob1.calcularDiasRestantesEnFecha(LocalDate.now()));		
	}
	
	@ParameterizedTest
	@ValueSource(ints = {364,200,300})
	void testCalcularDiasRestantesValidos(int dias) {
		SoftwareAntivirus ob1 = new SoftwareAntivirus(2, LocalDate.now().minusDays(dias));
		assertEquals(365-dias, ob1.calcularDiasRestantesEnFecha(LocalDate.now()));		
	}
	
	@ParameterizedTest
	@ValueSource(ints = {10,20,3})
	void testActivarLicenciaExcepcion(int restantes) {
		SoftwareAntivirus ob1 = new SoftwareAntivirus(restantes, LocalDate.now());
		assertEquals(restantes, ob1.licenciasRestantes());	
		try {
			for(int i = 0; i < restantes+1; i++) {
				ob1.activarLicencia();		
			}
			fail();
		} catch (AntivirusException e) {
			assert(true);
		}
	
	}
	
	@ParameterizedTest
	@ValueSource(ints = {20,2,30})
	void testLicenciasRestantesYActivarLicencia(int restantes) {
		/*
		 * En este test pruebo los casos positivos de activar licencia y de licencias restantes
		 */
		SoftwareAntivirus ob1 = new SoftwareAntivirus(restantes, LocalDate.now());
		assertEquals(restantes, ob1.licenciasRestantes());	
		try {
			ob1.activarLicencia();
		} catch (AntivirusException e) {
			fail();
		}
		assertEquals(restantes-1, ob1.licenciasRestantes());	
	
	}
	
	@ParameterizedTest
	@ValueSource(ints = {20,2,30})
	void testGenerarPaqueteCodigo(int cantidad) {
		/*
		 * En este test pruebo los casos positivos de activar licencia y de licencias restantes
		 */
		SoftwareAntivirus ob1 = new SoftwareAntivirus(0, LocalDate.now());

		assertEquals(cantidad, ob1.generarPaqueteDeCodigos(cantidad).size());
	
	}
	
	@Test
	void testGenerarLicenciaUso() {
		SoftwareAntivirus ob1 = new SoftwareAntivirus(0, LocalDate.now());
		String clave = ob1.generarCodigoLicenciaDeUso();
		assertEquals(5, clave.split("-").length);
		for (String valores : clave.split("-")) {
			assertEquals(5, valores.length());

		}
		
	}
	
	static String generarLicencia() {
		return new SoftwareAntivirus(0, LocalDate.now()).generarCodigoLicenciaDeUso();
	}
	
	
	private static Stream<String> streamGenerarLicencias(){
		return Stream.of(generarLicencia() ,generarLicencia() ,generarLicencia() );
	}
	
	@ParameterizedTest
	@MethodSource("streamGenerarLicencias")
	void testGenerarLicencia2(String licencia) {
		assertEquals(5, licencia.split("-").length);
		for (String valores : licencia.split("-")) {
			assertEquals(5, valores.length());
		}
	}
	

}
