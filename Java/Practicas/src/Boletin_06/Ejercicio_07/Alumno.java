package Boletin_06.Ejercicio_07;

public class Alumno {
	private String nombre;
	private double nota;

	public Alumno(String nombre, double nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}

	public boolean esAprobado(double notaMinima) {
		return this.nota >= notaMinima;
	}

	public double getNota() {
		return this.nota;
	}

	@Override
	public String toString() {
		return nombre + ", nota=" + nota;
	}

}
