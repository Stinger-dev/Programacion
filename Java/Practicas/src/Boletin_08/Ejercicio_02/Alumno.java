package Boletin_08.Ejercicio_02;

import java.util.Objects;

public class Alumno {

	private String nombre;
	private String apellido;
	private String dni;
	
	public Alumno(String nombre,String apellido, String dni) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s y dni %s", this.nombre,this.apellido, this.dni);
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
