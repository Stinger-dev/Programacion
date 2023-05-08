package Boletin_03.Ejercicio_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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

	// -----------------------------PARTE NUEVA DEL EJERCICIO
	// -----------------------------
	public List<Alumno> getMasculinosMayorEdadOrdenadosEdad() {
		List<Alumno> tmp = new ArrayList<>();

		for (Alumno alu : this.plantilla) {
			if (alu.esMayorDeEdad() && alu.getSexo() == 'H') {
				tmp.add(alu);
			}

		}

		Collections.sort(tmp, new ComparatorEdadAlumno());

		return tmp;
	}

	public boolean esExclusivamenteFemenino() {
		boolean encontrado = this.plantilla.isEmpty(); // Busco a un masculino

		Iterator<Alumno> it = this.plantilla.iterator();

		while (it.hasNext() && !encontrado) {
			if (it.next().getSexo() == 'H') {
				// Hacinedolo asi mejoro un poco la cantidad que veces que se ejecuta el codigo,
				// pq en caso que el masculino sea el primero, se para
				encontrado = true;
			}
		}

		return !encontrado; // si hay un masculino entonces el equipo no es femenino
	}

	public int getNumeroFemeninoMayorEdad() {
		int nFemenino = 0;
		for (Alumno alu : this.plantilla) {
			if (alu.getSexo() == 'M' && alu.esMayorDeEdad()) {
				nFemenino++;
			}
		}
		return nFemenino;
	}

	public int getEdadMaximaFemenina() {
		/**
		 * en caso de que no haya mayores de edad, devolvera un -1
		 */
		int edadMax = -1;
		for (Alumno alu : this.plantilla) {
			if (alu.getSexo() == 'M' && alu.esMayorDeEdad() && alu.getEdad() > edadMax) {
				edadMax = alu.getEdad();
			}
		}
		return edadMax;
	}

	public Set<String> getDniMasculinosMenorEdad() {
		Set<String> resultado = new HashSet<>();
		for (Alumno alu : this.plantilla) {
			if (!alu.esMayorDeEdad() && alu.getSexo() == 'H') {
				resultado.add(alu.getDni());
			}
		}
		return resultado;
	}

	public List<String> getNombreChicasOrdenadasAlfabeticamente() {
		List<String> resultado = new ArrayList<>();
		for (Alumno alu : this.plantilla) {
			if (alu.getSexo() == 'M') {
				resultado.add(alu.getNombre());
			}
		}
		Collections.sort(resultado);
		return resultado;
	}

	public boolean esHayChicaMayorEdad() {
		boolean encontrado = this.plantilla.isEmpty();

		Iterator<Alumno> it = this.plantilla.iterator();

		while (it.hasNext() && !encontrado) {
			Alumno aluTmp = it.next();
			if (aluTmp.getSexo() == 'M' && aluTmp.esMayorDeEdad()) {
				encontrado = true;
			}
		}
		return encontrado;
	}

	public int getNumeroCiudadesDistintas() {
		Set<String> ciudades = new HashSet<>();
		for (Alumno alu : this.plantilla) {
			ciudades.add(alu.getCiudad());
		}
		return ciudades.size();
	}

}
