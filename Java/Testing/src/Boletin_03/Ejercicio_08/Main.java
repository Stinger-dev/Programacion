package Boletin_03.Ejercicio_08;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		/*
		Equipo eq = new Equipo("betis");
		Alumno alu = null;
		try {
			alu = new Alumno("ines", "rodri", "alkjf", 19, 'M', "Huelva");

			eq.addAlumno(alu);

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			alu = new Alumno("anes", "rodri", "aaq34", 19, 'M', "Sevilla");
			eq.addAlumno(alu);

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			alu = new Alumno("Fran", "rodri", "adsfasdf", 17, 'H', "Malaga");
			eq.addAlumno(alu);

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(eq.esExclusivamenteFemenino());
		System.out.println(eq.getEdadMaximaFemenina());
		System.out.println(eq.getDniMasculinosMenorEdad());

		System.out.println(eq.getNombreChicasOrdenadasAlfabeticamente());
		System.out.println(eq.getNumeroCiudadesDistintas());
		 */
		
		System.out.println(generarEquipo(false, 1, false).toString());

	}
		public static Equipo generarEquipo(boolean todoMujeres, int edadExtra, boolean todoHombre) {
			/**
			 * Se se pasa un boolean se calcula todo femenino, si no, aleatorio
			 * Si se le pone una edad extra muy baja, todos seran menores
			 * Si al ultimo boolean se le pasa un positivo y al primero negativo, entonces seran todos hombres en caso de los dos true, todo mujeres
			 */
			Equipo salida = new Equipo("betisWeno");
			Random aleatorio = new Random();
			for (int i = 0; i< aleatorio.nextInt(8, 15); i++) {
				try {
					salida.addAlumno(new Alumno(String.valueOf(i+2), String.valueOf(i^2+1), String.valueOf((i+aleatorio.nextInt(3,20))^aleatorio.nextInt(3,100)), i+edadExtra, (aleatorio.nextBoolean() && !todoHombre || todoMujeres)? 'M': 'H' , String.valueOf(i*1+1)));
				} catch (ExceptionEquipo | AlumnoException e) {
					e.printStackTrace();
				}
			}
			
			return salida;
		}

}
