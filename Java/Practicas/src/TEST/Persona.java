package TEST;

import java.time.LocalDate;

public class Persona {

	private static final int NOTA_MINIMA = 5;
	private double nota;
	private int edad;

	public Persona(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public boolean estaAprobado() throws Exception {
		boolean resultado;
		if (nota >= 0 && nota <= 10) {
			resultado = nota >= NOTA_MINIMA;
		} else {
			throw new Exception("No valida");
		}

		return resultado;

	}

}
