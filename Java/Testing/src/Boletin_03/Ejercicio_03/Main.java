package Boletin_03.Ejercicio_03;

public class Main {

	public static void main(String[] args) {
		Equipo<Alumno> eq1 = new Equipo<>("Betis");

		try {
			eq1.addAlumno(new Alumno("fernando", "Fernandez", "12341234k"));
		} catch (Exception e) {
		}
		System.out.println(eq1.toString());

		Equipo<Integer> eq2 = new Equipo<>("Sevilla");

		try {
			eq2.addAlumno(1);
		} catch (Exception e) {
		}
		System.out.println(eq2.toString());

	}

}
