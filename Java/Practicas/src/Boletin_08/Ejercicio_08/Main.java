package Boletin_08.Ejercicio_08;

public class Main {
	public static void main(String[] args) {
		Equipo eq = new Equipo("betis");
		Alumno alu = null;
		try {
			alu = new Alumno("ines", "rodri", "alkjf", 19, 'M', "Huelva");
			
			eq.addAlumno(alu);

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			alu = new Alumno("anes", "rodri", "aaq34", 19, 'M',"Sevilla");
			eq.addAlumno(alu);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			alu = new Alumno("Fran", "rodri", "adsfasdf", 17, 'H',"Malaga");
			eq.addAlumno(alu);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println(eq.esExclusivamenteFemenino());
		System.out.println(eq.getEdadMaximaFemenina());
		System.out.println(eq.getDniMasculinosMenorEdad());
		
		System.out.println(eq.getNombreChicasOrdenadasAlfabeticamente());
		System.out.println(eq.getNumeroCiudadesDistintas());
		
		
	}

}
