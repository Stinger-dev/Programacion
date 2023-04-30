package Boletin_03.Ejercicio_03;

import java.util.HashSet;
import java.util.Set;

public class Equipo<T> {

	private String nombreEquipo;
	private Set<T> plantilla;

	public Equipo(String nombre) {
		this.nombreEquipo = nombre;
		this.plantilla = new HashSet<>();

	}

	public String getNombreEquipo() {
		return this.nombreEquipo;
	}

	public void addAlumno(T alumno) throws ExceptionEquipo {
		if (!this.plantilla.add(alumno)) {
			throw new ExceptionEquipo("El Alumno ya esta añadido");
		}
	}

	public void rmAlumno(T alumno) throws ExceptionEquipo {
		if (!this.plantilla.remove(alumno)) {
			throw new ExceptionEquipo("El Alumno no existe");
		}
	}

	public Equipo<T> fusionarEquipo(Equipo<T> e1) {
		Equipo<T> resultado = new Equipo<>(e1.nombreEquipo + this.nombreEquipo);
		for (T tmp : e1.plantilla) {
				resultado.plantilla.add(tmp);

		}
		for (T tmp : this.plantilla) {
				resultado.plantilla.add(tmp);

		}
		return resultado;
	}

	public Set<T> getAlumnos() {
		return this.plantilla;
	}

	public T getAlumno(T alu) {
		return (this.plantilla.contains(alu)) ? alu : null;
	}

	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder();
		this.plantilla.forEach(tmp -> resultado.append(tmp.toString()).append("\n").append("--------").append("\n"));

		return resultado.toString();
	}

	public Equipo<T> equipoRepetidos(Equipo<T> e1) {
		Equipo<T> resultado = new Equipo<>(e1.nombreEquipo + this.nombreEquipo);
		for (T tmp : e1.plantilla) {
			if (this.plantilla.contains(tmp)) {
				resultado.plantilla.add(tmp);
			}
		}
		return resultado;
	}

}
