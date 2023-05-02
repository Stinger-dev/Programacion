package Boletin_08.Ejercicio_08;

import java.util.Objects;

public class Alumno {

	private String nombre;
	private String apellido;
	private String dni;
	private int edad;
	private char sexo;
	private String ciudad;

	public Alumno(String nombre, String apellido, String dni, int edad, char sexo, String ciudad)
			throws AlumnoException {
		if (ciudad != null && !ciudad.trim().isEmpty() && edad > 0 && edad < 100 && apellido != null
				&& !apellido.trim().isEmpty() && (sexo == 'H' || sexo == 'M') && dni != null && !dni.trim().isEmpty()
				&& nombre != null && !nombre.trim().isEmpty()) {
			this.dni = dni;
			this.nombre = nombre;
			this.apellido = apellido;
			this.sexo = sexo;
			this.edad = edad;
			this.ciudad = ciudad;
		} else {
			throw new AlumnoException("Error con los datos del alumno");
		}
	}

	public String getCiudad() {
		return ciudad;
	}

	public int getEdad() {
		return edad;
	}

	public boolean esMayorDeEdad() {
		return this.edad >= 18;
	}

	public char getSexo() {
		return sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return String.format("%s %s y dni %s", this.nombre, this.apellido, this.dni);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		if (!esIgual && obj != null && obj instanceof Alumno) {
			Alumno casteado = (Alumno) obj;

			esIgual = this.dni.equals(casteado.dni);
		}
		return esIgual;
	}

}
