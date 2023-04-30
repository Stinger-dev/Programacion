package Boletin_03.Ejercicio_02;

import java.util.HashSet;
import java.util.Set;

public class Equipo {

	private String nombreEquipo;
	private Set<Alumno> plantilla;

	public Equipo(String nombre) {
		this.nombreEquipo = nombre;
		this.plantilla = new HashSet<>();

	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void addAlumno(Alumno alumno) throws ExceptionEquipo {
		if (!this.plantilla.add(alumno)) {
			throw new ExceptionEquipo("El Alumno ya esta añadido");
		}
	}

	public void rmAlumno(Alumno alumno) throws ExceptionEquipo {
		if (!this.plantilla.remove(alumno)) {
			throw new ExceptionEquipo("El Alumno no existe");
		}
	}

	public static Equipo fusionarEquipo(Equipo e1, Equipo e2) {
		Equipo resultado = new Equipo(e1.nombreEquipo + e2.nombreEquipo);
		for (Alumno tmp : e1.plantilla) {
			resultado.plantilla.add(tmp);
		}
		for (Alumno tmp : e2.plantilla) {
			resultado.plantilla.add(tmp);

		}

		return resultado;
	}

	public Set<Alumno> getAlumnos() {
		return this.plantilla;
	}

	public Alumno getAlumno(Alumno alu) {
		return (this.plantilla.contains(alu)) ? alu : null;
	}

	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder();
		this.plantilla.forEach(tmp -> resultado.append(tmp.toString()).append("\n").append("--------").append("\n"));

		return resultado.toString();
	}

	public static Equipo equipoRepetidos(Equipo e1, Equipo e2) {
		Equipo resultado = new Equipo(e1.nombreEquipo + e2.nombreEquipo);

		for (Alumno tmp : e1.plantilla) {
			if (e2.plantilla.contains(tmp)) {
				resultado.plantilla.add(tmp);
			}
		}

		return resultado;
	}

}
